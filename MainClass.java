package RR;

import java.util.Scanner;

public class MainClass {

	public static int menu(Scanner s)
	{
		int r;
		do {
			System.out.println("1: Enter a process :"
					+ "\n2: iterate the processor :"
					+ "\n3: Display processes ");
			r=s.nextInt();
		}while(r!=1 && r!=2 && r!=3);
		return r;
	}
	
	public static void main(String [] args)
	{
		stack st = new stack();
		Scanner obj  = new Scanner(System.in);
		
		do {
			int ch=menu(obj);
			switch(ch)
			{
			case 1:
				st.Enqueue(obj);
				break;
			case 2:
				st.Dequeue();
				break;
			case 3:
				st.display();
				break;
			}
		}while(true);
	}
	
}//mainclass
