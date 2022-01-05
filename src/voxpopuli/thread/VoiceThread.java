package voxpopuli.thread;

import java.util.concurrent.atomic.AtomicBoolean;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Port;

import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.decoder.adaptation.Stats;
import voxpopuli.action.ActionManager;

public class VoiceThread implements Runnable {

	private Thread worker;
	private LiveSpeechRecognizer recognizer = null;
	private final AtomicBoolean running = new AtomicBoolean(false);
//    private int interval;

	public VoiceThread(LiveSpeechRecognizer recognizer) {
//        interval = sleepInterval;
		this.recognizer = recognizer;
	}

	public void start() {
		worker = new Thread(this);
		worker.setDaemon(true);
		worker.start();
	}

	public void stop() {
		running.set(false);
	}

	public void run() {
		running.set(true);

		recognizer.startRecognition(true);

		if (!AudioSystem.isLineSupported(Port.Info.MICROPHONE)) {
			System.out.println("No Mic");
		}

		Stats stats = recognizer.createStats(2);

		System.out.println("Start talking..." + stats.getFrames());

		SpeechResult result;
		String phrase = null;

		while (running.get()) {

			result = recognizer.getResult();

			phrase = result.getHypothesis().toLowerCase();

			System.out.println("Here: " + phrase);

			if (phrase.startsWith("eclipse stop listening")) {
				break;// Exit out and stop recognizer
			} else if (phrase.startsWith("eclipse")) {
				ActionManager.findActionAndNotify(phrase);
			} else {
				continue;
			}
			// check recognizer stop action
//			running.set(VoxpopuliApp.INSTANCE.getStopRecognizer().get());
		}
		recognizer.stopRecognition();
	}
}