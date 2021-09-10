public class Main {

    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount = 1000;

        int bonus = depositAmount / 100;
        int balance = initialAccount + depositAmount;

        if (depositAmount >= 1000) {
            System.out.println("Ваш баланс: " + (balance + bonus));
            System.out.println("Бонусных рублей начислено: " + bonus);
        } else {
            System.out.println("Ваш баланс: " + balance);
            System.out.println("Бонусных рублей не начислено");
        }
    }
}
