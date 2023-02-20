package org.example.observer;

public class Button {
    private String name;
    private IButtonListener buttonListener;

    public Button(String name){
        this.name = name;
    }

    public void click(String message) {
        buttonListener.clickEvent(message);
    }

    public void addEventListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
