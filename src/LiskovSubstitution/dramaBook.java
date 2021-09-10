package LiskovSubstitution;

public class dramaBook extends fictionalBook{
    int id=128;
    String name="Romeo and Juliet";
    String author="William Shakespeare";

    public static void main(String[] args) {
        dramaBook d = new dramaBook();
        System.out.println(d.name+" is a drama book and belong to fictional book");
    }
}