public class HW2_07_1 {
    public static void main(String[] args) {
        boolean errors = false;
        String message;
        if (!errors) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }

        message = !errors ? "Печать разрешена": "Печать запрещена";
        System.out.println(message);
    }
}
