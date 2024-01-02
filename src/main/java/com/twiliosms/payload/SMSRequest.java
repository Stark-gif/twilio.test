package com.twiliosms.payload;

public class SMSRequest {

    private String to;
    private String message;

    public SMSRequest() {
        // Default constructor required by Spring for JSON parsing
    }

    public SMSRequest(String to, String message) {
        this.to = to;
        this.message = message;
    }

    // Getters and setters
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString(){
        return "SMSRequest{" +
                "to='"+to+'\''+
                ", message='"+message+'\''+'}';

    }
}

