package com.github.stonedch.servicemanagement.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String title;
    private String content;
    private double price;
    private String deadline;

    public Request(){
    }

    public Request(String title, String content, double price, String deadline) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.deadline = deadline;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

}
