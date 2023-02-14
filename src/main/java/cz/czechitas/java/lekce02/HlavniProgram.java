package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        zofka.turnRight(180);

        for (int i = 0; i < 4; i++) {
            zofka.move(150);
            zofka.turnLeft(90);
        }

        zofka.turnLeft(135);

        for (int i = 0; i < 2; i++) {
            zofka.move(105);
            zofka.turnRight(90);
        }

        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(350);
        zofka.turnLeft(90);

        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(150);
            zofka.turnLeft(90);
        }

        zofka.turnLeft(135);

        for (int i = 0; i < 2; i++) {
            zofka.move(105);
            zofka.turnRight(90);
        }

        zofka.turnRight(225);
        zofka.penUp();
        zofka.move(350);
        zofka.penDown();

        for (int i = 0; i < 2; i++) {
            zofka.move(200);
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnRight(90);
        }

        zofka.turnRight(135);
        zofka.move(106);
        zofka.turnLeft(90);
        zofka.move(106);
        zofka.turnLeft(45);
        zofka.move(50);

        for (int i = 0; i < 2; i++) {
            zofka.turnRight(45);
            zofka.move(50);
            zofka.turnRight(180);
            zofka.move(50);
            zofka.turnLeft(90);
            zofka.move(50);
            zofka.turnRight(180);
            zofka.move(50);
            zofka.turnRight(45);
            zofka.move(80);
        }


        //TODO tady bude kód
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
