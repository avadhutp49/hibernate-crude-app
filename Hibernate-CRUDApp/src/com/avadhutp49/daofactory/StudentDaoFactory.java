package com.avadhutp49.daofactory;

import com.avadhutp49.dao.IStudentDao;
import com.avadhutp49.dao.StudentDaoImpl;

public class StudentDaoFactory {

	private StudentDaoFactory() {
		//make constuctor private to avoid object creation from outside environment.
	}

	private static IStudentDao studentDao = null;
	public static IStudentDao getStudentDao() {
		//singleton pattern code
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}
