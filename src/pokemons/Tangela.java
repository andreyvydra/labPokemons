package pokemons;

import statusMoves.Confide;
import statusMoves.DoubleTeam;
import statusMoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tangela extends Pokemon {
    public Tangela(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(65, 55, 115, 100, 40, 60);
        this.addMove(new Confide());
        this.addMove(new Swagger());
        this.addMove(new DoubleTeam());
    }
}
