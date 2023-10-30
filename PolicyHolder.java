public class PolicyHolder {
   //declare class fields
   private String firstName, lastName;
   private String smokingStatus;
   private int age;
   private double height, weight;
   
   //no-arg constructor
   public PolicyHolder() {
   }
   
   //copy constructor
   public PolicyHolder(PolicyHolder object2) {
      firstName = object2.firstName;
      lastName = object2.lastName;
      smokingStatus = object2.smokingStatus;
      age = object2.age;
      height = object2.height;
      weight = object2.weight;
   }
   
   /**
      The setFirstName method sets the policy holder's first name
      @param c The policy holder's first name
   */
   public void setFirstName(String c) {
      firstName = c;
   }

   /**
      The setLastName method sets the policy holder's last name
      @param d The policy holder's last name
   */
   public void setLastName(String d) {
      lastName = d;
   }

   /**
      The setSmokingStatus method sets the policy holder's smoking status
      @param e The policy holder's smoking status
   */
   public void setSmokingStatus(String e) {
      smokingStatus = e;
   }
   
   /**
      The setAge method sets the policy holder's age
      @param f The policy holder's age
   */
   public void setAge(int f) {
      age = f;
   }
   
   /**
      The setHeight method sets the policy number
      @param a The policy number
   */
   public void setHeight(int g) {
      height = g;
   }

   /**
      The setWeight method sets the policy holder's weight
      @param h The policy holder's weight
   */
   public void setWeight(int h) {
      weight = h;
   }
   
   //getter methods
   
   /**
      The getFirstName method gets the policy holder's first name
      @return The policy holder's first name
   */
   public String getFirstName() {
      return firstName;
   }
   
   /**
      The getLastName method gets the policy holder's last name
      @return The policy holder's last name
   */
   public String getLastName() {
      return lastName;
   }
   
   /**
      The getSmokingStatus method gets the policy holder's smoking status
      @return The policy holder's smoking status
   */
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   /**
      The getAge method gets the policy holder's age
      @return The policy holder's age
   */
   public double getAge() {
      return age;
   }
   
   /**
      The getHeight method gets the policy holder's height
      @return The policy holder's height
   */
   public double getHeight() {
      return height;
   }
   
   /**
      The getWeight method gets the policy holder's weight
      @return The policy holder's weight
   */
   public double getWeight() {
      return weight;
   }
   
   /**
      The calculateBMI method calculates the policy holder's BMI
      @return The policy holder's BMI
   */
   public double calculateBMI() {
      double BMI = (weight * 703 ) / (height * height);
      return BMI;
   }

}