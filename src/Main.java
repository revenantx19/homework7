public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int summa = 0;
        int i = 1;
        while (summa < 2_459_000) {
            summa = summa + 15000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summa);
            i++;
        }
        System.out.println("\ntask2");
        i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        i = 10;
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n\ntask3");
        i = 1;
        int people = 12_000_000;
        for (; i <= 10; i++) {
            people = people + 12000*9;
            System.out.println("Год " + i + ", численность населения составляет " + people);
        }
        System.out.println("\ntask4");
        i = 1;
        double summa1 = 15000;
        while (summa1 <= 12_000_000){
            summa1 = summa1*1.07;
            summa1 = Math.round(summa1);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summa1);
            i++;
        }
        System.out.println("\ntask5");
        i = 1;
        summa1 = 15000;
        while (summa1 <= 12_000_000){
            summa1 = summa1*1.07;
            summa1 = Math.round(summa1);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + summa1);
            }
            i++;
        }
        System.out.println("\ntask6");
        i = 1;
        double summa2 = 15000;
        while (i <= 108) {
            summa2 *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + Math.round(summa2));
            }
            i++;
        }
        System.out.println("\ntask7");
        short friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println("\ntask8");
        int year = 1674;
        int preYear = year - 100;
        int futureYear = year + 200;
        i = 0;
        while (i < futureYear) {
            i++;
            if (i >= preYear && i <= futureYear && i % 79 == 0) {

                System.out.println(i);
            }
        }
    }
}