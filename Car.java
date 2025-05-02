public class Car{
 public void displayDetails(String showroomName, String modelName, int price){
  System.out.println("showroom Name :" + showroomName);
  System.out.println(" car model :" + modelName);
  System.out.println(" car price : " + price); 
  }
   public static void main(String [] args){
   Car Car= new Car();
   Car.displayDetails("Elite Moters", "Telsa Model", 80000);
   Car.displayDetails("Elite Moters", "Bmw X5", 75000);
  }
}
 


