package org.example;


public class ConsoleLoadingBar extends LoadingBar {
    @Override
    public void update() {
        currentProgress++;
        System.out.print("\rLoading: " + currentProgress + "%");
    }
}
//One more inheritance and a method