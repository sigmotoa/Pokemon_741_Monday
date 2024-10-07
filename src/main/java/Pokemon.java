import java.util.Arrays;
import java.util.stream.IntStream;

public class Pokemon {
    private String name;
    int id;
    PokemonType type;
    int life;
    Skill[] skill;

    public Pokemon(String name, PokemonType type)
    {
        this.name=name;
        this.id=(int) (Math.random()*10);
        this.type=type;
        this.life=100;
        Skill r1 = new Skill();
        r1.name="Breath";
        r1.level=50;
        r1.id=1;
        //this.skill[skill.length]=r1;

    }

    @Override
    public String toString() {
        return "___________________________\n" +
                "Pokemon{\n" +
                "name='" + name + '\'' +
                ", \nid=" + id +
                ", \ntype=" + type +
                ", \nlife=" + life +
                ", \nskill=" + Arrays.toString(skill) +
                '}';
    }
}

enum PokemonType{
    electric,
    grass,
    poisson,
    ghost,
    fire,
    fight,
    water,
    normal,
    dark,
    fairy,
    dragon,
    rock,
    ground,
    pshyco
}
