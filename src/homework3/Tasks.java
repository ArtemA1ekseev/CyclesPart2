package homework3;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 3. Задание 1.");
        int CurrentYear = 2022;
        int BeforeCurrentYear = CurrentYear - 200;
        int AfterCurrentYear = CurrentYear + 100;
        for (int Year = BeforeCurrentYear; Year <= AfterCurrentYear ; Year++) {
            if (Year % 79 == 0) {
                System.out.println(Year);
            }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 3. Задание 2.");
        int Number = 2;
        int Result = Number;
        for (int Power = 1; Power <= 10 ; Power++){
            Result = Number * Power;
            System.out.println(Number + " * " + Power + " = " + Result);
        }
    }
}
