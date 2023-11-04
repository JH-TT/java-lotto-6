package lotto.utils;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import lotto.validation.Validation;

public class LottoUtils {
    private static final int START = 1;
    private static final int END = 45;
    private static final int LENGTH = 6;
    private static final String DELIMITER = ",";
    private static final int LOTTO_PRISE = 1000;
    public static List<Integer> generateRandomLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(START, END, LENGTH);
    }

    public static List<Integer> sortAsc(final List<Integer> lotto) {
        return lotto.stream().sorted().toList();
    }

    public static List<Integer> stringToList(String input) {
        String[] splitInput = input.split(DELIMITER);
        Validation.checkStringConsistOfNaturalNumbers(splitInput);
        return Arrays.stream(splitInput)
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
    }

    public static long getLottoAmout(String prise) {
        return Long.parseLong(prise) / LOTTO_PRISE;
    }
}
