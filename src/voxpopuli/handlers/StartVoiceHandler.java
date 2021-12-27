package voxpopuli.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;

import voxpopuli.VoxpopuliApp;
import voxpopuli.action.Action;
import voxpopuli.action.ActionListener;
import voxpopuli.action.ActionManager;

public class StartVoiceHandler extends AbstractHandler implements ActionListener{

	private ExecutionEvent event;
	
	public StartVoiceHandler() {
		ActionManager.addListener(this);
//      try {
//			configuration = new Configuration();
//			configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
//			configuration.setDictionaryPath("/Users/sudhu72/Research/Polaris/8571.dic");
//			configuration.setLanguageModelPath("/Users/sudhu72/Research/Polaris/8571.lm");
//			recognizer = new LiveSpeechRecognizer(configuration);
//
////			recognizer.startRecognition(true);			
////			recognizer = new LiveSpeechRecognizer(configuration);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			System.out.println("StartVoiceHandler: Command Name: "+event.getCommand().getName());
		} catch (NotDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.event = event;
//		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//		IHandlerService handlerService = (IHandlerService)window.getService(IHandlerService.class);
		
		
		VoxpopuliApp.INSTANCE.startListening();
//		LiveSpeechRecognizer recognizer = app.getRecognizer();
		
//		Thread daemonThread = new Thread(app);
//		daemonThread.setDaemon(true);
//		daemonThread.start();
		
		//Asynchronous
//        Display.getDefault().asyncExec((Runnable)new Runnable() {
//            @Override
//            public void run() {
//        		recognizer.startRecognition(true);
//
//        		if (!AudioSystem.isLineSupported(Port.Info.MICROPHONE)) {
//        			System.out.println("No Mic");
//        		}
//
//                Stats stats = recognizer.createStats(2);
//                
//                System.out.println("Start talking..."+stats.getFrames());
//
//                SpeechResult result;
//                String phrase = null;
//                
//                while (true) {
//                	
//                	result = recognizer.getResult();
//                			
//                	phrase = result.getHypothesis().toLowerCase();
//                	
//                	System.out.println("Here: "+phrase);
//                	
//                	if(phrase.startsWith("eclipse")) {
//                    	ActionManager.findActionAndNotify(phrase);        		
//                	}else {
//                		continue;
//                	}
//                }
//            }
//        });
		
//		try {
////			VoxpopuliApp.INSTANCE.startListening();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//			this.displayErrorMsg(window, "Voice Listener Failed");
//		}
//		MessageDialog.openInformation(window.getShell(), "Voxpopuli", "Voxpopuli is listening");
//        try {
//        	handlerService.executeCommand("org.eclipse.ui.newWizard", null);
//    		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
        
//		MessageDialog.openInformation(
//				window.getShell(),
//				"VoxPopuli",
//				"Hello, Eclipse world");
		return null;
	}

//    private void displayErrorMsg(final IWorkbenchWindow window, final String msg) {
//        MessageDialog.openError(window.getShell(), "Voxpopuli", msg);
//    }

	@Override
	public void action(Action action) {
		System.out.println("EclipseID: "+action.getEclipseId());
		
		//To avoid illegal thread access exception
		//https://stackoverflow.com/questions/5980316/invalid-thread-access-error-with-java-swt
		
		//Synchronous
//		Display.getDefault().syncExec(new Runnable() {
//		    public void run() {
//		        // ...
//		    }
//		});
		

		//Asynchronous
        Display.getDefault().asyncExec((Runnable)new Runnable() {
            @SuppressWarnings("unchecked")
			@Override
            public void run() {
                try {
                    final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(StartVoiceHandler.this.event);
                    final IHandlerService handlerService = (IHandlerService)window.getService((Class)IHandlerService.class);
                    handlerService.executeCommand(action.getEclipseId(), (Event)null);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });
	}
}
