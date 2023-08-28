package com.example.kassa.Model;

public class Chat
{
    private String sender;
    private String receiver;
    private String message;
    private boolean isseen;

    public Chat() {
    }

    public Chat(String sender, String receiver, String message, boolean isseen) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.isseen = isseen;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIsseen() {
        return this.isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
