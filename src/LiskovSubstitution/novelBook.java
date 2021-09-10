package LiskovSubstitution;

public class novelBook extends nonFictionalBook{
    int id=129;
    String name="Invisible Man";
    String author="Ralph Ellison";

    public static void main(String[] args) {
        novelBook n = new novelBook();
        System.out.println(n.name+" is a novel book and belong to nonfictional book");
    }
}