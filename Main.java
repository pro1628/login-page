import java.util.*;
public class Main {
	public static void main(String []args)
	{
		UserPass up = new UserPass();
		System.out.println("						********************* WELCOME *********************							");
		up.logIn();
	}
}

class UserPass{
	Punjab_Govt pg = new Punjab_Govt();
	Departments d = new Departments(); 
	Scanner  s = new Scanner(System.in);
	static String dept_name_list[] = {"Punjab_Sarkar", "Agriculture", "Animal Husbandry, Dairy Development and Fisheries", "Civil Aviation", "Cooperation",
			"Defence Services Welfare", "School Education", "Elections", "Excise and Taxation", "Employment Generation and Training", "Finance", "Food, Civil Supplies and Consumer Affairs",
			"Forest and Wild Life Preservation", "General Administration", "Governance Reforms & Public Grievances", "Social Justice, Empowerment and Minorities", "Health & Family Welfare",
			"Home Affairs and Justice", "Housing and Urban Development", "Industries and Commerce", "Information and Public Relation", "Information Technology",
			"Labour", "Legal and Legislative Affairs", "Local Government", "NRI Affairs"};
	
	String dept_pass_list[] = {"password"};
	
	public void logIn()
	{
		int flag = 0;
		System.out.println("Department Name :	");
		String deptName = s.next();
		for(int i=0;i<dept_name_list.length;i++)
		{
			if(dept_name_list[i].equals(deptName))
			{
				flag=1;
				pass(i);
			}
		}
		if(flag==0)
		System.out.println("Enter Correct Department Name!!!");
	}
	void pass(int i)
	{
		System.out.println("Password :	");
		String deptPass = s.next();
		if(deptPass  != dept_pass_list[0])                                 // if(deptPass  != dept_pass_list[i])
		{
			System.out.println("Enter Correct Password!!!");
		}
		if(i==0)
		{
			pg.homepage();
		}
		else
		{
			d.homepage();
		}
	}
}
class Punjab_Govt{
	void homepage()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Following are the Departments and Banks with all the Expenditures");
		System.out.println("Start Bidding for Banks");
		System.out.println("1.        Yes");
		System.out.println("2.        No");
		
		int option = s.nextInt();
		if(option == 1)
		{
			System.out.println("Time Given for Bid: (Please mention the time in hours)");
			double bidTime = s.nextDouble();
		}
	}
}
class Departments{
	void homepage()
	{
		
	}
}
