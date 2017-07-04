package daoImpl.mock;

import java.util.HashMap;
import java.util.Map;

import dao.PersonDao;
import model.Person;
import model.Professor;
import model.Section;
import model.Student;

public class PersonDaoImpl implements PersonDao {

	@Override
	public HashMap<String, Professor> findAllProfessors() {
		
		HashMap<String, Professor> professors = new HashMap<String, Professor>();
		
		Professor p1, p2, p3;
		p1 = new Professor("Jacquie Barker", "123-45-6789", "Adjunct Professor", "Information Technology","123456");
		professors.put(p1.getSsn(), p1);
		p2 = new Professor("John Smith", "567-81-2345", "Full Professor", "Chemistry","123456");
		professors.put(p2.getSsn(), p2);
		p3 = new Professor("Snidely Whiplash", "987-65-4321", "Full Professor", "Physical Education","123456");
		professors.put(p3.getSsn(), p3);	
		
		//�˴�Ӧ�ö�ȡ�������̵Ŀγ�
		
		
		return professors;
	}

	@Override
	public Person findBySsn(String ssn,int type) {
		// TODO Auto-generated method stub
		Student p = new Student("lifengyi", "09143564", "Math", "M.S.","123456");
		if(ssn.equals(p.getSsn())){
			return null;
		}
		else{
			return null;
		}
	}

}