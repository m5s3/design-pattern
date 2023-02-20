package org.example.observer;

public class ButtonTest {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        button.addEventListener(event -> {
            System.out.println("버튼 구현");
            System.out.println(event);
        });

        button.click("메세지 전달 : click 1");
        button.click("메세지 전달 : click 2");
        button.click("메세지 전달 : click 3");
        button.click("메세지 전달 : click 4");
        button.click("메세지 전달 : click 5");
    }
}
