public class PW2_11_2 {
    public static void main(String[] args) {

        int vasyaAge = 77;
        int katyaAge = 5;
        int mishaAge = 12;


        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else {
            min = mishaAge;
        }

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >=vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else {
            max = mishaAge;
        }

        if (vasyaAge >= katyaAge && vasyaAge <= mishaAge || (vasyaAge <= katyaAge && vasyaAge >= mishaAge)) {
            middle = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge <= mishaAge || (katyaAge <= vasyaAge && katyaAge >= mishaAge)) {
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);

    }
}
