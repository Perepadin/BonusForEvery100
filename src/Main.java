public class Main {
    public static void main(String[] args) {

        int balance = 7000;
        int transfer = 1600;

        int bonus;

        if (transfer >= 1000) {
            bonus = transfer / 100;
        } else {
            bonus = 0;
        }
        int total = balance + transfer + bonus;

        System.out.println("Текущий баланс:");
        System.out.println(balance);

        System.out.println("Сумма перевода:");
        System.out.println(transfer);

        System.out.println("Всего начислено бонуснов:");
        System.out.println(bonus);

        System.out.println("Общий баланс:");
        System.out.println(total);

    }
}
