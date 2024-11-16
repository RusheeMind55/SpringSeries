package mypackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import mypackage.model.*;
import mypackage.services.*;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 

@RestController
public class CommonApiController {
	
	@Autowired
	CommonService service;
	
	@PostMapping("/api/addqualification")
	public String AddQualificationData(@RequestBody Qualification q) {
		 service.AddQualiifcation(q);
		return "Qualification data added successfully";
	}
	
@GetMapping("/api/qualification")
public List<Qualification> GetQualifications() {
    return service.GetQualifications();
}

@GetMapping("/api/specialization")
public List<Specialization> GetSpecilaizations() {
    return service.GetSpecializations();
}
}
