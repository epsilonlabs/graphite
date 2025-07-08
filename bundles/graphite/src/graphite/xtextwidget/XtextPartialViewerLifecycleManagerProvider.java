package graphite.xtextwidget;

import java.util.Objects;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

import graphite.shared.Settings;
import graphite.textual.XtextEObject;

public class XtextPartialViewerLifecycleManagerProvider implements IEEFLifecycleManagerProvider {
	
	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		return (controlDescription instanceof EEFCustomWidgetDescription) && (Objects.equals(Settings.xtextWidgetId, controlDescription.getIdentifier()));
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		if ((controlDescription instanceof EEFCustomWidgetDescription) && (variableManager.getVariables().get("self") instanceof XtextEObject)) {
			return new XtextPartialViewerLifecycleManager((EEFCustomWidgetDescription) controlDescription, variableManager, interpreter, contextAdapter);
		}
		throw new IllegalArgumentException();
	}

}