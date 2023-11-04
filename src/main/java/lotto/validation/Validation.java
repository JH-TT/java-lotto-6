package lotto.validation;

import java.util.HashSet;
import java.util.List;

public class Validation {
    private static final int LOTTO_PRISE = 1000;
    private static final int ZERO = 0;
    public static void checkIsDivideByThousand(final String input) {
        if (Integer.parseInt(input) % LOTTO_PRISE != 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkIsNatural(final int input) {
        // checkIsNumber를 통과했기 때문에 0인지만 확인하면 된다.
        if (input == ZERO) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkLottoNumberLength(final int length, final List<Integer> lotto) {
        if (lotto.size() != length) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkLottoNumberRange(final int start, final int end, final List<Integer> lotto) {
        for (Integer num : lotto) {
            checkNumberIsBetweenStartAndEnd(start, end, num);
        }
    }

    public static void checkNumberIsBetweenStartAndEnd(final int start, final int end, final int num) {
        if (num < start || num > end) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkDuplicate(final List<Integer> lotto) {
        if (new HashSet<>(lotto).size() != lotto.size()) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkLottoNumbersHasBonusNumber(final List<Integer> lotto, final int bonus) {
        if (lotto.contains(bonus)) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkStringConsistOfNaturalNumbers(final String[] target) {
        for (String numbers : target) {
            checkIsNumber(numbers);
        }
    }

    public static void checkIsNumber(final String numbers) {
        for (char c : numbers.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException();
            }
        }
    }
}
