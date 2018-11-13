package com.github.stonedch.servicemanagement.domain;

import javax.persistence.*;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private double price;
    private String deadline;
    private boolean deletedStatus;
    private boolean acceptedStatus;

    public Request(){
    }

    public Request(String title, String content, double price, String deadline,
                   boolean deletedStatus, boolean acceptedStatus) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.deadline = deadline;
        this.deletedStatus = deletedStatus;
        this.acceptedStatus = acceptedStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public boolean getDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public boolean getAcceptedStatus() {
        return acceptedStatus;
    }

    public void setAcceptedStatus(boolean acceptedStatus) {
        this.acceptedStatus = acceptedStatus;
    }
}
