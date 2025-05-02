public class Book{
 public void displayInfo(String libraryName, String title, String author){
  System.out.println("library Name : " + libraryName);
  System.out.println(" book title : " + title);
  System.out.println(" book author : " + author); 
  }
   public static void main(String [] args){
    Book book= new Book();
    book.displayInfo("City public library", "The Great Gatsby", "F.Scott Fitzgerald");
    book.displayInfo("City public library", "1984", "George Orwell");
  }
}
 
