package com.cognizant.springlearn;

public class MessageBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println("XML Bean says: " + message);
    }
}
