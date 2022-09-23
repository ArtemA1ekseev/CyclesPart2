package homework1;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1. Задание 1.");
        int Salary = 15000;
        int Total = 0;
        int i = 0;
        while (Total <= 2_459_000) {
            Total = Total + Total/100;
            Total = Total + Salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Total + " рублей.");
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 1. Задание 2.");
        int j = 1;
        while (j <= 10)
        {
            System.out.print(j+" ");
            j++;
        }
        System.out.println(" ");
        for (int l = 10; l >= 1; l--) {
            System.out.print(l+" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Домашнее задание - 1. Задание 3.");
        int CountryY = 12_000_000;
        int NewCountryY = 0;
        int BirthRate = (12_000_000 / 1_000) * 17;
        int Mortality = (12_000_000 / 1_000) * 8;
        int Difference = BirthRate - Mortality;
        NewCountryY = NewCountryY + CountryY;
        for (int g = 2022; g <= 2032; g++) {
            NewCountryY = NewCountryY + Difference;
            System.out.println("Год " + g + " численность населения составляет " + NewCountryY + ".");
        }
    }
}
