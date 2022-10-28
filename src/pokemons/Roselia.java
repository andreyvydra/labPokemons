package pokemons;

import statusMoves.CottonSpore;

public class Roselia extends Budew {
    public Roselia(String name, int level) {
        super(name, level);
        this.setStats(50, 60, 45, 100, 80, 65);
        this.addMove(new CottonSpore());
    }
}
