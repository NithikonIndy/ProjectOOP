package model;

import java.util.Timer;
import java.util.TimerTask;

public class TimerSecond {

    int secondsTime = 0;

    protected boolean isStart = false;
    protected boolean isPause = false;

    Timer timerSecond = new Timer();
    TimerTask timerTask = new TimerTask() {

        @Override
        public void run() {

            while (true) {

                if (isStart == true) {
                        secondsTime++;
                } else if (isPause == true) {
                        timerSecond.cancel();
                }
            }
        }
    };
}


