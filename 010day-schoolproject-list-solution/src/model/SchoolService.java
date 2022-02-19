package model;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Member> list=new ArrayList<Member>();
	/*
	 * 학교 구성원 정보를 등록하는 메서드 
	 * 매개변수로 전달된 구성원 정보의 전화번호가 중복될 경우에는 리스트에 추가하지 않는다 
	 * -> 01012341234 tel이 중복되므로 등록 불가합니다
	 */
	public void addMember(Member member) {
		boolean exist=false;
		for(int i=0;i<list.size();i++) {
			if(member.getTel().equals(list.get(i).getTel())) { // 동일한 전화번호가 존재하면 
				exist=true;// true로 할당 
				System.out.println(member.getTel()+" tel이 중복되므로 등록 불가합니다");
				break; // for문을 종료 
			}
		}		
		if(exist==false) {//동일한 tel이 존재하지 않으면 
			list.add(member);//리스트에 구성원을 추가한다 
		}
	}
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	/*
	 *  매개변수로 전달된 tel과 일치하는 리스트의 구성원이 존재하면
	 *  해당 구성원 객체의 주소값을 반환 
	 *  존재하지 않으면 null을 반환 
	 */
	public Member findMemberByTel(String tel) {
		Member member=null;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {//tel 이 동일하면 
				member=list.get(i);
				break;// for문을 종료 
			}
		}		
		return member;
	}
	/*
	 * 매개변수로 전달된 tel에 해당하는 구성원이 리스트에 존재하면 
	 * 해당 구성원을 삭제 ( remove(index) ) 하고 삭제한 구성원 정보를 반환,
	 * 존재하지 않으면 010111 tel에 해당하는 구성원 정보가 없어서 삭제 불가 라는
	 * 메세지를 반환 
	 */
	public String deleteMemberByTel(String tel) {
		String message=null;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {//tel 이 동일하면 
				message=list.remove(i).toString();//삭제 , 삭제한 요소 정보를 반환
				break;
			}
		}
		if(message==null) {
			return tel+"tel에 해당하는 구성원 정보가 없어서 삭제 불가";
		}else {// message가 null 이 아니면 
			return message;
		}
	}
}



















