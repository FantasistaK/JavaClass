package day16_0420_01;

import java.util.*;

public class MemberService {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * 전체회원 조회를 위한 메소드
	 * 메소드 이름 : memberList
	 * 매개변수 : memberList
	 * 리턴 : 없음
	 */
	
	void memberList(List<MemberDTO> memberList) {
		
		for (int i = 0; i < memberList.size(); i++)
			System.out.println(memberList.get(i));
		
	}
	
	/*
	 * 회원 로그인을 위한 메소드
	 * 메소드 이름 : memberLogin
	 * 매개변수 : memberList
	 * 리턴 : 없음
	 */
	void memberLogin(List<MemberDTO> memberList) {
	
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();
		int login = 0;
		
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
				login = 1;
				System.out.println(memberList.get(i).getName()+"님 환영합니다");
			}
		}
		
		if (login != 1)
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
				
	}
	
	/*
	 * 전화번호 변경을 위한 메소드
	 * 메소드 이름 : phoneUpdate
	 * 매개변수 : memberList
	 * 리턴 : 있음
	 */
	
	List<MemberDTO> phoneUpdate(List<MemberDTO> memberList) {
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();
		int login = 0;
		
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
				login = 1;
				System.out.print("변경할 전화번호를 입력하세요 : ");
				String phone = sc.next();
				memberList.get(i).setPhone(phone);
				System.out.println("전화번호가 변경 되었습니다.");
			}
		}
		
		if (login != 1)
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		
		return memberList;
		
	}
	
}