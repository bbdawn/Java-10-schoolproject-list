package test.step1;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseAdd {
	public static void main(String[] args) {
		
		SchoolService service = new SchoolService();
		service.addMember(new Student("0101231234", "강승규", "용인", "17"));
		service.addMember(new Teacher("0101231235", "구병수", "수지", "국어"));
		service.addMember(new Student("0101231236", "구자형", "수원", "16"));
		service.addMember(new Employee("0101231237", "김선제", "화성", "재무부"));
		service.addMember(new Student("0101231238", "김승배", "용인", "18"));
		service.addMember(new Teacher("0101231239", "심지훈", "용인", "수학"));		
		// 아래는 중복 테스트
		// 0101231234 tel 이 중복되어 추가될 수 없습니다
		service.addMember(new Student("0101231234", "아이유", "잠실", "18"));
		System.out.println("***학교 구성원 등록 완료***");
		service.printAll();// 6명의 정보가 출력
		/**/
	}
}
