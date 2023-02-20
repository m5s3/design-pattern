package org.example.strategy;

public class EncoderTest {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        String message = "hello world!";
        Base64Strategy base64Strategy = new Base64Strategy();
        encoder.setEncodingStrategy(base64Strategy);
        System.out.println(encoder.getMessage(message));
        AppendStrategy appendStrategy = new AppendStrategy();
        encoder.setEncodingStrategy(appendStrategy);
        System.out.println(encoder.getMessage(message));
        NormalStrategy normalStrategy = new NormalStrategy();
        encoder.setEncodingStrategy(normalStrategy);
        System.out.println(encoder.getMessage(message));
    }
}
