import java.util.Scanner;

public class IfElseCalenderMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		int n=obj.nextInt();
		if(n==1)
		{
			System.out.println("Jan");
		}
		else if(n==2)
		{
			System.out.println("Feb");
		}
		else if(n==3)
		{
			System.out.println("March");
		}
		else if(n==4)
		{
			System.out.println("April");
		}
		else if(n==5)
		{
			System.out.println("May");
		}
		else if(n==6)
		{
			System.out.println("June");
		}
		else if(n==7)
		{
			System.out.println("July");
		}
		else if(n==8)
		{
			System.out.println("Aug");
		}
		else if(n==9)
		{
			System.out.println("Sep");
		}
		else if(n==10)
		{
			System.out.println("Oct");
		}
		else if(n==11)
		{
			System.out.println("Nov");
		}
		else if(n==12)
		{
			System.out.println("Dec");
		}
		else
		{
			System.out.println("enter number btw 1- 12");
		}
		obj.close();
	}

}
