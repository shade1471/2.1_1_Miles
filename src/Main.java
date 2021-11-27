public class Main {
    public static void main(String[] args) {
        // Проставить цену билета
        int priceTicket = 36435;
        // Стоимость одной бонусной мили
        int oneMileCost = 20;

        ////

        int bonus = priceTicket / oneMileCost;
        System.out.println("Количество ваших бонусных миль - " + bonus);

    }
}
