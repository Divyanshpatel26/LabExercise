import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter first and last name");
		String fname="rahul";
		String lname ="";
	
		try
		{
			checkName(fname,lname);
		}
		catch(NameErrorException e) {
			System.out.println("Incorrect name");
		}
	}

	private static void checkName(String fname, String lname) throws NameErrorException {
		if(fname.length()==0 && lname.length()==0)
		{
			System.out.println("Correct Name");			
		}
		else
		{
			throw new NameErrorException();
		}
		
	}

}
