package org.example.proxy;

public class BrowserProxy implements IBrowser{
    private Html html;
    private String url;

    public BrowserProxy(String url) {
        this.url = url;
    }
    @Override
    public Html show() {
        if (html == null) {
            html = new Html(url);
            System.out.println("BrowserProxy loading html from : " + url);
        }
        System.out.println("BrowserProxy use cache html : " + url);
        return html;
    }
}
