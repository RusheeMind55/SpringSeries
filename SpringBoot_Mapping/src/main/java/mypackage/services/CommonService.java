package mypackage.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mypackage.model.*;
import mypackage.repository.*;

@Service
public class CommonService {
	
	
	@Autowired
	IQualificationRepository qualrepo;
	
	@Autowired
	ISpecializationRepository sprepo;
	
	public void AddQualiifcation(Qualification q) {
		
		Qualification qs=new Qualification(0, q.getQualification_name(), null);
		Qualification qual=qualrepo.save(qs);
		for(Specialization s : q.getSpecializations())
		{
			Specialization sp=new Specialization(0, s.getSpecialization_name(), qual);
			sprepo.save(sp);
		}
		
		
	}
	
	public List<Qualification>GetQualifications(){
		List<Qualification>lst=qualrepo.findAll();
		return lst;
	}
	
//	public List<Qualification>GetQualificationsWisthSpecializations(){
//		System.out.println("Hi hello");
//		List<Qualification>lst=new ArrayList<>();
//		
//		for(Qualification q : qualrepo.findAll()) {
//		
//			Set<Specialization>splist=new TreeSet<>();
//			
//			for(Specialization s : sprepo.findAll())
//			{
//				System.out.println(s.getQualification().getQualification_id()+" "+s.getQualification().getQualification_name());
//				if(s.getQualification().getQualification_id()==q.getQualification_id())
//				{
//					Specialization spec =new Specialization(s.getSpecialization_id(), s.getSpecialization_name(), null);
//					splist.add(spec);
//				}
//			}
//			q.setSpecializations(splist);
//			System.out.println(q.getQualification_id()+" "+q.getQualification_name()+" "+q.getSpecializations().size());
//				lst.add(q);
//		}
//		System.out.println(lst.size());
//		
//		return lst;
//	}
	public List<Specialization>GetSpecializations(){
		return sprepo.findAll();
	}

}
