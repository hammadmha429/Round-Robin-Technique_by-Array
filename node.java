package RR;

import java.util.Scanner;

public class node {
String pname;
int time;

public void input(Scanner s)
{
	System.out.println("Enter a process name : ");
	pname=s.next();
	System.out.println("Enter the time required : ");
	time=s.nextInt();
}

public void display()
{
	System.out.println("process name is : "+pname
			+"process time is : "+time);
}
}
