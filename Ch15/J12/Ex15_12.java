class PrePaid extends Thread {
    private static int sum = 200;

    public void run() {
        while (sum > 10) {
            int fee = (int) (Math.random() * 100) + 0;
            talk(fee);
        }
    }

    public static synchronized void talk(int fee) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fee = Math.min(fee, sum);
        sum -= fee;

        if (sum >= 10) {
            System.out.printf("打了%d元，餘額%d元\n", fee, sum);
        }
    }
}

public class Ex15_12 {
    public static void main(String[] args) {
        PrePaid phone1 = new PrePaid();
        PrePaid phone2 = new PrePaid();
        PrePaid phone3 = new PrePaid();
        phone1.start();
        phone2.start();
        phone3.start();
    }
}