//import Scanner class
import java.util.Scanner;

public class Project_Fernando_Bonilla {

   public static void main(String args[]) {
   
      //declare all variables needed for class fields
      String policyNum;
      String providerName;
      String firstName, lastName;
      String smokingStatus;
      int age;
      double height, weight;
      
      //create Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      //get user input
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      age = keyboard.nextInt();
      //clear newline character from buffer
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //Create Policy object with user inputs
      Policy policy = new Policy(policyNum, providerName, firstName, lastName, smokingStatus,
                                 age, height, weight);
      
      //Output policy object fields
      System.out.println("Policy Number: " + policy.getPolicyNum());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder’s First Name: " + policy.getFirstName());
      System.out.println("Policyholder’s Last Name: " + policy.getLastName());
      System.out.println("Policyholder’s Age: " + policy.getAge());
      System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder’s BMI: %.2f", policy.calculateBMI());
      System.out.println();
      System.out.printf("Policy Price: $%.2f", policy.calculatePrice());
   
   
   }

}