import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		try {
			checkAge(age);
		}
		catch(AgeLimitException e)
		{
			System.out.println("Below 15");
		}
	}

	private static void checkAge(int age) throws AgeLimitException {
		if(age>15)
		{
			System.out.println("Above 15");
		}
		else
		{
			throw new AgeLimitException();
		}
	}

}
