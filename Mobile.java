public class Mobile{
 public void showDetails(String storeName, String brand, int price){
  System.out.println("store Name :" + storeName);
  System.out.println(" Mobile brand :" + brand);
  System.out.println(" Mobile price : " + price); 
  }
   public static void main(String [] args){
   Mobile mobile= new Mobile();
   mobile.showDetails("Tech World", "Apple", 1200);
   mobile.showDetails("Tech world", "Samsung", 900);
  }
}
