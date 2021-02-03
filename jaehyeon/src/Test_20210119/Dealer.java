package Test_20210119;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Dealer {
	private Participant[] participants;
	private int number;
	private int drawNumber;
	private ArrayList<Integer> draw;
	Scanner sc = new Scanner(System.in);

	public Dealer() {
		// TODO Auto-generated constructor stub
		this.number = numbers();
		participants = new Participant[number];
		draw = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			this.participants[i] = new Participant();
		}
	}

	public Dealer(int number, ArrayList<Integer> draw) {
		this.number = number;
		this.draw = draw;
		participants = new Participant[number];
		draw = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			this.participants[i] = new Participant();
		}
	}

	public Participant[] getParticipants() {
		return participants;
	}

	public void setParticipants(Participant[] participants) {
		this.participants = participants;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	void inIt() {
		participants = new Participant[number];
		draw = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			this.participants[i] = new Participant();
		}
	}

	int numbers() {
		System.out.print("������ �ο��� �����ּ��� : ");
		return sc.nextInt();
	}

	void dice() {
		Random random = new Random();
		for (int i = 0; i < number; i++) {
			int[] numbers = new int[2];
			numbers[0] = (random.nextInt(13) + 1);
			numbers[1] = (random.nextInt(13) + 1);
			participants[i].setNo(i + 1);
			participants[i].setNumber(numbers);
			participants[i].Sum();
			participants[i].Fair();
		}

	}

	void drawDice() {
		Random random = new Random();
		for (int i = 0; i < number; i++) {
			int[] numbers = new int[2];
			numbers[0] = (random.nextInt(13) + 1);
			numbers[1] = (random.nextInt(13) + 1);
			participants[i].setNo(draw.get(i));
			participants[i].setNumber(numbers);
			participants[i].Sum();
			participants[i].Fair();
		}
	}

	public Participant logic() {
		Participant participant = new Participant(participants[0].getNo(), participants[0].getNumber());
		participant.setSum(participants[0].getSum());
		participant.setFair(participants[0].isFair());
		drawNumber = 1;
		for (int i = 1; i < this.number; i++) {
			if (participant.isFair()) {
				if (participants[i].isFair()) {
					if (participant.getSum() < participants[i].getSum()) {
						participant.setNo(participants[i].getNo());
						participant.setNumber(participants[i].getNumber());
						participant.setSum(participants[i].getSum());
						participant.setFair(true);
					}
				}
			} else {
				if (participants[i].isFair()) {
					participant.setNo(participants[i].getNo());
					participant.setNumber(participants[i].getNumber());
					participant.setSum(participants[i].getSum());
					participant.setFair(true);
				} else {
					if (participant.getSum() < participants[i].getSum()) {
						participant.setNo(participants[i].getNo());
						participant.setNumber(participants[i].getNumber());
						participant.setSum(participants[i].getSum());
					}
				}
			}
		}

		for (int i = 0; i < this.number; i++) {
			if (participant.isFair()) {
				if (participants[i].isFair()) {
					if (participant.getNo() != participants[i].getNo()
							&& participant.getSum() == participants[i].getSum()) {
						drawNumber++;
						draw.add(participant.getNo());
						draw.add(participants[i].getNo());
					}
				}
			} else {
				if (participant.getNo() != participants[i].getNo()
						&& participant.getSum() == participants[i].getSum()) {
					drawNumber++;
					draw.add(participant.getNo());
					draw.add(participants[i].getNo());
				}
			}
		}

		HashSet<Integer> hashSet = new HashSet<>(draw);
		draw = new ArrayList<Integer>(hashSet);

		return participant;
	}

	void print(Participant participant) {
		for (int i = 0; i < number; i++) {
			System.out.print(participants[i].getNo() + "��° ������ : ");
			System.out.println(participants[i].getNumber()[0] + "," + participants[i].getNumber()[1]);
			System.out.print("�� �ֻ����� �� : " + participants[i].getSum());
			System.out.println("\n----------------------");
		}
		if (drawNumber > 1) {
			int num = draw();
			if (num == 1) {
				System.exit(0);
			} else if (num == 2) {
				Dealer dealer = new Dealer(this.drawNumber, this.draw);
				dealer.drawDice();
				dealer.print(dealer.logic());
			}
		} else {
			winner(participant);
		}
	}

	void winner(Participant participant) {
		System.out.println("�����մϴ�!!");
		System.out.println("�¸��ڴ� ������ " + participant.getNo() + "���Դϴ�.");
		System.out.println("�ֻ��� ���ڴ� [" + participant.getNumber()[0] + " , " + participant.getNumber()[1] + "]�Դϴ�.");
		System.out.println("�ֻ����� ���� : " + participant.getSum() + " �Դϴ�.");
	}

	public int draw() {
		int ck = 0;
		System.out.println("-----------------------------");
		for (int i = 0; i < participants.length; i++) {
			for (int j = 0; j < draw.size(); j++) {
				if (participants[i].getNo() == draw.get(j)) {
					System.out.println("������ " + participants[i].getNo() + "��");
					System.out
							.println("[" + participants[i].getNumber()[0] + "," + participants[i].getNumber()[1] + "]");
					ck++;
				}
			}
		}
		System.out.println("------------------------------");
		System.out.println("�� " + ck + "���� ���ºΰ� �Ǿ����ϴ�.");
		System.out.println("������ : " + participants[0].getSum() + "���Դϴ�.");
		System.out.println("1. �ݶ�, 2. ����");
		return sc.nextInt();
	}
}
