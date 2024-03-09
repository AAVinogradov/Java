//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Система рассчета стоимости топлива: ");
        
        int fuelType = 95;
        int amount = 420;
        boolean hasDiscount = amount > 10;
//        var hasDiscount = amount > 10; автоматическое определение типа данных

        double fuel92prise = 60.2;
        double fuel95prise = 67.33;
        double discount = 0.1;
        String wrongFuelTypeMessage = "Указан не верный вид топлива";
        int maxAmount = 400;

        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92prise;
        } else if(fuelType == 95) {
            fuelPrice = fuel95prise;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if(hasDiscount) {
            fuelPrice = (1 - discount) * fuel92prise;
        }
        if(amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        if(amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            amount = maxAmount;
        }

        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб";

        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки " + totalPrice + " руб");

    }
}