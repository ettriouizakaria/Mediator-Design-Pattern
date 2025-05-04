package com.learning.dp.behavioral.mediator;

public class Message {
    private String content;
    private String sender;
    private String reciever;


    public Message(String content, String reciever) {
        this.content = content;
        this.reciever = reciever;
    }

    public Message(String content, String sender, String reciever) {
        this.content = content;
        this.sender = sender;
        this.reciever = reciever;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", reciever='" + reciever + '\'' +
                '}';
    }
}
