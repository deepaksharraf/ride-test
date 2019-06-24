package com.ul.ims.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ul.ims.beans.Student;
import com.ul.ims.errors.CustomErrors;

public class DataValidation {

	static Pattern pattern = null;
	static Matcher match = null;
	
	public static String validateName(Student student) {
		
		String NamePattern = "[A-Z][a-z]+( [A-Z][a-z]+)";
		
		pattern = Pattern.compile(NamePattern);
		match = pattern.matcher(student.getName());
		
		if (false == match.matches()) {
			return CustomErrors.INVALID_NAME_ENTERED;
		}
		
		return null;
	}
}
