package LiskovSubstitution;

public class nonFictionalBook implements Book{
    int id=126;
    String name="The Beauty Myth";
    String author="Naomi Wolf";

    public static void main(String[] args) {
        nonFictionalBook d = new nonFictionalBook();
        System.out.println("nonFictional is a category of book");
    }
}