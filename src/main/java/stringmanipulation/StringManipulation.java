package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        char[] unpreparedLetters = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < unpreparedLetters.length; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(unpreparedLetters[i]);
            }
        }
        return stringBuilder.toString();
    }
}