import java.util.ArrayList;
import java.util.Scanner;


public class Loader {
    public static void main(String[] args) {

        Cat paren = new Cat();
        Cat vasya = new Cat();


        paren.setName("Парень");
        vasya.setName(paren.getName());
        vasya.setWeight(paren.getWeight());

        System.out.println(String.format("%.2f", paren.getWeight()));

        paren.feed(1000);
        paren.checkStatus();
        vasya.setStatus(paren.getStatus());

        System.out.println(paren.getName());
        System.out.println(String.format("%.2f", paren.getWeight()));
        System.out.println(paren.getStatus().getLocalisation());
        System.out.println("##########################################");
        System.out.println(vasya.getName());
        System.out.println(String.format("%.2f", vasya.getWeight()));
        System.out.println(vasya.getStatus().getLocalisation());
       /* int number = 1;
        int catCount;
        boolean action = true;
        ArrayList<Cat> catsAll = new ArrayList<>();
        ArrayList<Cat> catsAlive = new ArrayList<>();

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
            catsAll.add(cat);
            catsAlive.add(cat);

            System.out.println("\tКошка №: " + number++);
            System.out.println("\tЦвет кошки: " + cat.getColor().getLocalisation());
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

            cat.checkStatus();
       //     for (Cat cat:catsAll) {
                switch (cat.getStatus()){
                    case DEAD:
                        System.out.println("Кошка умерла, грустно :(");
                        System.out.println("\tКошка весила перед смертью: " + String.format("%.2f", cat.getWeight()));
                        catsAlive.remove(catsAlive.size()-1);
                        break;
                    case ALIVE:
                        System.out.println("Кошечка смотрит на вас -_-");
                        System.out.println("\tКошка весит: " + String.format("%.2f", cat.getWeight()));
                        break;
                    case SLEEP:
                        System.out.println("Zzzzz");
                        System.out.println("\tКошка весит: " + String.format("%.2f", cat.getWeight()));
                        break;
                    case EXPLODED:
                        System.out.println("Взорвалась кошка!");
                        System.out.println("\tКошка весила перед взрывом: " + String.format("%.2f", cat.getWeight()));
                        catsAlive.remove((catsAlive.size())-1);
                        break;
                    default:
                        System.out.println("ПОхуй");
                }
       //    }
            System.out.println(cat.sumFeed() + "\n================================");
            action = true;

        }

        while (action) {
            System.out.print("Всего кошек: ");
            System.out.println(catsAll.size());
            System.out.print("Живые кошки " + catsAlive + ": ");
            System.out.println(catsAlive.size());
            System.out.print("Проверить статус всех кошек. Введите индекс кошки (начиная с нуля): ");
            Scanner sc2 = new Scanner(System.in);
            int index = sc2.nextInt();
            System.out.println(catsAll.get(index).getStatus().getLocalisation());
            System.out.println("\tКошка весит: " + String.format("%.2f", catsAll.get(index).getWeight()));
            System.out.println("\n########################################\n");
            System.out.println("Повторить?");

            if (sc.hasNext("нет")) {
                action = false;                 // с консоли получаем "нет" - цикл становится false и прекращается!
            } else if (sc.hasNext("да")){
                sc.next();
            }

        }*/
    }
}

