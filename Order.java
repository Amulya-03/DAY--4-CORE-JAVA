public class Order{
 public String getOrderDetails(String restaurantName, String fooditem, int quantity){
  return "RestaurantName :" + restaurantName + "\nFood item: " + fooditem + "\n Quantity: " + quantity;
  }
   public static void main(String [] args){
   Order order = new Order();
   System.out.println(order.getOrderDetails("Spice Garden", "Panner Butter Masala", 2));
   System.out.println(order.getOrderDetails("Spice Garden", "Chicken Biryani", 1));
   }
}
