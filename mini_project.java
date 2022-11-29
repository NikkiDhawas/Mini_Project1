
package com.velocity.quiz;

import java.util.Scanner;

public class mini_project {

	public static void main(String[] args)
	{

		
		String answer1 = "";
		String answer2 = "";
		String answer3 = "";
		String answer4 = "";
		String answer5 = "";
		String answer6 = "";
		String answer7 = "";
		String answer8 = "";
		String answer9= "";
		String answer10 = "";
		Scanner scan = new Scanner ( System.in);
		int numberCorrect1 = 0;
		int questions = 4;
		System.out.println( " What is the sum of 2 and 2 ( What is 2 + 2)? ");
		System.out.println( " A: 1");
		System.out.println( " B: 2");
		System.out.println( " C: 3");
		System.out.println( " D: 4");
		
		answer1 = scan.nextLine ();
		if (answer1.equals("D"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ QUE1 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		System.out.println( " Number of primitive data types of JAVA are ? ");
		System.out.println( " A: 1");
		System.out.println( " B: 6");
		System.out.println( " C: 7");
		System.out.println( " D: 8");
		
		answer1 = scan.nextLine ();
		if (answer1.equals("D"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ QUE 2 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		System.out.println( " What is the type of float and double in JAVA ? ");
		System.out.println( " A: 1");
		System.out.println( " B: 6");
		System.out.println( " C: 32 & 64");
		System.out.println( " D: 8");
		
		answer2 = scan.nextLine ();
		if (answer2.equals("C"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ QUE 3 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		System.out.println( " Arrays in JAVA ARE ? ");
		System.out.println( " A: objects");
		System.out.println( " B: primitive data tpes");
		System.out.println( " C: Object refrences");
		System.out.println( " D: none");
		
		answer3 = scan.nextLine ();
		if (answer3.equals("A"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ QUE 4 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		System.out.println( " Which of the following is not a Java features ? ");
		System.out.println( " A: Dynamic");
		System.out.println( " B: Architecture Neutral");
		System.out.println( " C: Use of pointers");
		System.out.println( " D: Object-oriented");
		
		answer4 = scan.nextLine ();
		if (answer4.equals("C"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
		//@@@@@@@@@@@@@@@@@@@@@@@ QUE 5 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		System.out.println( " _____ is used to find and fix bugs in the Java programs ? ");
		System.out.println( " A: JVM");
		System.out.println( " B: JRE");
		System.out.println( " C: JDK");
		System.out.println( " D: JDB");
		
		answer5 = scan.nextLine ();
		if (answer5.equals("D"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}

		//@@@@@@@@@@@@@@@@@@@@@@@@@@ QUE 6 @@@@@@@@@@@@@@@@@@@@@@@@@
		
		System.out.println( " What is the return type of the hashCode() method in the Object class ? ");
		System.out.println( " A: Object");
		System.out.println( " B: int");
		System.out.println( " C: JDK");
		System.out.println( " D: JDB");
		
		answer6 = scan.nextLine ();
		if (answer6.equals("B"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ QUE 7 @@@@@@@@@@@@@@@@@@@@@@@@@@@

		
		System.out.println( " What does the expression float a = 35 / 0 return ? ");
		System.out.println( " A: Object");
		System.out.println( " B: int");
		System.out.println( " C: INFINITY");
		System.out.println( " D: JDB");
		
		answer7 = scan.nextLine ();
		if (answer7.equals("C"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@ QUE 8 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		


		
		System.out.println( " Which of the following is true about the anonymous inner class ? ");
		System.out.println( " A: Object");
		System.out.println( " B: int");
		System.out.println( " C: INFINITY");
		System.out.println( " D: It has no class name\r\n" + 
				"");
		
		answer8 = scan.nextLine ();
		if (answer8.equals("D"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}

		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ QUE 9 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		System.out.println( " An interface with no fields or methods is known as a ______ ? ");
		System.out.println( " A: Object");
		System.out.println( " B: Marker Interface");
		System.out.println( " C: INFINITY");
		System.out.println( " D: It has no class name\r\n" + 
				"");
		
		answer9 = scan.nextLine ();
		if (answer9.equals("B"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ QUE 10 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		System.out.println( "  Which of the following is an immediate subclass of the Panel class ? ");
		System.out.println( " A: Applet class");
		System.out.println( " B: Marker Interface");
		System.out.println( " C: INFINITY");
		System.out.println( " D: It has no class");
		
		answer10 = scan.nextLine ();
		if (answer10.equals("A"))
		{
			System.out.println(" good job, thats coreect");
			numberCorrect1 = numberCorrect1 + 1;
			
		}
		else
		
		{
			System.out.println(" that's wrong");
		}
		
		double numCorrect = 0;
		//***********************************************************************
		double grade = numCorrect/4.0*100.0;
		
	}
	

	}


