package org.example.strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    public String getMessage(String text) {
        return this.encodingStrategy.encode(text);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
