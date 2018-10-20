package com.example.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String requestTxt;
    private Double bid;
    private Date dueDate;

    public Request(){
    }

    public Request(String requestTxt, Double bid, Date dueDate) {
        this.requestTxt = requestTxt;
        this.bid = bid;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestTxt() {
        return requestTxt;
    }

    public void setRequestTxt(String requestTxt) {
        this.requestTxt = requestTxt;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
