package LiskovSubstitution;

public class superHeroesBook extends fictionalBook{
    int id=127;
    String name="Captain America";
    String author="Stan lee";

    public static void main(String[] args) {
        superHeroesBook s = new superHeroesBook();
        System.out.println(s.name+" is a super heroes book and belong to fictional book");
    }
}