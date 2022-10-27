package pokemons;

import otherMoves.FocusBlast;
import statusMoves.Confide;
import statusMoves.DoubleTeam;
import statusMoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tangrowth extends Pokemon {
    public Tangrowth(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(100, 100, 125, 110, 50, 50);
        this.addMove(new Swagger());
        this.addMove(new Confide());
        this.addMove(new DoubleTeam());
        this.addMove(new FocusBlast());
    }
}
