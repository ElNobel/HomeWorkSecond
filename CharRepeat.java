import java.util.ArrayList;
import java.util.HashSet;

public class CharRepeat {
    public static void outRepeat(String incomeString) {
        char[] incomeStringToChar = incomeString.toCharArray();
        HashSet<Character> hasThisChar = new HashSet<>();

        for (int i = 0; i < incomeStringToChar.length; i++) {
            if (hasThisChar.contains(incomeStringToChar[i])) {
                continue;
            } else {
                hasThisChar.add(incomeStringToChar[i]);
            }
            ArrayList<Integer> positions = new ArrayList<>();
            positions.add(i);
            for (int j = i + 1; j < incomeStringToChar.length; j++) {

                if (incomeStringToChar[i] == incomeStringToChar[j]) {
                    positions.add(j);
                }
            }
            System.out.print(incomeStringToChar[i] + " in position ");
            for (Integer p : positions) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}