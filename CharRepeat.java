
public class CharRepeat {
    public static boolean repeat(String[] income) {
        if (income == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < income.length; i++) {
            if (income[i] == null) {
                throw new IllegalArgumentException();
            }
        }

        boolean haveRepeat = false;
        for (int i = 0; i < income.length - 1; ++i) {
            for (int j = i + 1; j < income.length; ++j) {
                if (income[i].toLowerCase().equals(income[j].toLowerCase())) {
                    haveRepeat = true;
                }
            }
        }
        return haveRepeat;
    }

    public static boolean testRepeatMethod(String[] income, boolean answer) {
        return repeat(income) == answer;
    }
}