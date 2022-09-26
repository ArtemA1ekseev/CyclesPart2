package homework1;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1. Задание 1.");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (Total <= 2_459_000) {
            total = total + total/100;
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
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
        int countryY = 12_000_000;
        int newCountryY = 0;
        int birthRate = (12_000_000 / 1_000) * 17;
        int mortality = (12_000_000 / 1_000) * 8;
        int difference = birthRate - mortality;
        newCountryY = newCountryY + countryY;
        for (int g = 2022; g <= 2032; g++) {
            newCountryY = newCountryY + difference;
            System.out.println("Год " + g + " численность населения составляет " + newCountryY + ".");
        }

    }
}
