package workload.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	ConsistencyEnforcementTests.class,
	CrossReferencingTests.class,
	ErrorReportingTests.class,
	IntegratedASGTests.class,
	MergingDerivedElementsTests.class,
	ModifyingDerivedElementsTests.class,
	ModifyingTextualExpressionsTests.class,
	StoringDerivedElementsTests.class
})
public class AllTestsSuite {}
