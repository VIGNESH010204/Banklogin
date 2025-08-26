package Iteration;

import java.util.Scanner;

public class Banklogin {

	public static void main(String[] args) {
		
		String username="thara_sweety";
		String password="Welcome123";
		Scanner din=new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter User ID");
			String getUser=din.next();
			System.out.println("Enter Password");
			String getPassword=din.next();
			if(username.equals(getUser)&& password.equals(getPassword))
			{
				System.out.println("Welcome!!" +getUser);
				break;
			}
			else
			{
				System.out.println("Incorrect Username or Password");
			}
		}

	}

}
