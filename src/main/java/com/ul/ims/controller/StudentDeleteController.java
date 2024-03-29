package com.ul.ims.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ul.ims.beans.StudentRegistration;

public class StudentDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/student/{regdNum}")
	
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
	System.out.println("In deleteStudentRecord");   
	    return StudentRegistration.getInstance().deleteStudent(regdNum);
	}
}
