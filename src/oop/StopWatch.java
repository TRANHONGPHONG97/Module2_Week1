package oop;

public class StopWatch {
    private long startTime;
    private long endTime;
public void  StopWatch(){}
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        long elapsed = (endTime - startTime);
        return elapsed;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        System.out.printf("Start: %d\n", watch.getStartTime());
        System.out.printf("End: %d\n", watch.getEndTime());
        System.out.printf("Elapsed Time: %d", watch.getElapsedTime());
    }
}

