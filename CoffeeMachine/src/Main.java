//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimdMilkAmound = 1290;
        int lowLactoseMilkAmount = 1000;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;
        boolean isBlocked = true;
        boolean milkIsEnough = skimdMilkAmound >= cappuchinoMilkRequired || milkAmount >= cappuchinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        if(!isBlocked) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Кофемашина заблокирована");
        }

        if(coffeeAmount >= cappuchinoCoffeeRequired &&
            milkAmount >= cappuchinoCoffeeRequired) {
            System.out.println("Готовим капучино");
        } else {
            System.out.println("Ингредиентов недостаточно");
        }

        if(milkAmount >= cappuchinoCoffeeRequired ||
            skimdMilkAmound >= cappuchinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока недостаточно");
        }

//        if(!isBlocked && milkAmount >= cappuchinoCoffeeRequired && coffeeAmount >= cappuchinoCoffeeRequired) {
//            System.out.println("Готовим кофе");
//        } else {
//            System.out.println("Что-то пошло не так :(");
//        }

//        if(skimdMilkAmound >= cappuchinoMilkRequired || milkAmount >= cappuchinoMilkRequired || lowLactoseMilkAmount >= cappuchinoMilkRequired) {
//            System.out.println("Молока достаточно");
//        } else {
//            System.out.println("Молока недостаточно");
//        }

        if(!isBlocked && coffeeAmount >= cappuchinoCoffeeRequired && (skimdMilkAmound >= cappuchinoMilkRequired ||  milkAmount >= cappuchinoMilkRequired)) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так");
        }


        if(!isBlocked && coffeeIsEnough && milkIsEnough) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так");
        }


    }
}