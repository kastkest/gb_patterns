package com.github.kastkest.patterns.structural.bridge;

public class Careers implements WebPage {

    private Theme theme;

    public Careers(Theme theme) {

        this.theme = theme;
    }

    @Override
    public void getContext() {
        System.out.println("Careers page in " + theme.getColour());
    }
}
