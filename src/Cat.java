import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
public class Cat {
    private double originWeight;
    private double weight;

    private double feed;

    private double minWeight;
    private double maxWeight;

    public static int catCount;

   // DecimalFormat decimalFormat = new DecimalFormat("#.##");


    public Cat() {

        catCount++;
        weight = 1500 + 3000 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 5000.0;

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

   /* public String getWeight() {
    //    String resultWeight = decimalFormat.format(weight);
        return String.format("%.2f", weight);
    }*/

    public String getStatus() {
        if (weight < minWeight) {
            Cat.catCount--;
            return "Умерла :(";
        } else if (weight > maxWeight) {
            Cat.catCount--;
            return "ВЗОРВАЛАСЬ!";
        } else if (weight > originWeight) {
            return "Спит Zzzzz";
        } else {
            return "Кошка на вас смотрит...";
        }
    }

    public boolean isExploded() {
        return weight > maxWeight;

    }

    public boolean isDead() {
        return weight < minWeight;

    }
}