package ch07.exercise.p08;

public class SnowTireExample {
    public static void main(String[] args) {
        ch07.exercise.p08.SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();
    }
}
