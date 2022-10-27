package pokemons;

import statusMoves.CottonSpore;
import statusMoves.ShadowBall;
import statusMoves.SwordDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Pokemon {
    public Roselia(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(50, 60, 45, 100, 80, 65);
        this.addMove(new SwordDance());
        this.addMove(new ShadowBall());
        this.addMove(new CottonSpore());
    }
}
