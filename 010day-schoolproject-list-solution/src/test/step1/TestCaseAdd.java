package test.step1;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseAdd {
	public static void main(String[] args) {
		
		SchoolService service = new SchoolService();
		service.addMember(new Student("0101231234", "���±�", "����", "17"));
		service.addMember(new Teacher("0101231235", "������", "����", "����"));
		service.addMember(new Student("0101231236", "������", "����", "16"));
		service.addMember(new Employee("0101231237", "�輱��", "ȭ��", "�繫��"));
		service.addMember(new Student("0101231238", "��¹�", "����", "18"));
		service.addMember(new Teacher("0101231239", "������", "����", "����"));		
		// �Ʒ��� �ߺ� �׽�Ʈ
		// 0101231234 tel �� �ߺ��Ǿ� �߰��� �� �����ϴ�
		service.addMember(new Student("0101231234", "������", "���", "18"));
		System.out.println("***�б� ������ ��� �Ϸ�***");
		service.printAll();// 6���� ������ ���
		/**/
	}
}
