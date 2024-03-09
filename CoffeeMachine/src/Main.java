//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimdMilkAmound = 1290;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;
        boolean isBlocked = true;

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

        if(!isBlocked && milkAmount >= cappuchinoCoffeeRequired && coffeeAmount >= cappuchinoCoffeeRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :(");
        }

    }
}