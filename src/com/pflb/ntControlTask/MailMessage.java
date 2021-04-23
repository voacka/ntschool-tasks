package com.pflb.ntControlTask;

public class MailMessage implements Helper<String> {
    private String from;
    private String to;
    private String messageContent;

    public MailMessage(String from, String to, String messageContent) {
        this.from = from;
        this.to = to;
        this.messageContent = messageContent;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getContent() {
        return messageContent;
    }
}
