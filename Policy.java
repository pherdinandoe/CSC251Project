public class Policy {
   
   private String policyNum;
   private String providerName;
   private String firstName, lastName;
   private String smokingStatus;
   private int age;
   private double height, weight;
   
   public Policy() {
      //set default values
   }
   
   public Policy(String iPolicyNum, String iProviderName, String iFirstName, 
                  String iLastName, String iSmokingStatus, int iAge, double iHeight, 
                  double iWeight) {
      //accepts arguments
      policyNum = iPolicyNum;
      providerName = iProviderName;
      firstName = iFirstName;
      lastName = iLastName;
      smokingStatus = iSmokingStatus;
      age = iAge;
      height = iHeight;
      weight = iWeight;
   }
   
   //setter methods
   public void setPolicyNum(String a) {
      policyNum = a;
   }
   
   public void setProviderName(String b) {
      providerName = b;
   }
   
   public void setFirstName(String c) {
      firstName = c;
   }
   
   public void setLastName(String d) {
      lastName = d;
   }
   
   public void setSmokingStatus(String e) {
      smokingStatus = e;
   }
   
   public void setAge(int f) {
      age = f;
   }
   
   public void setHeight(int g) {
      height = g;
   }
   
   public void setWeight(int h) {
      weight = h;
   }
   
   //getter methods
   public String getPolicyNum() {
      return policyNum;
   }
   
   public String getProviderName() {
      return providerName;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   public double getAge() {
      return age;
   }
   
   public double getHeight() {
      return height;
   }
   
   public double getWeight() {
      return weight;
   }
   
   public double calculateBMI() {
      double BMI = (weight * 703 ) / (height * height);
      return BMI;
   }
   
   public double calculatePrice() {
      double price = 600;
      double BMI = calculateBMI();
      
      if (age > 50)
         price += 75;
      
      if (smokingStatus == "smoker")
         price += 100;
         
      if (BMI > 35)
         price += (BMI - 35) * 20;
         
      return price;
   }
      
}