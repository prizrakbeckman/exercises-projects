package ma.priz.algorithms.matching;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class ParenthesisMatcher {
    public static final char PARENTHESIS_RIGHT = ')';
    public static final char PARENTHESIS_LEFT = '(';

    static boolean areBalanced(String formatted) {
        Deque<Character> queue = new ArrayDeque<>();

        char currentChar;
        Character check;

        for (int i = 0; i < formatted.length(); i++) {

            currentChar = formatted.charAt(i);

            if (currentChar == PARENTHESIS_LEFT) {
                queue.push(currentChar);
                continue;
            }


            check = queue.pop();
            if (currentChar == PARENTHESIS_RIGHT && (Objects.isNull(check) || check.charValue() != PARENTHESIS_LEFT)) {
                return false;
            }
        }
        return queue.isEmpty();
    }

    private ParenthesisMatcher() {

    }
}
