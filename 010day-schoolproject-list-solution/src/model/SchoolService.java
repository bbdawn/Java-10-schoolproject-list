package model;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Member> list=new ArrayList<Member>();
	/*
	 * �б� ������ ������ ����ϴ� �޼��� 
	 * �Ű������� ���޵� ������ ������ ��ȭ��ȣ�� �ߺ��� ��쿡�� ����Ʈ�� �߰����� �ʴ´� 
	 * -> 01012341234 tel�� �ߺ��ǹǷ� ��� �Ұ��մϴ�
	 */
	public void addMember(Member member) {
		boolean exist=false;
		for(int i=0;i<list.size();i++) {
			if(member.getTel().equals(list.get(i).getTel())) { // ������ ��ȭ��ȣ�� �����ϸ� 
				exist=true;// true�� �Ҵ� 
				System.out.println(member.getTel()+" tel�� �ߺ��ǹǷ� ��� �Ұ��մϴ�");
				break; // for���� ���� 
			}
		}		
		if(exist==false) {//������ tel�� �������� ������ 
			list.add(member);//����Ʈ�� �������� �߰��Ѵ� 
		}
	}
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	/*
	 *  �Ű������� ���޵� tel�� ��ġ�ϴ� ����Ʈ�� �������� �����ϸ�
	 *  �ش� ������ ��ü�� �ּҰ��� ��ȯ 
	 *  �������� ������ null�� ��ȯ 
	 */
	public Member findMemberByTel(String tel) {
		Member member=null;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {//tel �� �����ϸ� 
				member=list.get(i);
				break;// for���� ���� 
			}
		}		
		return member;
	}
	/*
	 * �Ű������� ���޵� tel�� �ش��ϴ� �������� ����Ʈ�� �����ϸ� 
	 * �ش� �������� ���� ( remove(index) ) �ϰ� ������ ������ ������ ��ȯ,
	 * �������� ������ 010111 tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ� ���
	 * �޼����� ��ȯ 
	 */
	public String deleteMemberByTel(String tel) {
		String message=null;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {//tel �� �����ϸ� 
				message=list.remove(i).toString();//���� , ������ ��� ������ ��ȯ
				break;
			}
		}
		if(message==null) {
			return tel+"tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�";
		}else {// message�� null �� �ƴϸ� 
			return message;
		}
	}
}



















