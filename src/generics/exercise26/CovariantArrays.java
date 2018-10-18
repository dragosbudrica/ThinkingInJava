package generics.exercise26;

public class CovariantArrays {
    public static void main(String[] args) {
        Number[] number = new Integer[10];
        number[0] = 1;
        number[1] = 2;
        try {
            number[0] = 5L;
        } catch(Exception e) { System.out.println(e); }
        try {
            number[0] = 10F;
        } catch(Exception e) { System.out.println(e); }
    }
}
