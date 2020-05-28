package printZeroEvenOdd1116;

import java.util.function.IntConsumer;

/**
 * Created by zhaozhezijian on 2020/5/28.
 */
public class Printer implements IntConsumer {
    @Override
    public void accept(int value) {
        System.out.print(value);
    }
}
