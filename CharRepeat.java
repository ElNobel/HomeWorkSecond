
public class CharRepeat {
    public static int repeat(String[] income) {
        if (income == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < income.length; i++) {
            if (income[i] == null) {
                throw new IllegalArgumentException();
            }
        }

        int countOfIterations = 0;
        for (int i = 0; i < income.length - 1; ++i) {
            for (int j = i + 1; j < income.length; ++j) {
                if (income[i].toLowerCase().equals(income[j].toLowerCase())) {
                    ++countOfIterations;
                }
            }
        }
        return countOfIterations;
    }

    public static boolean testRepeatMethod(String[] income, int answer) {
        int answerFromMethod = repeat(income);
        return answerFromMethod == answer;
    }
}