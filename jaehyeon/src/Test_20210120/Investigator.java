package Test_20210120;

import java.util.Arrays;

public class Investigator {
	SoundRecorder[] sRecorders;
	
	public Investigator(SoundRecorder[] sRecorder) {
		this.sRecorders = sRecorder;
	}
	
	
	public void practice() {
		for(int i = 0; i < sRecorders.length; i++) {
			System.out.print((i+1) +"¹øÂ° ³ìÀ½±â : ");
			System.out.println(sRecorders[i].getS());
		}
	}
	
	public void keyPractice() {
		Arrays.sort(sRecorders);
		for(int i = 0; i < sRecorders.length; i++) {
			System.out.print((i+1) +"¹øÂ° ³ìÀ½±â : ");
			System.out.println(sRecorders[i].getS());
		}
	}
	
	

	public SoundRecorder[] getsRecorders() {
		return sRecorders;
	}

	public void setsRecorders(SoundRecorder[] sRecorders) {
		this.sRecorders = sRecorders;
	}
	
	
	
}
