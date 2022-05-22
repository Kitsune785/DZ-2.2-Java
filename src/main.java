public class main {
    public static void main(String[] args) {

        int totalBonus;
        int customerAccount = 100;
        int bonus = 100;
        int payment = 1100;

        if (payment >=1000) {
            totalBonus = payment / bonus;
        }
        else {
            totalBonus = 0;
        }

        int totalCustomerAccount = customerAccount + payment + totalBonus;

        System.out.println("Ваш счет пополнен на " + payment + " руб.");
        System.out.println("Ваш бонус равен " + totalBonus + " руб.");
        System.out.println("Ваш баланс равен " + totalCustomerAccount + " руб.");
    }
}

