package pokemons;

import otherMoves.FocusBlast;

public class Tangrowth extends Tangela {
    public Tangrowth(String name, int level) {
        super(name, level);
        this.setStats(100, 100, 125, 110, 50, 50);
        this.addMove(new FocusBlast());
    }
}
