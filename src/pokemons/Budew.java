package pokemons;

import statusMoves.CottonSpore;
import statusMoves.ShadowBall;
import statusMoves.SwordDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(40, 30, 35, 50, 70, 55);
        this.addMove(new SwordDance());
        this.addMove(new ShadowBall());
    }
}
