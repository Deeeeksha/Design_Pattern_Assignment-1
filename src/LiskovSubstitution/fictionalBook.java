package LiskovSubstitution;

public class fictionalBook implements Book{
    int id=125;
    String name="Avengers";
    String author="Stan lee";
    public static void main(String[] args) {
        nonFictionalBook d = new nonFictionalBook();
        System.out.println("Fictional is a category of book");
    }
}