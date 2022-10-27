package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import statusMoves.Confide;
import statusMoves.CottonSpore;
import statusMoves.ShadowBall;
import statusMoves.SwordDance;

public class Roserade extends Pokemon {
    public Roserade(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(60, 70, 65, 125, 105, 90);
        this.addMove(new SwordDance());
        this.addMove(new ShadowBall());
        this.addMove(new CottonSpore());
        this.addMove(new Confide());
    }
}
