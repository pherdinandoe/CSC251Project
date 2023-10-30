public class Policy {
   //declare all private class fields
   private String policyNum;
   private String providerName;
   private PolicyHolder policyHolder;
   //static field to count number of Policy objects created
   private static int instanceCount = 0;

   //no-arg constructor that sets default values for all fields
   public Policy() {
   instanceCount++;
   }
   
   //constructor that takes arguments for all class fields
   public Policy(String policyNum, String providerName, PolicyHolder policyHolder) {
      //intialize all class fields
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.policyHolder = new PolicyHolder(policyHolder); //assign copy of PolicyHolder object
      instanceCount++;
   }
   
   /**
      The setPolicyNum method sets the policy number
      @param a The policy number
   */
   public void setPolicyNum(String a) {
      policyNum = a;
   }
   
   /**
      The setProviderName method sets the provider name
      @param b The provider's name
   */
   public void setProviderName(String b) {
      providerName = b;
   }
   
   /**
      The setPolicyHolder method sets the provider name
      @param policyHolder The policy holder object
   */
   public void setPolicyHolder(PolicyHolder policyHolder) {
      this.policyHolder = new PolicyHolder(policyHolder); //assign copy of object
   }
   
   //getter methods
   
   /**
      The getPolicyNum method gets the policy number
      @return The policy number
   */
   public String getPolicyNum() {
      return policyNum;
   }
   
   /**
      The getProviderName method gets the provider name
      @return The provider's name
   */
   public String getProviderName() {
      return providerName;
   }
   
   /**
      The getPolicyHolder method returns a copy of the PolicyHolder object
      @return A copy of the PolicyHolder object
   */
   public PolicyHolder getPolicyHolder() {
      return new PolicyHolder(policyHolder);
   }
   
   /**
      The calculatePrice method calculates the policy price
      @return The policy price
   */
   public double calculatePrice() {
      double price = 600;
      
      if (policyHolder.getAge() > 50)
         price += 75;
      
      if (policyHolder.getSmokingStatus() == "smoker")
         price += 100;
         
      if (policyHolder.calculateBMI() > 35)
         price += (policyHolder.calculateBMI() - 35) * 20;
         
      return price;
   }
   
   /**
      The toString method converts object field information to a String
      @return The data in the object's fields
   */
   public String toString() {
      String str = String.format("\nPolicy Number: %s" +
                                 "\nProvider Name: %s" +
                                 policyHolder.toString() + 
                                 "\nPolicy Price: $%.2f",
                                 policyNum, providerName, this.calculatePrice());
      return str; 
   }
   
   /**
      The getInstanceCount method returns the number of policy objects created
      @return The number of policy objects created
   */
   public int getInstanceCount() {
      return instanceCount;
   }
      
}