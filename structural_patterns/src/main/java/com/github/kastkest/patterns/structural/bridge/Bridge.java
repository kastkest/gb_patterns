package com.github.kastkest.patterns.structural.bridge;

public class Bridge {
    public static void main(String[] args) {
        Theme darkTheme = new DarkTheme();

        WebPage about = new About(darkTheme);
        WebPage carrier = new Careers(darkTheme);

        about.getContext();
        carrier.getContext();
    }
}
