package org.example;

public abstract class LoadingBar {
    protected int currentProgress;

    public LoadingBar() {
        this.currentProgress = 0;
    }

    public abstract void update();

    public void start() {
        while (currentProgress < 100) {
            update();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// a Abstract 2 methods and one more exception