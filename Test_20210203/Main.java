package Test_20210203;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sinha[] sinha = new Sinha[7];
		sinha[0] = new Viscount("강", 100000,"자작");
		sinha[1] = new Duke("최", 100000, "공작");
		sinha[2] = new Baronage("이", 10000, "남작");
		sinha[3] = new Count("김", 100000, "백작");
		sinha[4] = new Marquis("박", 100000, "후작");
		sinha[5] = new Duke("유", 100000, "공작");
		sinha[6] = new Baronage("권", 100000, "남작");
		
		King king = new King("킹",sinha);
		king.showMoney();
				
	}

}
