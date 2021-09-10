package LiskovSubstitution;
public class financeBook extends nonFictionalBook {
    int id=120;
    String name="Rich Dad Poor Dad";
    String author="Robert T. Kiyosaki";

    public static void main(String[] args) {
        financeBook f = new financeBook();
        System.out.println(f.name+" is a finance book and belong to nonfictional book");
    }
}