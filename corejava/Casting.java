package corejava;
class Organization
{
	int probessionperiod;
	int casualleaves;
	String qualification;

	public void setpolicy ()
	{
		probessionperiod =1;
		casualleaves=15;
		qualification="M.E.";


	}

	public void getpolicy()
	{
		System.out.println("probession period will be:"+probessionperiod+" Months");
		System.out.println("Casual leaves are :"+casualleaves+" in a year");
		System.out.println("Qualification must be:"+qualification);
	}
}

class TrainingOrganization extends Organization
{
	String certification;

	public void setPolicy()
	{
		super.setpolicy();
		super.getpolicy();

		System.out.println("New policies are :");

		probessionperiod =2;
		casualleaves=18;
		certification="J2EE";
	}

	public void getcertification()
	{
		System.out.println("Certification should be :"+certification);
	}
}
public class Casting {
	public static void main(String[] args) {
		Organization to=new TrainingOrganization();
		//dynamic binding,upcasting
		to.setpolicy();   //dynamic method dispatch
		to.getpolicy();
		
		TrainingOrganization t=(TrainingOrganization)to;
		//TrainingOrganization t1=(TrainingOrganization) new Organization();
		//superclass reference veriable is casted with subclass 
		//downcasting
		t.setPolicy();
		t.getpolicy();
		t.getcertification();
	}
}
