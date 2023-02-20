package org.example.aop;

import org.example.proxy.IBrowser;
import org.example.singleton.A;

import java.util.concurrent.atomic.AtomicLong;

public class AopBrowserTest {
    public static void main(String[] args) {

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
            () -> {
                System.out.println("Start");
                start.set(System.currentTimeMillis());
            },
            () -> {
                long now = System.currentTimeMillis();
                System.out.println("End");
                end.set(now - start.get());
            }
        );

        aopBrowser.show();
        System.out.println("loading from : " + end.get());

        aopBrowser.show();
        System.out.println("loading from : " + end.get());
    }
}
