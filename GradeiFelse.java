package operator;

import java.util.Scanner;

public class GradeiFelse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("성적 입력: ");
		int point = input.nextInt();
		char grade;
		
		if(90 <= point)
			grade = 'A';
		else if (80 <= point)
			grade = 'B';
		
		else if (70 <= point)
			grade = 'C';
		
		else 
			grade = 'F';
		System.out.println("학점: " + grade);
	
		

	}

}
