# Graphite

## Introduction

`Graphite` is a tool that leverages automatic code generation techniques for streamlining the development of hybrid graphical-textual [Sirius](https://eclipse.dev/sirius/)/[Xtext](https://eclipse.dev/Xtext/)-based DSL editors. Graphite can be applied when one uses EMF Ecore for the definition of the abstract syntax (the metamodel) of the DSL, Sirius for the definition of the graphical syntax ([Sirius Viewpoint Specification Model](https://eclipse.dev/sirius/doc/specifier/general/Specifying_Viewpoints.html)) of part(s) of the DSL and Xtext grammar(s) for the definition of the textual syntax of other part(s) of the DSL. Before using Graphite, one must extend the metamodel with annotations that declaratively define the textual syntax, by associating various string attributes with Xtext grammars. It is recommended to use [Eclipse Emfatic](https://eclipse.dev/emfatic/), a convenient textual syntax for EMF Ecore metamodels, for defining and annotating the metamodel.


## Requirements

- Java 17+
- [Eclipse Modeling Tools IDE](https://www.eclipse.org/downloads/packages/) >= 2022-12 (e.g.: [update site 1](https://download.eclipse.org/releases/2022-12), [update site 2](https://download.eclipse.org/releases/2023-12))
- [Eclipse Sirius](https://eclipse.dev/sirius/) >= 7.0.6 (e.g.: [base update site](http://download.eclipse.org/sirius/updates/releases/7.0.6/2021-06), [update sites list](https://wiki.eclipse.org/Sirius/Update_Sites))
- [Eclipse Xtext](https://eclipse.dev/Xtext/) >= 2.29 (e.g.: [update site](https://download.eclipse.org/modeling/tmf/xtext/updates/releases/2.36.0/))
- [Eclipse Epsilon](https://eclipse.dev/epsilon/) >= 2.5
- [Eclipse Emfatic](https://eclipse.dev/emfatic/download/)


## Setting up the Eclipse Modeling Tools IDE

For carrying out the installations, it is recommended to use "Help > Install New Software..." instead of the Eclipse Marketplace, to have full control of the versions to be installed. When carrying out the installations, the example update sites from above can be used. Ensure that the Sirius version you are installing is compatible with your Eclipse Modeling Tools IDE version. For example, Eclipse Modeling Tools 2022-12 comes packaged with a subset of Sirius 7.0.6, therefore, install the complete Sirius 7.0.6 to have full compatibility. Note that you can check "About Eclipse" to view the specific pre-installed version of Sirius. For installing Sirius and Xtext, it is recommended to use the update site of the Eclipse version you are using, e.g., when using Eclipse Modeling Tools 2022-12, you could install Sirius and Xtext using this update site: `https://download.eclipse.org/releases/2022-12`.

To install Graphite, go to the menu bar of Eclipse and click "Help > Install New Software...", then replace the contents of "Work with:" with `https://epsilonlabs.github.io/graphite/updates/` and press Enter. Once the `Graphite` category appears in the list, click on "Select All" and then "Next". It should then list that the `Graphite Feature` is going to be installed. Accept the terms of the Eclipse Public License, indicate that you trust the update site (as it is currently unsigned), and let Eclipse restart once prompted.

Optionally, install the [Graphical Modeling Framework (GMF)](https://projects.eclipse.org/projects/modeling.gmf-runtime), using the update site associated with your Eclipse IDE version, in case it is not already installed. Additionally, install [Apache Commons Logging](https://commons.apache.org/proper/commons-logging/), [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/) and [Apache Log4j](https://logging.apache.org/log4j/2.x/index.html) from [this update site](https://download.eclipse.org/tools/orbit/downloads/drops/R20230531010532/repository/), or other update sites, but only if they are not already installed in your Eclipse IDE and if they are required by your DSL projects.

## Quickstart Guide
### A) Trying out Graphite on the provided examples

This repository contains 4 examples of hybrid graphical-textual DSLs and their supporting editors in the [/languages](https://github.com/epsilonlabs/graphite/tree/main/languages) directory. After setting up the Eclipse Modeling Tools IDE, ensure that Eclipse Sirius and Xtext are working properly. Next, clone this repository and then create a new Eclipse workspace. Import into the Eclipse workspace ("Import > General > Existing Projects into Workspace") one of the languages of your choice. Note that Graphite only supports one DSL in the same workspace. The following steps can be used for any of the example languages. As an example, we will choose to import the Project Scheduling DSL located in [/languages/projectSchedulingDsl](https://github.com/epsilonlabs/graphite/tree/main/languages/projectSchedulingDsl). When importing this DSL, select all projects except the one whose name ends with ".modelling" (i.e., [workload.modelling](https://github.com/epsilonlabs/graphite/tree/main/languages/projectSchedulingDsl/workload.modelling)). 

Once the projects are loaded, errors related to circular dependencies will be reported in the Problems View. To remove the errors from the Problems View, go to `Windows -> Preferences -> Java -> Compiler -> Building -> Build path problems -> Circular dependencies -> set to Warning`. Additionally, right-click on the metamodel ([workload.ecore](https://github.com/epsilonlabs/graphite/blob/main/languages/projectSchedulingDsl/workload.emf/model/workload.ecore)) and select `Register EPackages`. Finally, clean the workspace by selecting `Project -> Clean -> Clean all projects`.

Once the projects are imported and no errors are reported in the Problems View, the next step is to check that all unit tests pass. Open the [AllTestsSuite](https://github.com/epsilonlabs/graphite/blob/main/languages/projectSchedulingDsl/workload.tests/src/workload/tests/AllTestsSuite.java) class, right-click in the class and click on `Run As > JUnit Plug-in Test`. Once all tests pass, the next step is to create a new Eclipse Application run configuration, and then launch a new Eclipse instance. In the new Eclipse instance, import the project whose name ends with ".modelling" (i.e., [workload.modelling](https://github.com/epsilonlabs/graphite/tree/main/languages/projectSchedulingDsl/workload.modelling)). Open the "representations.aird" file to launch the Sirius/Xtext hybrid DSL editor. Note that in rare instances, certain Eclipse versions may throw some exceptions when the ".modelling" project is first imported, therefore, Graphite will not work properly in that case. This issue can be solved by closing the child Eclipse instance and running it again using the run configuration. 


### B) Developing a new hybrid DSL editor with Graphite

1. Define the abstract syntax (metamodel). Create a new Ecore Modeling Project and define the EMF Ecore metamodel. Run the code generator of the generator model (.genmodel) to generate the Model Code, the Edit Code and the Editor Code.

2. Define the graphical syntax (Sirius .odesign). Create a new Sirius Viewpoint Specification Model (Sirius VSM) to declaratively define the graphical part of the DSL.

3. Define the textual syntax (Xtext grammar). Create one or more Xtext grammars for specifying various parts of the metamodel using textual expressions. The Xtext grammar must import the metamodel and define grammar rules that instantiate the parts of the metamodel that you would like to express with a textual representation. Note that the entry grammar rule must return an instance of the meta-class that contains the string attribute that you would like to conform to the syntax of the grammar. The entry rule must set the property that represents the model element(s) that are derived after parsing the string attribute. For example, the "effortsExpression" string represents a textual projection of the "efforts" list. Therefore, when the "effortsExpression" string is parsed, the derived model elements are assigned to the "efforts" list in the grammar's entry rule.

4. Generate an Emfatic file from the metamodel. Right-click on the metamodel and select "Generate Emfatic Source". Open the generated file, and annotate the metamodel to associate string attributes with Xtext grammars, as in [workload.emf](https://github.com/epsilonlabs/graphite/blob/main/languages/projectSchedulingDsl/workload.emf/model/workload.emf). Note that the annotations are added at the meta-class level. The "syntax" annotation is used to let Graphite know that the "effortsExpression" string attribute must be parsed using the "workload.xtext_grammar.Efforts" grammar with the "Main" entry rule, and the derived model elements that result from the parsing operation are assigned to the "efforts" property. Therefore, "effortsExpression" represents a textual projection of "efforts":

<pre>   @syntax(feature="effortsExpression", derive="efforts", grammar="workload.xtext_grammar.Efforts", entryRule="Main")</pre>

5. Generate an Ecore model from the Emfatic file. Right-click on the Emfatic annotated metamodel and select "Generate Ecore Model".

6. Select the metamodel (.ecore), the generator model (.genmodel) the Sirius VSM (.odesign) and all the Xtext grammars (.xtext), then right-click and select "Graphite > Generate Hybrid Editor". Code is automatically generated to configure a hybrid DSL editor that blends the textual syntax with the graphical syntax. Check the console to see the generated and modified files. If any errors occur, check the Console and Problems View.

7. If your grammar is reported to be invalid by Graphite, right-click on the metamodel (.ecore) and then select "Graphite > Generate Grammar(s)". This will generate a new folder called "generated_grammars" in the project containing the metamodel. The generated folder contains a skeleton of Graphite-compliant grammars. The generated grammars conform to the structure of the metamodel and take into account the annotations. You can use these grammars as a starting point, and customise them for your needs, but the overall structure of the rules must be maintained.

8. To validate a grammar individually, select the metamodel (.ecore) and the grammar (.xtext), then right-click and select "Graphite > Validate Grammar". If any errors occur, check the Console and Problems View.

Note: Graphite requires all the projects (EMF projects, Xtext project(s) and Sirius project) to be in the same directory.


### C) Extending and Customising Graphite

If Graphite does not provide some of the features you may want, or if you would like to modify/remove some of the existing features, you could run Graphite locally without installation. Clone this repository, and then create a new Eclipse workspace that imports only the [graphite](https://github.com/epsilonlabs/graphite/tree/main/bundles/graphite) bundle project ("Import > General > Existing Projects into Workspace"). Modify the source code of Graphite as intended. Create an Eclipse Application run configuration and launch a new Eclipse instance. In the child Eclipse instance, import all the DSL projects, as instructed in `A) Trying out Graphite on the provided examples`. In this child Eclipse instance you will have to create another Eclipse Application run configuration to launch a sub-child Eclipse instance that will contain the hybrid DSL editor.