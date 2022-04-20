package se.lexicon;

/**
 * CAR TEST
 *
 */

public class App {
    public static void main(String[] args) {
        Car volvo = new Car("blue", "200ph", 2022);
        Person hamed = new Person(1, "Hamed");
        volvo.setOwner(hamed);

        System.out.println(volvo.drive());
    }



}
