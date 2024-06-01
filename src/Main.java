public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        //Task 2
        System.out.println("\n\nTask 2");

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        //Task 3
        System.out.println("\n\nTask 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }

        //Task 4
        System.out.println("\n\nTask 4");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        //Task 5
        System.out.println("\n\nTask 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        //Task 6
        System.out.println("\nTask 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        //Task 7
        System.out.println("\n\nTask 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        //Task 8
        System.out.println("\n\nTask 8");

        int savingsMonthly = 29000;
        int savingsTotal = 0;

        for (int i = 1; i <= 12; i++) {
            savingsTotal += savingsMonthly;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsTotal + " рублей");
        }

        //Task 9
        System.out.println("\n\nTask 9");

        int savingsTotalWithInterest = 0;

        for (int i = 1; i <= 12; i++) {
            savingsTotalWithInterest += savingsTotalWithInterest / 100;
            savingsTotalWithInterest += savingsMonthly;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsTotalWithInterest + " рублей");
        }

        //Task 10
        System.out.println("\nTask 10");

        int multiplicationBase = 2;
        int multiplicationResult;

        for (int i = 1; i <= 10; i++) {
            multiplicationResult = multiplicationBase * i;
            System.out.println(multiplicationBase + " * " + i + " = " + multiplicationResult);
        }


    }
}