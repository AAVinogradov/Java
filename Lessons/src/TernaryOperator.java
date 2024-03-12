public class TernaryOperator {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;
        boolean isPersonal = true;
//        Обычный стандартный вариант
//        String message;
//        if (passIsValid && !inCarantine) {
//            message = "Проход открыт";
//        } else {
//            message = "Проход закрыт";
//        }
//        System.out.println(message);

//        String message = passIsValid && !inCarantine ? // тернарный оператор
//            "Проход открыт": "Проход закрыт"; // части - их должно быть 3 - условие и результат если выполняется и если не выполняется
//
//        System.out.println(message);

        String message = passIsValid && !inCarantine ? // тернарный оператор
                "Проход открыт":
                (isPersonal ? "Проход открыт только для персонала" : "Проход закрыт"); // части - их должно быть 3 - условие и результат если выполняется и если не выполняется, в данном случае это сложный пример для понимания и такое применять не рекомендуется
        System.out.println(message);

        if (passIsValid && !inCarantine) {
            message = "Проход открыт";
        } else if (isPersonal) {
            message = "Проход открыт только для персонала";
        } else {
            message = "Проход закрыт";
        }
        System.out.println(message);
    }
}
