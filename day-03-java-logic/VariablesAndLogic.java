public class VariablesAndLogic {
 public static void main(String[] args) {
  
    int experienceYears = 14;
    boolean isAutomationPath = false;

    System.out.println("Experience: " + experienceYears + " years");

    if(isAutomationPath) {
       System.out.println("Path locked for 90 days");
     } else {
	System.out.println("Path not decided");
     }
}
}