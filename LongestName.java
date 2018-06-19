import java.util.ArrayList;
import java.util.Arrays;

public class LongestName {
    public static void main(String[] args) {

        LongestNameFinder();
    }
    public static void LongestNameFinder() {
        ArrayList <String> names = new ArrayList<>(Arrays.asList("Natali","John","Jecki","Molly","Den", "Rich","Kate", "Ann"));
        //ArrayList <String> names = new ArrayList<>();
        String temp;
        temp=names.get(0);
        try {
            for (String check: names) {
                if (temp.length()<check.length()) {
                    temp = check;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Your ArrayList is empty!");
        }
        System.out.println(temp);
//        for (String check:names) {
//            System.out.println(check.length());
//        }
    }
}
