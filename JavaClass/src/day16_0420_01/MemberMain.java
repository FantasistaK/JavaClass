package day16_0420_01;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();

		MemberDTO member = new MemberDTO();
		
		MemberService ms = new MemberService();
		
		do {

			System.out.println("-------------------------------------------------------");
			System.out.println("1. 회원가입 | 2. 전체회원조회 | 3. 로그인 | 4. 전화번호변경 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			switch (select) {

			case 1:

				System.out.print("아이디 : ");
				String id = sc.next();
				System.out.print("비밀번호 : ");
				String password = sc.next();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("전화번호 : ");
				String phone = sc.next();
				
				member = new MemberDTO(id, password, name, phone);

				memberList.add(member);

				break;

			case 2:

				ms.memberList(memberList);

				break;

			case 3:

				ms.memberLogin(memberList);
				
				break;

			case 4:

				memberList = ms.phoneUpdate(memberList);
								
				break;

			case 5:

				System.out.println("프로그램을 종료 합니다.");
				run = false;
				break;

			default:
				
				System.out.println("다시 입력해 주세요.");
				
			}

		} while (run);
		
		sc.close();

	}

}
