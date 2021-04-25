import java.util.*;
class SEqual
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		if(s1.equals(s2)==true)
		{
			System.out.println("Yes! Equal");
		}
		else
		{
			System.out.println("No! NotEqual");
	    }
	}
}
