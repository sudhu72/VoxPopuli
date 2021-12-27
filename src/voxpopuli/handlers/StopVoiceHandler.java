package voxpopuli.handlers;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import voxpopuli.VoxpopuliApp;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.AbstractHandler;

public class StopVoiceHandler extends AbstractHandler
{
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        VoxpopuliApp.INSTANCE.stopListening();
        final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
        MessageDialog.openError(window.getShell(), "Voxpopuli", "Voxpopuli Stopped");
        return null;
    }
}