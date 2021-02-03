package Test_20210120;

public class SoundRecorderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String[] voice = { "Currently saying yes to new adventure.", "Could you tell" + "him to call me back",
				"This is Seon", "One moment, please", "Can you ccall back later?" };
		SoundRecorder[] sRecorders = new SoundRecorder[voice.length];

		for (int j = 0; j < voice.length; j++) {
			sRecorders[j] = new SoundRecorder(voice[j]);
		}

		sRecorders[3].setKey(100);
		sRecorders[1].setKey(20);
		
		Investigator investigator = new Investigator(sRecorders);
		investigator.practice();
		investigator.keyPractice();

	}

}
