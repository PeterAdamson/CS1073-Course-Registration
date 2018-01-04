//Author: Peter Adamson 3319005

public class Program{

	private String programName;

	private static int coreCourses;

	private static int electives;

	public Program(String aname, int courseRequired, int electiveRequired){

		programName = aname;

		coreCourses = courseRequired;

		electives = electiveRequired;

	}

	public Program(){

	}

	public void setCore(int core){

		coreCourses = core;

	}

	public void setElective(int number){

		electives = number;

	}

	public static int getCore(){

		return coreCourses;

	}

	public static int getElective(){

		return electives;

	}


}
