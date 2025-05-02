public class Patient{
 public void printDetails(String hospitalName, String patientName, int age){
  System.out.println("Hospital Name :" + hospitalName);
  System.out.println("Patient Name :" + patientName);
  System.out.println("Patient age : " + age); 
  }
   public static void main(String [] args){
   Patient patient= new Patient();
   patient.printDetails("City care Hospital", "John Doe", 45);
   patient.printDetails("City care Hospital", "Emma Waston", 30);
  }
}
