package model;

/*
 * abstract class로 선언 : abstract class는 직접 객체화 될 수 없다
 * 						  실제 관리되어야 할 구성원 정보는 반드시 Student, Teacher, Employee
 * 						  세 타입 중에 하나이어야 한다. (new Member()로 생성되어서는 안됨)
 * 						  Member class를 abstract로 선언해서 부모 역할에 집중하게 한다. 
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







