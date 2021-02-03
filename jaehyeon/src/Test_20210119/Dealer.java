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
		System.out.print("참가자 인원을 정해주세요 : ");
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
			System.out.print(participants[i].getNo() + "번째 참가자 : ");
			System.out.println(participants[i].getNumber()[0] + "," + participants[i].getNumber()[1]);
			System.out.print("두 주사위의 합 : " + participants[i].getSum());
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
		System.out.println("축하합니다!!");
		System.out.println("승리자는 참가자 " + participant.getNo() + "번입니다.");
		System.out.println("주사위 숫자는 [" + participant.getNumber()[0] + " , " + participant.getNumber()[1] + "]입니다.");
		System.out.println("주사위의 합은 : " + participant.getSum() + " 입니다.");
	}

	public int draw() {
		int ck = 0;
		System.out.println("-----------------------------");
		for (int i = 0; i < participants.length; i++) {
			for (int j = 0; j < draw.size(); j++) {
				if (participants[i].getNo() == draw.get(j)) {
					System.out.println("참가자 " + participants[i].getNo() + "번");
					System.out
							.println("[" + participants[i].getNumber()[0] + "," + participants[i].getNumber()[1] + "]");
					ck++;
				}
			}
		}
		System.out.println("------------------------------");
		System.out.println("총 " + ck + "명이 무승부가 되었습니다.");
		System.out.println("점수는 : " + participants[0].getSum() + "점입니다.");
		System.out.println("1. 반띵, 2. 재경기");
		return sc.nextInt();
	}
}
