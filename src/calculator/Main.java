package calculator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
    {
		Calculator c= new Calculator();
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter no.of Expressions");
        //no.of expressions to be evaluated
		int n=sc.nextInt();
		//initializing result to zero
		double result=0;
		int choice;
		String[] s={"Addition","Subtraction","Multiplication","Division"};
		while(n>0)
		{
			System.out.print("1.Addition\n2.subtraction\n3.Multiplication\n4.division\n");
			System.out.print("Enter operation:");
			//enter user choice of operation
			choice=sc.nextInt();
			//if choice is not a valid choice 
			if(choice<1 || choice>4)
			{
				System.out.print("Invalid choice");
				return;
			}
			//if choice is valid
			else
			{
				System.out.println("Enter First number");
				double first=sc.nextInt();
				System.out.println("Enter Second number");
				double second=sc.nextInt();
				//user call to addition
				if(choice==1)
				{
					result=c.add(first,second);
				}
				//user call to subtraction
				else if(choice==2)
				{   
					result=c.subtract(first,second);
				}
				//user call to multiplication
				else if(choice==3)
				{      
					result=c.multiply(first,second);
				}
				//user call to division
				else if(choice==4)
				{     
					result=c.divide(first,second);
				}
				System.out.println(s[choice-1]+" of "+first+" and "+second+" is "+result);
			}
	      }
		}
}
