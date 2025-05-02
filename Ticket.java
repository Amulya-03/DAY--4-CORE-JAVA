public class Ticket{
 public String getTicketInfo(String theaterName, String movieName, String seatNo){
  return "Theater Name :" + theaterName + "\n Movie Name : " + movieName + "\n Seat No: " + seatNo;
  }
   public static void main(String [] args){
   Ticket ticket = new Ticket();
   System.out.println(ticket.getTicketInfo("Galaxy Cinemas", "Intersteller", "A10"));
   System.out.println(ticket.getTicketInfo("Galaxy Cinemas", "Inception", "B12"));
   }
}
