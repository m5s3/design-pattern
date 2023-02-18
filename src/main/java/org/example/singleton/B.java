package org.example.singleton;

public class B {
    private SocketClient socketClient;
    public B() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
