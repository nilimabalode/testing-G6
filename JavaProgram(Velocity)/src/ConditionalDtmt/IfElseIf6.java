package ConditionalDtmt;

public class IfElseIf6 {

	public static void main(String[] args) {
		
		String ProjectDomain="Banking";
		
		
		if (ProjectDomain == "HealthCare")
		{
		System.out.println("Medical Work Related ");	
		}
		else if(ProjectDomain == "Banking")
		{
			System.out.println("Money Related Work");
	}
		else if(ProjectDomain == "Telecom")
		{
			System.out.println("Communication Related Work");
	}
		else if(ProjectDomain == "Banking Portal")
		{
			System.out.println("Work Releted To Travelling Ticket");
	}
		else
		{
			System.out.println("Random Project Domain");
		}
	}
}
