//Author: Peter Adamson

public class Student{

	private int studentID;

	private int startYear;

	private int numberOfCoreCourses;

	private int numberOfElectives;

	private String status = "NEW";

	public Student(int ID, int year){

		studentID = ID;

		startYear = year;

	}

	public Student(){

	}

	public int getStudentID(){

		return studentID;

	}

	public int getStartYear(){

		return startYear;

	}

	public void setNumberOfCoreCourses(int addCourses){

		numberOfCoreCourses += addCourses;

		status = "IN PROGRESS";
	}

	public void setNumberOfElectives(int addElectives){

		numberOfElectives += addElectives;		
		
		status = "IN PROGRESS";

	}

	public int getNumberOfCoreCourses(){

		return numberOfCoreCourses;

	}

	public int getNumberOfElectives(){

		return numberOfElectives;

	}

	private void setStatus(String aStatus){

		status = aStatus;

	}

	public String audit(Program aProgram){

		if(Program.getCore() == numberOfCoreCourses && Program.getElective() == numberOfElectives){

			status = "COMPLETE";

		}

		return status;			

	}

}
