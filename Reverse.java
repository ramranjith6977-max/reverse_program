
import java.util.Scanner;
class Reverse
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int rev=0;
		
		System.out.print("Enter your No: ");
		int n = sc.nextInt();
		
		while (n != 0)
		{
			rev = rev * 10  + n % 10;
			n = n / 10; 
		}
		
		System.out.println("Reverse Number is "+ rev);
	}
}
