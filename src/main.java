public class main {
    public static void main(String[] args) {

        int totalbonus;
        int customeraccount = 100;
        int bonus = 100;
        int payment = 1100;

        if (payment >=1000) {
            totalbonus = payment / bonus;
        }
        else {
            totalbonus = 0;
        }

        int totalcustomeraccount = customeraccount + payment + totalbonus;

        System.out.println("Ваш счет пополнен на " + payment + " руб.");
        System.out.println("Ваш бонус равен " + totalbonus + " руб.");
        System.out.println("Ваш баланс равен " + totalcustomeraccount + " руб.");
    }
}

