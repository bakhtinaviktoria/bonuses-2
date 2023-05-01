public class Main {
    public static void main(String[] args) {
        int initialAmount = 100; // начальная сумма
        int replenishmentAmount = 5000; // сумма пополнения
        int balance = initialAmount + replenishmentAmount; // Итоговый баланс

        int bonus;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
            System.out.println("Итоговая сумма " + (balance + bonus) + " рублей.");
        } else
            System.out.println("Итоговая сумма " + balance + " рублей.");
    }
}