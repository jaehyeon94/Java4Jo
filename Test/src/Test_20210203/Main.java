package Test_20210203;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sinha[] sinha = new Sinha[7];
		sinha[0] = new Viscount("��", 100000,"����");
		sinha[1] = new Duke("��", 100000, "����");
		sinha[2] = new Baronage("��", 10000, "����");
		sinha[3] = new Count("��", 100000, "����");
		sinha[4] = new Marquis("��", 100000, "����");
		sinha[5] = new Duke("��", 100000, "����");
		sinha[6] = new Baronage("��", 100000, "����");
		
		King king = new King("ŷ",sinha);
		king.showMoney();
				
	}

}
