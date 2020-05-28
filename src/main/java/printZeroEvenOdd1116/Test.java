package printZeroEvenOdd1116;

public class Test {
    public static void main(String[] args) throws Exception {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(100);
        Task zero = new Task(zeroEvenOdd,0);
        Task even = new Task(zeroEvenOdd,2);
        Task odd = new Task(zeroEvenOdd,1);
        zero.start();
        Thread.sleep(200);
        even.start();
        Thread.sleep(200);

        odd.start();

    }

    static class Task extends Thread {
        private ZeroEvenOdd zeroEvenOdd;
        int mode = 0;
        private Printer printer = new Printer();

        public Task(ZeroEvenOdd zeroEvenOdd, int mode) {
            this.mode = mode;
            this.zeroEvenOdd = zeroEvenOdd;
        }

        @Override
        public void run() {
            try {
                switch (mode) {
                    case 0:
                        zeroEvenOdd.zero(printer);
                        break;
                    case 1:
                        zeroEvenOdd.odd(printer);
                        break;
                    default:
                        zeroEvenOdd.even(printer);
                }
            } catch (Exception e) {

            }

        }
    }
}
