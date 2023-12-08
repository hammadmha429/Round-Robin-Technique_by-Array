package RR;

import java.util.Scanner;

public class stack {

	int c=0,d=0,f=0;
	node[] no = new node[10];
	stack()
	{
		for(int i=0 ; i<10 ; i++)
		{
			no[i]= new node();
		}
	}
	public void Enqueue(Scanner s)
	{
		if(c==d && f==1)
		{
			System.out.println("Full queue!");
		}
		else
		{
			no[c++].input(s);
			if(c==10)
			{
				c=0;
				f=1;
			}
		}
	}
public void display() {
		 if(f==0) {
		 if(c==0) 
		 System.out.println("Queue Is Empty");
		 else {
		 for(int i=d;i<c;i++) 
		 no[i].display();
		 } }
		 else
		 {
		 for(int i=d;i<10;i++) 
		 no[i].display();
		 for(int i=0;i<c;i++) 
		 no[i].display();
		 }
		}

	

public void Dequeue()
{
	if(c==d && f==0)
	{
		System.out.println("Empty queue!");
	}
	else
	{
		no[d].time=no[d].time-2;
		if(no[d].time<=0)
		{
		d++;
		if(d==10)
		{
			d=0;
			f=0;
		}
		}
		else
		{
			no[c]=no[d];
			no[d] = new node();
			c++;
			d++;
			if(d==10)
			{
				d=0;
				f=0;
			}
			
		}
	}
}
	
}
