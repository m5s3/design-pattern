package org.example.facade;

public class SftpClient {

    private Ftp ftp;
    private Writer writer;

    public SftpClient(Ftp ftp, Writer writer) {
        this.ftp = ftp;
        this.writer = writer;
    }

    public SftpClient(String host,int port, String path, String fileName) {
        this.ftp = new Ftp(host, port, path);
        this.writer = new Writer(fileName);
    }


    public void connect() {
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
    }

    public void disConnect() {
        ftp.disconnect();
        writer.fileDisconnect();
    }

    public void writer() {
        writer.write();
    }
}
