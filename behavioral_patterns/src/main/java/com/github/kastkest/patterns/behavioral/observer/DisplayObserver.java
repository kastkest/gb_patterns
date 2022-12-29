package com.github.kastkest.patterns.behavioral.observer;

public class DisplayObserver implements Observer {
    @Override
    public void update(Subject subject, Object arg) {
        System.out.printf("%s temperature %s\n", subject.toString(), arg);
    }
}
