package homework3;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 3. Задание 1.");
        int currentYear = 2022;
        int beforeCurrentYear = currentYear - 200;
        int afterCurrentYear = currentYear + 100;
        for (int year = beforeCurrentYear; year <= afterCurrentYear ; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 3. Задание 2.");
        int number = 2;
        int result = number;
        for (int power = 1; power <= 10 ; power++){
            result = number * power;
            System.out.println(number + " * " + power + " = " + result);
        }
    }
}
