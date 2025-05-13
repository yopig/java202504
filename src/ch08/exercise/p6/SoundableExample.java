package ch08.exercise.p6;

public class SoundableExample {
    public static void printSound(soundablew s) {
        System.out.println(s.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
