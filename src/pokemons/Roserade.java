package pokemons;

import statusMoves.Confide;

public class Roserade extends Roselia {
    public Roserade(String name, int level) {
        super(name, level);
        this.setStats(60, 70, 65, 125, 105, 90);
        this.addMove(new Confide());
    }
}
