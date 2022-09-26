package homework2;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 2. Задание 1.");
        int deposit = 15_000;
        int mont = 0;
        while (deposit <= 12_000_000){
            int interestRate = deposit / 100 * 7;
            deposit = deposit+interestRate;
            mont++;
            System.out.println("Месяц " + mont + " сумма накоплений равна " + deposit);
        }
        System.out.println("Для того что бы Василий накопил 12 миллионов рублей ему понадобиться " + mont + " месяцев");
        System.out.println(" ");
        System.out.println("Домашнее задание - 2. Задание 2.");
        int deposit2 = 15_000;
        int mont2 = 0;
        while (deposit2 <= 12_000_000){
            int interestRate = deposit2 / 100 * 7;
            deposit2 = deposit2+interestRate;
            mont2++;
            if (mont2 % 6 == 0){
                System.out.println("Месяц " + mont2 + " сумма накоплений равна " + deposit2);
            }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 2. Задание 3.");
        int deposit3 = 15_000;
        int mont3 = 0;
        while (mont3 <= 107){
            int interestRate = deposit3 / 100 * 7;
            deposit3 = deposit3+interestRate;
            mont3++;
            if (mont3 % 6 == 0){
                System.out.println("Месяц " + mont3 + " сумма накоплений равна " + deposit3);
           }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 2. Задание 4.");
        int fridayIndex = 2;
        while (fridayIndex <= 31){
                System.out.println("Сегодня пятница, "+ fridayIndex +"-е число. Необходимо подготовить отчет.");
            fridayIndex = fridayIndex + 7;
        }
    }
}
