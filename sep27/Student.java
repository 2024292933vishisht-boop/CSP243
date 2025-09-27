package sep27;

import java.util.Scanner;

class Student_info{
	static int count = 0;
	Scanner scanner=new Scanner(System.in);
	String student_name;
	int student_id;
	int student_marks;
	public static void stcount() {
		System.out.println("Total students: " + count);
	}
	public Student_info(String name , int id,int marks) {
		student_name = name;
		student_id = id;
		student_marks = marks;
		count++;
	}
	@Override
	public String toString() {
		return "Student_info [student_name=" + student_name + ", student_id=" + student_id + ", student_marks="
				+ student_marks + "/100]";
	}
	
}

public class Student {
	public static void main(String[] args) {
		Student_info anant = new Student_info("Anant", 1000, 97);
		Student_info prabhakar = new Student_info("Prabhakar", 1001 , 90);
		Student_info aditya = new Student_info("Aditya", 1002, 95);
		Student_info.stcount();
		System.out.println(anant);
	}
	
}
