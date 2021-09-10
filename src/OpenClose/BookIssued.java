package OpenClose;

public class BookIssued {


    String date = "10/10/2021";

    void issuedBook(String name, String userName, String c) {

        System.out.println("The book " + name + " issued to " + userName + " on " + date);
        System.out.println("The category of " + name + " is " + c);
    }

    public static void main(String[] args) {
        booksOpenClosed B1 = new booksOpenClosed();
        User u1 = new User();
        BookIssued i1 = new BookIssued();
        i1.issuedBook(B1.name, u1.name, B1.category);
    }
}