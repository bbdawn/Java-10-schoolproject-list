package model;

/*
 * abstract class�� ���� : abstract class�� ���� ��üȭ �� �� ����
 * 						  ���� �����Ǿ�� �� ������ ������ �ݵ�� Student, Teacher, Employee
 * 						  �� Ÿ�� �߿� �ϳ��̾�� �Ѵ�. (new Member()�� �����Ǿ�� �ȵ�)
 * 						  Member class�� abstract�� �����ؼ� �θ� ���ҿ� �����ϰ� �Ѵ�. 
 */

public abstract class Member {
	private String tel;
	private String name;
	private String address;
	public Member(String tel, String name, String address) {
		super();
		this.tel = tel;
		this.name = name;
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "tel:" + tel + ", name:" + name + ", address:" + address;
	}
	
}







