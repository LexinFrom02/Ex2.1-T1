public class Main {
    public static void main(String[] args) {
        int accruedMiles;
        int ticketCostInRubles = 995;    // Стоимость билета - 995 рублей
        if (ticketCostInRubles >= 20) {
            accruedMiles = ticketCostInRubles / 20;
            System.out.println("Вам начислено " + accruedMiles + " миль");
        } else {
            System.out.println("Вам не начислено миль");
        }
    }
}
