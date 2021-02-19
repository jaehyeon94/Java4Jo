package PointManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;

public class PointManagement {

	private Manager manager;
	private Map<String, Member> members;
	private Scanner sc = new Scanner(System.in);
	private HashMap<Integer, Capital> capital;
	private HashMap<Integer, Quiz> quiz;
	private int memberNo;
	private String loginID;

	public PointManagement() {
		manager = new Manager(0, "Manager");
		members = new HashMap<>();
		memberNo = 0;
	}

	public void start() {

		while (true) {
			System.out.println("사용자 포인트 관리 프로그램");
			System.out.println("1. 관리자용 2. 일반유저용 3. 종료");
			switch (sc.nextInt()) {
			case 1:
				managerMenu();
				break;
			case 2:
				memberMenu();
				break;
			case 3:
				System.out.println("종료되었습니다.");
				System.exit(0);
			default:
				System.out.println("잘못 입력하셧습니다.");
				break;
			}
		}

	}

	private void managerMenu() {
		boolean ck = true;
		System.out.println("관리자 비밀번호를 입력해주세요");
		if (sc.next().equals(manager.getPassword())) {
			while (ck) {
				System.out.println("1. 목록 2. 유저 포인트 수정, 3. 유저추방, 4. 돌아가기");
				switch (sc.nextInt()) {
				case 1:
					showMember();
					break;
				case 2:
					membersPointUpdate();
					break;
				case 3:
					banishMember();
					break;
				case 4:
					ck = false;
					break;
				default:
					System.out.println("잘못 입력하셧습니다.");
					break;
				}
			}
		} else {
			System.out.println("비밀번호가 맞지 않습니다.");
		}

	}

	private void showMember() {
		for (Entry<String, Member> entry : members.entrySet()) {
			System.out.println("----------------------------------------");
			System.out.println("회원 번호 : " + entry.getValue().getNo());
			System.out.println("회원 아이디 : " + entry.getValue().getId());
			System.out.println("회원 이름 : " + entry.getValue().getName());
			System.out.println("회원 나이 : " + entry.getValue().getAge());
			System.out.println("회원 포인트 : " + entry.getValue().getPoint());
		}
		System.out.println("----------------------------------------");
	}

	private void membersList() {
		for (Entry<String, Member> entry : members.entrySet()) {
			System.out.print("번호 : " + entry.getValue().getNo() + "  ");
			System.out.print("아이디 : " + entry.getValue().getId() + "  ");
			System.out.print("이름 : " + entry.getValue().getName() + "  ");
			System.out.println("포인트 : " + entry.getValue().getPoint());
		}
	}

	private void membersPointUpdate() {
		boolean c = true;
		membersList();
		while (c) {
			System.out.print("포인트 수정 하실 회원의 아이디를 입력해주세요(뒤로가기 : z) : ");
			String id = sc.next();
			if (members.containsKey(id)) {
				System.out.print("수정 하실 포인트를 입력해주세요 : ");
				int point = sc.nextInt();
				System.out.print(point + "점으로 수정 하시겠습니까 ? ");
				System.out.println(" 1. O, 2. X");
				int ck = sc.nextInt();
				if (ck == 1) {
					System.out.println("수정 되었습니다.");
					members.get(id).setPoint(point);
					c = false;
				} else if (ck == 2) {
					System.out.println("취소 되었습니다.");
					c = false;
				} else {
					System.out.println("잘못 입력 하셧습니다.");
				}
			} else if (id.equals("z")) {
				c = false;
			} else {
				System.out.println("존재 하지 않는 회원입니다.");
			}
		}
	}

	private void banishMember() {
		boolean c = true;
		membersList();
		while (c) {
			System.out.print("추방 시킬 아이디를 입력해주세요(뒤로가기 : z) : ");
			String id = sc.next();
			if (members.containsKey(id)) {
				System.out.println(members.get(id).getName() + "님을 추방 시키겠습니까?");
				System.out.println(" 1. O, 2. X");
				int ck = sc.nextInt();
				if (ck == 1) {
					System.out.println("추방 되었습니다.");
					members.remove(id);
					c = false;
				} else if (ck == 2) {
					System.out.println("취소 되었습니다.");
					c = false;
				} else {
					System.out.println("잘못 입력 하셧습니다.");
				}
			} else if (id.equals("z")) {
				c = false;
			} else {
				System.out.println("존재 하지 않는 회원입니다.");
			}
		}
	}

	private void memberMenu() {
		boolean ck = true;
		while (ck) {
			System.out.println("1.로그인, 2.가입하기 3.돌아가기");
			switch (sc.nextInt()) {
			case 1:
				if (login())
					memberMain();
				break;
			case 2:
				addMember();
				break;
			case 3:
				ck = false;
				break;
			default:
				System.out.println("잘못 입력하셧습니다.");
				break;
			}

		}

	}

	private boolean login() {
		boolean ck = false;
		System.out.print("아이디를 입력 해주세요 : ");
		String myId = sc.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		String myPassword = sc.next();

		if (members.containsKey(myId)) {
			if (members.get(myId).getId().equals(myId) && members.get(myId).getPassword().equals(myPassword)) {
				loginID = myId;
				System.out.println("로그인 되었습니다.");
				ck = true;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				ck = false;
			}
		} else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		return ck;
	}

	private void logout() {
		System.out.println("로그아웃 되었습니다.");
		loginID = null;
	}

