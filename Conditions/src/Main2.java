public class Main2 {
    public static void main(String[] args) {
        final int maxWeight = 5000;
        final int minCost = 1000;
        int weight = 3200;
        int cost = 750;
        boolean isDeliveryFree = true;

        if(weight > maxWeight || cost < minCost) {
            System.out.println("Платная доставка");
        } else {
            System.out.println("Доставка бесплатная");
        }

        if(weight <= maxWeight && cost > minCost) {
            System.out.println("Доставка бесплатная");
        } else {
            System.out.println("Платная доставка");
        }

        if(!isDeliveryFree) {
            System.out.println("Доставка платная");
        } else {
            System.out.println("Доставка бесплатная");
        }

    }
}
