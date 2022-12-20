package com.github.kastkest.patterns.structural.bridge;

public class About implements WebPage{
    private Theme theme;

    public About(Theme theme) {

        this.theme = theme;
    }

    @Override
    public void getContext() {
        System.out.println("About page in " + theme.getColour());
    }
}
