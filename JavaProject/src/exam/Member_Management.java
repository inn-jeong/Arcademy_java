package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Member_Management {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id="", name="",address=""; //아이디,이름,주소
		int menu1=0, menu2=0, loop=0; //메뉴1,메뉴2,회원입력 횟수
		boolean flag_remove = false; //회원정보가 삭제되었는지 여부
		ArrayList<Member> list = new ArrayList<Member>(); //회원 명단
		while(true) {
			System.out.println("=======헬스클럽 회원관리 프로그램=======");
			System.out.println("1.회원 정보 관리 | 2.프로그램 종료");
			System.out.println("===============================");
			System.out.print("메뉴를 선택하세요 >> ");
			try{
				menu1 = scan.nextInt();
			}catch (Exception e) { //입력이 숫자가 아닐 경우
				scan = new Scanner(System.in); //입력 초기화
				System.out.println("잘못 입력하였습니다. \n숫자만 입력해주세요.\n");
				continue;
			}
			
			if(menu1 == 2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(menu1 != 1) {
				System.out.println("잘못 입력하였습니다. \n보기의 숫자 중 입력해주세요.\n");
				continue;
			}
			while(true) {
				System.out.println("======================일반회원 정보관리======================");
				System.out.println("11.일반회원 정보입력 | 22.일반회원 정보삭제 | 33.일반회원 정보확인 | 0.이전단계");
				System.out.println("=======================================================");
				System.out.print("메뉴를 선택하세요 >> ");
				try{
					menu2 = scan.nextInt();
				}catch (Exception e) {
					scan = new Scanner(System.in);
					System.out.println("잘못 입력하였습니다. \n숫자만 입력해주세요.\n");
					continue;
				}
				if(menu2 == 11) {
					System.out.print("가입할 회원 수를 입력하세요 >> ");
					try{
						loop = scan.nextInt();
					}catch (Exception e) {
						scan = new Scanner(System.in);
						System.out.println("잘못 입력하였습니다. \n숫자만 입력해주세요.\n");
						continue;
					}
					for(int i=0; i<loop; i++) {
						Member member = new Member();
						System.out.println("회원정보를 입력하세요.");
						System.out.print("회원 아이디: ");
						id = scan.next();
						System.out.print("회원 이름: ");
						name = scan.next();
						System.out.print("회원 지역: ");
						address = scan.next();
						//회원 객체에 정보 저장 후 명단에 추가
						member.setId(id);
						member.setName(name);
						member.setAddress(address);
						list.add(member);
					}
				}else if(menu2 == 22) {
					System.out.print("삭제할 회원의 ID를 입력하세요 >> ");
					id = scan.next();
					for(int i=0; i<list.size(); i++) {
						if(list.get(i).getId().equals(id)) {
							list.remove(i);
							flag_remove = true;
							System.out.println(id+" 의 정보가 삭제되었습니다.");
							break;
						}
					}
					if(!flag_remove) {//삭제되지 않았다면
						System.out.println(id+"가 회원 목록에 없습니다.");
					}
				}else if(menu2 == 33) {
					System.out.println("등록된 회원수는 "+list.size()+"입니다.");
					for(int i=0; i<list.size(); i++) {
						System.out.println("회원 번호 "+(i+1));
						System.out.println("회원 아이디 : "+list.get(i).getId());
						System.out.println("회원 이름 : "+list.get(i).getName());
						System.out.println("회원 주소 : "+list.get(i).getAddress());
					}
				}else if(menu2 == 0) {
					break;
				}else {
					System.out.println("잘못 입력하였습니다. \n보기의 숫자 중 선택해주세요.\n");
					continue;
				}
			}
		}
		scan.close();
	}
}
