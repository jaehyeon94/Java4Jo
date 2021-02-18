package MemberManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MemberManagerment {

	private int totalMember;
	Map<Integer, Member> members;
	Scanner sc = new Scanner(System.in);

	public MemberManagerment() {
		this.members = new HashMap<>();
		this.totalMember = 0;
	}

	public void menu() {
		int number;

		while (true) {
			System.out.println("---------------- 메 뉴 -------------------");
			System.out.println("1.회원 등록 2.회원 보기 3.회원 조회 4.회원정보 수정 5.회원 삭제 6.종료");
			number = sc.nextInt();
			switch (number) {
			case 1:
				addMember();
				break;
			case 2:
				showMember();
				break;
			case 3:
				searchMember();
				break;
			case 4:
				modMember();
				break;
			case 5:
				delMember();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("메뉴 선택을 잘못하셧습니다.");
			}
		}

	}

	public void addMember() {
		String name;
		String address;
		String phone;
		String gender = "";

		System.out.print("등록하실 회원의 이름을 입력해주세요 : ");
		name = sc.next();
		System.out.print("등록하실 회원의 성별 선택 해주세요 : ");
		gender = gender();
		System.out.println("등록하실 회원의 주소를 입력해주세요 : ");
		address = address();
		System.out.println("등록하실 회원의 전화번호를 입력해주세요 : ");
		phone = sc.next();
		totalMember++;
		members.put(totalMember, new Member(totalMember, name, address, phone, gender));
		System.out.println("회원이 등록되었습니다.");
	}

	public void delMember() {
		System.out.println("삭제하실 회원의 번호를 입력해주세요");
		int memberNo = sc.nextInt();
		if (members.containsKey(memberNo)) {
			members.remove(memberNo);
			System.out.println("회원이 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}

	public void modMember() {
		int memberNo, number;
		System.out.print("수정하실 회원 번호를 입력해주세요 : ");
		memberNo = sc.nextInt();
		if (members.containsKey(memberNo)) {
			System.out.println("수정하실 정보를 선택해주세요");
			System.out.println("1.이름 2.성별 3.주소 4.휴대폰 번호 5.돌아가기");
			number = sc.nextInt();
			switch (number) {
			case 1:
				System.out.print("수정하실 이름을 입력해주세요 : ");
				members.get(memberNo).setName(sc.next());
				break;
			case 2:
				System.out.print("수정하실 성별을 선택해주세요 : ");
				members.get(memberNo).setName(gender());
				break;
			case 3:
				System.out.println("수정하실 주소를 선택해주세요");
				members.get(memberNo).setAddress(address());
			case 4:
				System.out.print("수정하실 휴대폰을 입력해주세요 : ");
				members.get(memberNo).setPhone(sc.next());
				break;
			case 5:
				break;
			default:
				System.out.println("잘못 입력하셧습니다.");
				break;
			}
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}

	}

	public String gender() {
		while (true) {
			System.out.println("1. 남자 2. 여자");
			int genderCk = sc.nextInt();
			if (genderCk == 1) {
				return "남자";
			} else if (genderCk == 2) {
				return "여자";
			} else {
				System.out.println("잘못 입력하셧습니다.");
			}
		}
	}

	public String address() {
		String address;
		System.out.print("1.서울 특별시 2.경기도 3.경상도 4.전라도 5.강원도 6.제주도 7.기타 ");
		switch (sc.nextInt()) {
		case 1:
			address = "서울 특별시";
			break;
		case 2:
			address = "경기도";
			break;
		case 3:
			address = "경상도";
			break;
		case 4:
			address = "전라도";
			break;
		case 5:
			address = "강원도";
			break;
		default:
			address = "기타";
			break;
		}

		return address;
	}

	public void showMember() {
		for (Entry<Integer, Member> entry : members.entrySet()) {
			System.out.println("----------------------------------------");
			System.out.println("회원 번화 : " + entry.getKey());
			System.out.println("회원 이름 : " + entry.getValue().getName());
			System.out.println("회원 성별 : " + entry.getValue().getGender());
			System.out.println("회원 주소 : " + entry.getValue().getAddress());
			System.out.println("회원 휴대폰 번호 : " + entry.getValue().getPhone());
			System.out.println("----------------------------------------");
		}
	}

	public void searchMember() {
		System.out.print("조회 하실 회원 번호를 입력해주세요 : ");
		int memberNo = sc.nextInt();
		if (members.containsKey(memberNo)) {
		System.out.println("회원 번호 : " + members.get(memberNo).getNo());
		System.out.println("회원 이름 : " + members.get(memberNo).getName());
		System.out.println("회원 성별 : " + members.get(memberNo).getGender());
		System.out.println("회원 주소 : " + members.get(memberNo).getAddress());
		System.out.println("회원 휴대폰 번호 : " + members.get(memberNo).getPhone());
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}
}
