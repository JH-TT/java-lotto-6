package lotto.view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import lotto.domain.Rank;

public class OutputView {
    public static void buyAmount(final long amount) {
        System.out.println(amount + "개를 구매했습니다.");
    }

    public static void showResult(HashMap<Rank, Integer> result) {
        System.out.println("당첨 통계\n---");
        for (Rank rank : Rank.values()) {
            System.out.println(rank.getMessage() + result.get(rank) + "개");
        }
    }

    public static void showRateOfReturn(String rate) {
        System.out.println("총 수익률은 " + rate + "%입니다.");
    }
}
