package org.example.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        BrowserProxy browser = new BrowserProxy("www.naver.html");
        browser.show();
        browser.show();
        browser.show();
    }
}
