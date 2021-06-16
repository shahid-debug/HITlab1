package hit.day6;

import java.util.Scanner;

public class Grades {
	static Scanner scan = new Scanner(System.in); 
	public static void main (String[] args) 
	{ 
	double grade; 
	double sumOfGrades; 
	int numStudents;
	int numPass;  
	int numFail; 
	System.out.println ("\nGrade Processing Program\n"); 
	 
	sumOfGrades = 0; 
	numStudents = 0; 
	numPass = 0; 
	numFail = 0; 
	
	System.out.print ("Enter the first student's grade: "); 
	grade = scan.nextDouble(); 
	while (grade >= 0) 
	{ 
	sumOfGrades = sumOfGrades + grade; 
	numStudents = numStudents + 1; 
	if (grade < 60) 
	numFail = numFail + 1; 
	else 
	numPass = numPass + 1; 
	
	System.out.print ("Enter the next grade (a negative to quit): "); 
	grade = scan.nextDouble(); 
	} 
	if (numStudents> 0) 
	{ 
	System.out.println ("\nGrade Summary "); 
	System.out.println ("Class Average: " + sumOfGrades/numStudents); 
	System.out.println ("Number of Passing Grades: " + numPass); 
	System.out.println ("Number of Failing Grades: " + numFail); 
	} 
	else 
	System.out.println ("No grades processed.");
}
}
