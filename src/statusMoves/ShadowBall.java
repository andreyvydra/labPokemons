package statusMoves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 1.00);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect();
        e.chance(0.2);
        e.stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "выпускает теневой шар";
    }
}
