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
            System.out.println("������� ����");
        } else {
            System.out.println("���������� �������������");
        }

        if(coffeeAmount >= cappuchinoCoffeeRequired &&
            milkAmount >= cappuchinoCoffeeRequired) {
            System.out.println("������� ��������");
        } else {
            System.out.println("������������ ������������");
        }

        if(milkAmount >= cappuchinoCoffeeRequired ||
            skimdMilkAmound >= cappuchinoMilkRequired) {
            System.out.println("������ ����������");
        } else {
            System.out.println("������ ������������");
        }

//        if(!isBlocked && milkAmount >= cappuchinoCoffeeRequired && coffeeAmount >= cappuchinoCoffeeRequired) {
//            System.out.println("������� ����");
//        } else {
//            System.out.println("���-�� ����� �� ��� :(");
//        }

//        if(skimdMilkAmound >= cappuchinoMilkRequired || milkAmount >= cappuchinoMilkRequired || lowLactoseMilkAmount >= cappuchinoMilkRequired) {
//            System.out.println("������ ����������");
//        } else {
//            System.out.println("������ ������������");
//        }

        if(!isBlocked && coffeeAmount >= cappuchinoCoffeeRequired && (skimdMilkAmound >= cappuchinoMilkRequired ||  milkAmount >= cappuchinoMilkRequired)) {
            System.out.println("������� ����");
        } else {
            System.out.println("���-�� ����� �� ���");
        }


        if(!isBlocked && coffeeIsEnough && milkIsEnough) {
            System.out.println("������� ����");
        } else {
            System.out.println("���-�� ����� �� ���");
        }


    }
}