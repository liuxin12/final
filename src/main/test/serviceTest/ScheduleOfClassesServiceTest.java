package serviceTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;

import dao.DaoFactory;
import dao.ScheduleDao;
import daoImpl.sqlite.ScheduleDaoImpl;
import model.ScheduleOfClasses;
import service.ScheduleOfClassesService;
import model.Section;

public class ScheduleOfClassesServiceTest {
	
	static class listBoxDTO{
		private String id;
		private String text;
		private listBoxDTO(String id, String text){
			this.id = id;
			this.text = text;
		}
		
	}
	
	@Test
	public void test(){
//		String semester = "SP2005";		
//		Gson g = new Gson();		
//		
//		try {
//			ScheduleOfClassesService scs = new ScheduleOfClassesService(semester, DaoFactory.createSectioneDao());
//			Map<String, Section> sections = scs.getScheduleOfClasses().getSectionsOffered();
//			List<listBoxDTO> dtos = new ArrayList<listBoxDTO>();
//			for(String key : sections.keySet()){
//				dtos.add(
//						new listBoxDTO(sections.get(key).getFullSectionNo()
//								       , sections.get(key).getFullSectionInfo()));
//			}			
//			String json = g.toJson(dtos);
//			System.out.println(json);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			fail();
//		}
	}
	@Test
	public void test1(){
//		ScheduleOfClassesService scs = new ScheduleOfClassesService("1", DaoFactory.createSectioneDao());
//		HashMap<String,Section> sections = scs.getScheduleOfClasses().getSectionsOffered();
//		for(Section i : sections.values()){
//			System.out.println(i.getDayOfWeek()+i.getRepresentedCourse().getCourseName());
//			System.out.println("`````");
//		}
	}
	

}
