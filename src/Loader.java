import javax.naming.Name;
import java.util.Scanner;


public class Loader {
    public static void main(String[] args) {
        int number = 1;
        int catCount;
        boolean action = true;

//#######################################################################################################
//        Генерация кошек!

        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько кошек сгенерировать? ");

        do {
            System.out.println("Введите положительное число:");
            while (!sc.hasNextInt()) {
                System.out.println("Это не число! Введите положительное число:");
                sc.next();
            }
            catCount = sc.nextInt();
        } while (catCount < 0);

        for (int i = 0; i < catCount; i++) {
            Cat cat = new Cat();

            System.out.println("\tКошка №: " + number++);
            System.out.println("\tКошка весит: " + String.format("%.2f", cat.getWeight()) + " грамм");

//###############################################################################################################
//            Взаимодействие с кошкой


            while (action) {
                System.out.println("Вы хотите взаимодействовать с кошкой? (да/нет)");
                Scanner sc2 = new Scanner(System.in);
                if (sc2.hasNext("да")) {
                    System.out.println("Введите что-то одно: поиграть, покормить, ничего");
                    sc2.next();
                    while (!(sc2.hasNext("покормить")) ^ !(sc2.hasNext("поиграть")) ^ !(sc2.hasNext("ничего"))) {
                        System.out.println("Не распознаю команду! Жду слова...");
                        sc2.next();
                    }
                    if (sc2.hasNext("поиграть")) {
                        cat.meow();
                    }
                    if (sc2.hasNext("покормить")) {
                        cat.feed(1000.0);
                        if (cat.isExploded() || cat.isDead()) {
                            action = false;
                            continue;
                        }
                        String alarm = (cat.getWeight() >= 4000) ? "ХВАТИТ КОРМИТЬ КОШКУ! ОНА СЕЙЧАС ЛОПНЕТ!\n" : "";
                        System.out.print(alarm);
                    }
                }
                if (sc2.hasNext("нет")) {
                    action = false;                 // с консоли получаем "нет" - цикл становится false и прекращается!
                }
            }

            if (cat.isExploded() || cat.isDead()) {
                System.out.println("\t" + cat.getStatus() + "\n================================");
                System.out.println(cat.sumFeed() + "\n================================");
                System.out.println("\tКоличесвто живых кошек: " + Cat.catCount + "\n*********************************\n\n");
                action = true;
            } else {
                System.out.println("\tКошка весит: " + String.format("%.2f", cat.getWeight()));
                System.out.println("\t" + cat.getStatus() + "\n================================");
                System.out.println(cat.sumFeed() + "\n================================");
                System.out.println("\tКоличесвто живых кошек: " + Cat.catCount + "\n*********************************\n\n");
                action = true;
            }
        }
    }
}

