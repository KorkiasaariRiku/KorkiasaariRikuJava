package com.example.demo;

public class online extends course {
String url;
    public online(String name, String lecturer, String url) {
        super(name, lecturer);
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return this.lecturer + ' ' + this.name + ' ' + this.url;
    }
    
}
