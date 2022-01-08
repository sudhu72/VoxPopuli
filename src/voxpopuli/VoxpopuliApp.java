package voxpopuli;

import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import voxpopuli.thread.VoiceThread;

public enum VoxpopuliApp //implements Runnable
{
	INSTANCE;

	private Configuration configuration = null;
	private LiveSpeechRecognizer recognizer = null;
	private VoiceThread voiceThread = null;

	VoxpopuliApp() {
		configuration = new Configuration();
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");

//		configuration.setDictionaryPath("resource:/lib/8620.dic");
//		configuration.setLanguageModelPath("resource:/lib/8620.lm");

		configuration.setDictionaryPath("resource:/lib/5856.dic");
		configuration.setLanguageModelPath("resource:/lib/5856.lm");

		try {
			recognizer = new LiveSpeechRecognizer(configuration);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void startListening() {
		voiceThread = new VoiceThread(recognizer);
		voiceThread.start();
	}
	
	public void stopListening() {

		voiceThread.stop();
	}
	
	public LiveSpeechRecognizer getRecognizer() {
		return recognizer;
	}

//	public AtomicBoolean getStopRecognizer() {
//		return stopRecognizer;
//	}




//	@Override
//	public void run() {
//
//		recognizer.startRecognition(true);
//
//		if (!AudioSystem.isLineSupported(Port.Info.MICROPHONE)) {
//			System.out.println("No Mic");
//		}
//
//        Stats stats = recognizer.createStats(2);
//        
//        System.out.println("Start talking..."+stats.getFrames());
//
//        SpeechResult result;
//        String phrase = null;
//        
//        while (true) {
//        	
//        	result = recognizer.getResult();
//        			
//        	phrase = result.getHypothesis().toLowerCase();
//        	
//        	System.out.println("Here: "+phrase);
//        	
//        	if(phrase.startsWith("eclipse")) {
//            	ActionManager.findActionAndNotify(phrase);        		
//        	}else {
//        		continue;
//        	}
//        }
//	}
}
