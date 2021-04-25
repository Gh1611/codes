import java.util.Scanner;
class Fact 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value:");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int f = 1;
		for(int i=1; i<=n; i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
}
