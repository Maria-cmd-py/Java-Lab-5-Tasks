class Books {
    String title;
    String author;
    int bookID;
    Books(String title, String author,int bookID){  // Constructor
        this.title = title;
        this.author = author;
        this.bookID = bookID; }
}
class Member extends Books {
    String name;
    String date;
    Member(String title, String author,int bookID,String name, String date){ // Constructor
        super(title, author, bookID);
        this.name = name;
        this.date = date; }
    void displayDetail(){ //  function to display detail
        System.out.println("Book : " + title + ", Author : " + author + ", ID:" + bookID + ".");
        System.out.println("Borrowed By: " + name + ", on : " + date + ".");
    }
}
public class LibrarySystem {
    public static void main(String[]args){
        Member m1 = new Member("OOPs in Java","John Doe",102,"Maria Atta","2025-03-12");
        m1.displayDetail();
    }
}
