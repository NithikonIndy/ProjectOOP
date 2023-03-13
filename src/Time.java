public class Time {
    private int time;
    private boolean running;
    private Thread thread;

    public Time() {

    }
    public int MinToSec(int time){
        return time*60;
    }
    public void start_intial() {
        this.running = true;
        this.time=MinToSec(Config.init_plan_min);
        this.thread = new Thread(() -> {
            while (this.time > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.time--;
                System.out.println(this.time);
            }
            this.running = false;
        });
        this.thread.start();
    }

    public void start_plan() {
        this.running = true;
        this.time=MinToSec(Config.plan_rev_min);
        this.thread = new Thread(() -> {
            while (this.time > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.time--;
                System.out.println(this.time);
            }
            this.running = false;
        });
        this.thread.start();
    }

    public void stop() {
        if (this.thread != null) {
            this.thread.interrupt();
        }
        this.running = false;
    }

    public boolean isRunning() {
        return this.running;
    }

    public int getTime() {
        return this.time;
    }
}