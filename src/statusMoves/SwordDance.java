package statusMoves;

import ru.ifmo.se.pokemon.*;

public class SwordDance extends StatusMove {
    public SwordDance() {
        super(Type.NORMAL, 0, 1.00);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect();
        e.stat(Stat.ATTACK, 2);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "показывает танец мечей";
    }
}
