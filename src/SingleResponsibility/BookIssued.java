package SingleResponsibility;


public class BookIssued {


    String date= "01/09/2021";
    void issuedBook(String name,String n){

        System.out.println("The book "+name+" issued to "+n+" on "+date);
    }

    public static void main(String[] args) {
        Book B1 =new Book();
        User u1 = new User();
        BookIssued i1 =new BookIssued();
        i1.issuedBook(B1.name,u1.name);
    }
}