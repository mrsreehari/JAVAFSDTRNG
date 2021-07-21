package com.ust.examples;

class StudentNotFoundException extends Exception {
	 
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class stud{
	stud(){
		
	}
}


class StudentManager {
 
    public Stud1 find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("123456")) {
            return new Stud1();
        } else {
            throw new StudentNotFoundException(
                "Could not find student with ID " + studentID);
        }
    }
}


public class Exception8 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
 
        try {
 
            Stud1 student = manager.find("0000001");
 
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
    }
}
