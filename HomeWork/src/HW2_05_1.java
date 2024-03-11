public class HW2_05_1 {
    public static void main(String[] args) {
        int paperReserve = 600000; // запас бумаги
        int inkReserve = 600000; // запас чернил
        int coverReserve = 2000; // запас листов для обложек

        double printRollerMinTemp = 80.5; // нижняя граница температуры
        double printRollerMaxTemp = 120.75; // верхняя граница температуры

        //Динамические данные
        int pagesInBook = 530; // задание на печать - количество страниц в книге
        int booksCount = 2000; // задание на печать - количество книг
        boolean coldPrintingMode = false;  // режим холодной печати
        double printRollerTemp = 50; // текущаяя температура ролика

        int papersCount = booksCount * pagesInBook / 2;
        int inkedPaperCount = papersCount + booksCount;

        boolean consumables = paperReserve >= papersCount && inkReserve >= inkedPaperCount && coverReserve >= booksCount;
        boolean printingTemperature = printRollerTemp > printRollerMinTemp && printRollerTemp < printRollerMaxTemp;


        if (consumables && printingTemperature || coldPrintingMode) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }

    }
}
