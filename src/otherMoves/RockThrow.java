package otherMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class RockThrow extends PhysicalMove {
    public RockThrow() {
        super(Type.ROCK, 50, 0.9);
    }

    @Override
    protected String describe() {
        return "бросает камень в цель";
    }
}
