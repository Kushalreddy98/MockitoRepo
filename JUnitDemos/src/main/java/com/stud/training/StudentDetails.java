package com.stud.training;

import com.voya.exception.InvalidNumException;

public class StudentDetails {
	public int totalMarks(int marks1,int marks2,int marks3) {
		if(marks1<0 ||marks2<0||marks3<0) 
			throw new InvalidNumException("invalid numbers entered");
		if(marks1>100 ||marks2>100||marks3>100) 
			throw new InvalidNumException("invalid numbers entered");
		return marks1+marks2+marks3;
	}

}
