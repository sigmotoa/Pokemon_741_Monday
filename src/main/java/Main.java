public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Bulbasaur",PokemonType.grass);
        Pokemon p2 = new Pokemon("Charmander",PokemonType.fire);
        //p1.id = 1;
        //p1.name = "bulbasaur";
        //p1.type=PokemonType.grass;
        //p1.life=100;
        Skill s1 = new Skill();
        s1.id = 1;
        s1.name = "Latigo";
        s1.level = 30;
        Skill s2 = new Skill();
        s2.id=2;
        s2.name = "hojas";
        s2.level = 25;
        p1.skill = new Skill[]{s1,s2};

        System.out.println(p1);
        System.out.println(p2);

    }
}
