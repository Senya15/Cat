import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
public class Cat {
    public static final int LEGS_COUNT = 4;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 5000.0;
    private CatColor color;

    private double originWeight;
    private double weight;
    private double feed;
    private String name;
    private CatStatus status;

    public Cat() {

        weight = 1500 + 3000 * Math.random();
        originWeight = weight;
        color = CatColor.values()[new Random().nextInt(CatColor.values().length)];

    }

    public void pee() {
        weight = weight - 200;
        System.out.println("Кошка сходила в туалет...");
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Мяу ^_^");
    }

    public void feed(double feed) {
        System.out.println("\tКормим кошку...");
        this.feed = this.feed + feed;
        weight = weight + feed;
    }

    public double sumFeed() {
        System.out.print("\tЕды съела :");
        return this.feed;
    }


    public void drink(Double amount) {
        weight = weight + amount;

    }

    public void checkStatus() {
        if (weight < MIN_WEIGHT) {
            this.status = CatStatus.DEAD;
        } else if (weight > MAX_WEIGHT) {
            this.status = CatStatus.EXPLODED;
        } else if (weight > originWeight) {
            this.status = CatStatus.SLEEP;
        } else {
            this.status = CatStatus.ALIVE;
        }
    }

    public boolean isExploded() {
        return weight > MAX_WEIGHT;

    }

    public boolean isDead() {
        return weight < MIN_WEIGHT;

    }
}