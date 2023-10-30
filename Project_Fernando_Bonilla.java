//import Scanner class
import java.util.*;
import java.io.*;

public class Project_Fernando_Bonilla {

   public static void main(String args[]) throws IOException{
   
      //declare all variables needed for class fields
      String policyNum;
      String providerName;
      String firstName, lastName;
      String smokingStatus;
      int age;
      double height, weight;
      //variables for totalling smokers and non smokers
      int totalSmokers = 0, totalNonSmokers = 0;
      
      //create Scanner object for input
      //Scanner keyboard = new Scanner(System.in);
      
      //read from file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //create an ArrayList to hold Policy objects
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //while loop to read input as long as file has unread data
      while (inputFile.hasNext()) {
      
         //read in from file
         policyNum = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine(); //consume newline
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         inputFile.nextLine(); //consume newline
         weight = inputFile.nextDouble();
         
         //create new PolicyHolder object
         PolicyHolder newPolicyHolder = new PolicyHolder(firstName, lastName, 
                                       smokingStatus, age, height, weight);
         
         //create new Policy object
         Policy newPolicy = new Policy(policyNum, providerName, newPolicyHolder);
         
         //consume newline characters if file has more data
         if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
                                                
         //add Policy object to ArrayList
         policies.add(newPolicy);
      
      }
      
      //close the file
      inputFile.close();
      
      /*
      //display policy objects from ArrayList
      for(int i =0; i < policies.size(); i++) {
         System.out.println("Policy Number: " + policies.get(i).getPolicyNum());
         System.out.println("Provider Name: " + policies.get(i).getProviderName());
         System.out.println("Policyholder’s First Name: " + policies.get(i).getFirstName());
         System.out.println("Policyholder’s Last Name: " + policies.get(i).getLastName());
         System.out.println("Policyholder’s Age: " + policies.get(i).getAge());
         System.out.println("Policyholder’s Smoking Status (smoker/non-smoker): " + policies.get(i).getSmokingStatus());
         System.out.println("Policyholder’s Height: " + policies.get(i).getHeight() + " inches");
         System.out.println("Policyholder’s Weight: " + policies.get(i).getWeight() + " pounds");
         System.out.printf("Policyholder’s BMI: %.2f", policies.get(i).calculateBMI());
         System.out.println();
         System.out.printf("Policy Price: $%.2f", policies.get(i).calculatePrice());
         System.out.println();
         System.out.println();
         */
         
      //display policy objects from ArrayList using implicit call to the toString method
      for(int i =0; i < policies.size(); i++) {
         System.out.println(policies.get(i));
         
         //add to smokers or non-smokers
         if (policies.get(i).getPolicyHolder().getSmokingStatus().equals("smoker"))
            totalSmokers++;
         else
            totalNonSmokers++;
      }
      
      //display total number of policy objects created using static class field
      System.out.println();
      System.out.println("There were " + policies.get(0).getInstanceCount() + " Policy objects created.");
      //display total smokers and non-smokers
      System.out.println();
      System.out.println("The number of policies with a smoker is: " + totalSmokers);
      System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
      
      
      
      /**
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
      keyboard.nextLine(); //clear newline character from buffer
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      weight = keyboard.nextDouble();
      */
   
   }

}