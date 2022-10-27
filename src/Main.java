import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Tangela p1 = new Tangela("Чужой", 1);
        Tangrowth p3 = new Tangrowth("Сверепый", 1);
        Budew p5 = new Budew("Лютый", 1);

        Solrock p4 = new Solrock("Уничтожитель", 1);
        Tangela p2 = new Tangela("Хищник", 1);
        Roselia p6 = new Roselia("Прилипала", 1);
        Roserade p8 = new Roserade("Небожитель", 1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.addFoe(p8);
        b.go();
    }
}
