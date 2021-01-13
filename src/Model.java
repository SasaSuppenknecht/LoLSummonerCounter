import  java.util.Timer;
import java.util.TimerTask;

public class Model {
    static Timer timer;
    static int interv;

    public static void setTimer(int interval) {
        interv = interval;
        timer = new Timer();
        int delay = 1000;
        int period = 1000;
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(setInterval());

            }
        }, delay, period);
    }

    private static final int setInterval() {
        if (interv == 1)
            timer.cancel();
        return --interv;
    }
}