	private void addMember() {
		String id;
		while (true) {
			System.out.print("아이디 : ");
			id = sc.next();
			if (members.containsKey(id)) {
				System.out.println("중복된 아이디가 존재합니다.");
			} else {
				break;
			}
		}
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("age : ");
		int age = sc.nextInt();
		memberNo++;
		members.put(id, new Member(memberNo, id, password, name, age));
		System.out.println("회원 등록이 완료 되었습니다. ");
	}

	private void memberMain() {
		boolean ck = true;

		while (ck) {
			System.out.println("1. 포인트 벌기, 2. 포인트 양도, 3.포인트 보기, 4.로그아웃");
			switch (sc.nextInt()) {
			case 1:
				getPoint();
				break;
			case 2:
				pointTransfer();
				break;
			case 3:
				showPoint();
				break;
			case 4:
				logout();
				ck = false;
				break;
			default:
				System.out.println("잘못 입력하셧습니다.");
				break;
			}

		}
	}

	private void quiz() {
		quiz = new HashMap<>();
		quiz.put(1, new Quiz("우리나라 국화는?", "무궁화"));
		quiz.put(2, new Quiz("삼일절이 일어난 년도? ", "1919년"));
		quiz.put(3, new Quiz("훈민정음을 만드신 분은 ?", "세종대왕"));
		quiz.put(4, new Quiz("날마다 흑심을 품고 다니는 것은?", "연필"));
		quiz.put(5, new Quiz("닿기만 해도 취하는 술은?", "입술"));
		quiz.put(6, new Quiz("보기만 해도 취하는 술은?", "마술"));
		quiz.put(7, new Quiz("손님이 뜸하면 돈버는 사람은?", "한의사"));
		quiz.put(8, new Quiz("사람들을 벌떡 일으켜세우는 순자는?", "다섯"));
	}

	private void capital() {
		capital = new HashMap<>();
		capital.put(1, new Capital("한국", "서울"));
		capital.put(2, new Capital("일본", "도쿄"));
		capital.put(3, new Capital("중국", "베이징"));
		capital.put(4, new Capital("미국", "워싱턴"));
		capital.put(5, new Capital("베트남", "하노이"));
		capital.put(6, new Capital("대만", "타이베이"));
		capital.put(7, new Capital("태국", "방콕"));
		capital.put(8, new Capital("한국", "서울"));
	}

	private void getPoint() {
		quiz();
		capital();
		Random random = new Random();
		int questionNo;
		switch ((random.nextInt(3) + 1)) {
		case 1:
			System.out.println("산수문제 입니다.");
			int number1 = random.nextInt(100);
			int number2 = random.nextInt(30);
			int answer = number1 + number2;
			System.out.print(number1 + " + " + number2 + "=");
			int myAnswer = sc.nextInt();

			if (answer == myAnswer) {
				System.out.println("정답입니다.");
				members.get(loginID).setPoint(members.get(loginID).getPoint() + 10);
			} else {
				System.out.println("틀렷습니다.");
			}
			break;
		case 2:
			questionNo = random.nextInt(8) + 1;
			System.out.println("국가 수도의 문제입니다. ");
			String question = capital.get(questionNo).getNation();
			System.out.print(question + "의 수도는 무엇을까요 ? ");
			String capitalAnswer = sc.next();
			if (capital.get(questionNo).getCapital().equals(capitalAnswer)) {
				System.out.println("정답입니다.");
				members.get(loginID).setPoint(members.get(loginID).getPoint() + 10);
			} else {
				System.out.println("틀렷습니다.");
			}
			break;
		case 3:
			questionNo = random.nextInt(8) + 1;
			System.out.println("퀴즈입니다. ");
			String quizQuestion = quiz.get(questionNo).getQuestion();
			System.out.print(quizQuestion);
			String quizAnswer = sc.next();
			if (quiz.get(questionNo).getAnswer().equals(quizAnswer)) {
				System.out.println("정답입니다.");
				members.get(loginID).setPoint(members.get(loginID).getPoint() + 10);
			} else {
				System.out.println("틀렷습니다.");
			}
			break;
		default:
			break;
		}
	}

	private void pointTransfer() {
		boolean c = true;
		while (c) {
			System.out.println("현재 보유중인 포인트 : " + members.get(loginID).getPoint());
			System.out.print("양도 하실 회원의 아이디를 입력해주세요(뒤로가기 : z) : ");
			String id = sc.next();
			if (members.containsKey(id)) {
				System.out.print("양도하실 포인트를 입력해주세요 :");
				int point = sc.nextInt();
				if (members.get(loginID).getPoint() > point) {
					System.out.println("전달하실 회원이 " + members.get(id).getName() + "님이 맞습니까 ?");
					System.out.println("1. O, 2. X");
					int ck = sc.nextInt();
					if (ck == 1) {
						System.out.println("포인트를 " + members.get(id).getName() + "님에게 양도 되었습니다.");
						members.get(id).setPoint(members.get(id).getPoint() + point);
						members.get(loginID).setPoint(members.get(loginID).getPoint() - point);
						c = false;
					} else if (ck == 2) {
						System.out.println("취소 되었습니다.");
					} else {
						System.out.println("잘못 입력 하셧습니다.");
					}
				} else {
					System.out.println("포인트가 부족합니다");
					c = false;
				}
			} else if (id.equals("z")) {
				c = false;
			} else {
				System.out.println("존재하지 않는 회원입니다.");
				c = false;
			}
		}
	}

	private void showPoint() {
		System.out.println("현재 보유중인 포인트 : " + members.get(loginID).getPoint());
	}

}
