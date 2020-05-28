package printZeroEvenOdd1116;

import java.util.function.IntConsumer;

public class ZeroEvenOdd {
    private int n;
    private volatile int num = 1;
    private volatile int state = 0;
    private volatile int odd = 1;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while (num <= n) {
            if (state == 0 && num <= n) {
                printNumber.accept(0);
                if ((num & 1) == 1) { //odd
                    odd = 1;
                } else {
                    odd = 0;
                }
                state = 1;
            }else {
                Thread.yield();
            }

        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while (num <= n) {
            if (state == 1 && odd == 0) {
                printNumber.accept(num++);
                state = 0;
            }else {
                Thread.yield();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while (num <= n) {
            if (state == 1 && odd == 1) {
                printNumber.accept(num++);
                state = 0;
            }else {
                Thread.yield();
            }
        }
    }
}
