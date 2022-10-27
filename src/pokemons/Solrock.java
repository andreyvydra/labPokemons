package pokemons;

import otherMoves.FlareBlitz;
import otherMoves.RockThrow;
import statusMoves.CalmMind;
import statusMoves.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Solrock extends Pokemon {
    public Solrock(String name, int level) {
        super(name, level);
        this.setType(Type.PSYCHIC, Type.ROCK);
        this.setStats(90, 95, 85, 55, 65, 70);
        this.addMove(new RockThrow());
        this.addMove(new FlareBlitz());
        this.addMove(new DoubleTeam());
        this.addMove(new CalmMind());
    }
}
