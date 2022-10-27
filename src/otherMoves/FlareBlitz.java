package otherMoves;

import ru.ifmo.se.pokemon.*;

public class FlareBlitz extends PhysicalMove {
    public FlareBlitz() {
        super(Type.FIRE, 120, 1.0);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP,  (int) v / 3);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
        Effect burnEffect = new Effect().chance(0.1);
        pokemon.setCondition(burnEffect);
        Effect.burn(pokemon);
    }

    @Override
    protected String describe() {
        return "жгёт";
    }
}
