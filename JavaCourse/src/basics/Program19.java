package basics;
import java.util.*;
class Authentication{
	private int n;
	private String [][]arr=new String[10][2];
	Authentication() {
		n=0;
	}
	Scanner sc=new Scanner(System.in);
	private void Register() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the user for registeration");
		arr[n][0]=sc.nextLine();
		System.out.println("Enter the password");
		arr[n][1]=sc.nextLine();
		n++;
	}
	private String Login() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the user for login");
		String s=sc.nextLine();
		System.out.println(s);
		for(int i=0;i<n;i++) {
			
			if(arr[i][0].equals(s)) {
				System.out.println("User exist ");
				return s;
			}
		}
		System.out.println("User not found");
		return "";	
	}
	private void ChangePassword() {
		Scanner sc=new Scanner(System.in);
		System.out.println("To change the password, you have to login first");
		String user=Login();
		if(user.equals("")) {
			System.out.println("User not found!!");
			return ;
		}
		System.out.println("Enter the old password:");
		String old_password=sc.nextLine();
		for(int i=0;i<n;i++) {
			if(arr[i][0].equals(user)) {
				if(arr[i][1].equals(old_password)) {
					System.out.println("Enter the new password to change:");
					String new_password=sc.nextLine();
					arr[i][1]=new_password;
					System.out.println("Password changed successfully!!");
					break;
				}
			}else {
				System.out.println("Enter correct password");
			}
		}
		
	}
	public void getData() {
		while(true) {
			System.out.println("Press 1 for registeration: ");
			System.out.println("Press 2 for login: ");
			System.out.println("Press 3 for Change password: ");
			int operation=sc.nextInt();
			switch (operation) {
			case 1: 
				Register();
				break;
			case 2:
				Login();
				break;
			case 3: 
				ChangePassword();
				
			}

		}
	}
	
}
public class Program19 {

	public static void main(String[] args) {
		Authentication a=new Authentication();
		a.getData();
	

	}

}
