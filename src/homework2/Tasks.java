package homework2;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 2. Задание 1.");
        int Deposit = 15_000;
        int Mont = 0;
        while (Deposit <= 12_000_000){
            int InterestRate = Deposit / 100 * 7;
            Deposit = Deposit+InterestRate;
            Mont++;
            System.out.println("Месяц " + Mont + " сумма накоплений равна " + Deposit);
        }
        System.out.println("Для того что бы Василий накопил 12 миллионов рублей ему понадобиться " + Mont + " месяцев");
        System.out.println(" ");
        System.out.println("Домашнее задание - 2. Задание 2.");
        int Deposit2 = 15_000;
        int Mont2 = 0;
        while (Deposit2 <= 12_000_000){
            int InterestRate = Deposit2 / 100 * 7;
            Deposit2 = Deposit2+InterestRate;
            Mont2++;
            if (Mont2 % 6 == 0){
                System.out.println("Месяц " + Mont2 + " сумма накоплений равна " + Deposit2);
            }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 2. Задание 3.");
        int Deposit3 = 15_000;
        int Mont3 = 0;
        while (Mont3 <= 107){
            int InterestRate = Deposit3 / 100 * 7;
            Deposit3 = Deposit3+InterestRate;
            Mont3++;
            if (Mont3 % 6 == 0){
                System.out.println("Месяц " + Mont3 + " сумма накоплений равна " + Deposit3);
           }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 2. Задание 4.");
        int FridayIndex = 2;
        while (FridayIndex <= 31){
                System.out.println("Сегодня пятница, "+ FridayIndex +"-е число. Необходимо подготовить отчет.");
            FridayIndex = FridayIndex + 7;
        }
    }
}
