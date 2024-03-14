public class PW2_11 {
    public static void main(String[] args) {
        int milkAmount = 2; // ml
        int powderAmount = 500; // g
        int eggsCount = 5; // items
        int sugarAmount = 20; // g
        int oilAmount = 30; // ml
        int appleCount = 3; // items
        int milkSubstitute = 1000; // ml
        boolean operationOfTheKitchenStove = false;
        int allDishes = 4;
        int tempDishes = 0;

        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Apple juice");
            tempDishes ++;
        }

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (!operationOfTheKitchenStove && powderAmount >= 400 && sugarAmount >= 10  && oilAmount >= 30 && (milkAmount >= 1000 || milkSubstitute >= 1000)) {
            System.out.println("Pancakes");
            tempDishes ++;
        }

        // milk - 300 ml, powder - 5 g, eggs - 5
        if (!operationOfTheKitchenStove && powderAmount >= 5 && eggsCount >= 5 && (milkAmount >= 300 || milkSubstitute >= 300)) {
            System.out.println("Omelette");
            tempDishes ++;
        }

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (!operationOfTheKitchenStove && appleCount >= 3  && powderAmount >= 300 && eggsCount >= 4 && (milkAmount >= 100 || milkSubstitute >= 100)) {
        System.out.println("Apple pie");
            tempDishes ++;
        }

        if (tempDishes == allDishes) {
            System.out.println("There are enough ingredients for any of the dishes :)");
        } else if (tempDishes >= 1 && tempDishes < 4) {
            System.out.println("There are enough ingredients for " + (allDishes - tempDishes) + " dishes :|");
        } else {
            System.out.println("Not enough ingredients :(");
        }
    }
}
