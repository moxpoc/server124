package com.moxpoc.server124.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long _id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "date")
    private Date date;

    @Column(name = "fb_count")
    private long fb_count;

    @Column(name = "vk_count")
    private long vk_count;

    @Column(name = "insta_count")
    private long insta_count;

    @Column(name = "tw_count")
    private long tw_count;

    @Column(name = "ok_count")
    private long ok_count;

    @Column(name = "price")
    private int price;

    @Column(name = "_id_customer", nullable = false)
    private long _id_customer;


    public Order(){

    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getFb_count() {
        return fb_count;
    }

    public void setFb_count(long fb_count) {
        this.fb_count = fb_count;
    }

    public long getTw_count() {
        return tw_count;
    }

    public void setTw_count(long tw_count) {
        this.tw_count = tw_count;
    }

    public long getInsta_count() {
        return insta_count;
    }

    public void setInsta_count(long insta_count) {
        this.insta_count = insta_count;
    }

    public long getVk_count() {
        return vk_count;
    }

    public void setVk_count(long vk_count) {
        this.vk_count = vk_count;
    }

    public long getOk_count() {
        return ok_count;
    }

    public void setOk_count(long ok_count) {
        this.ok_count = ok_count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long get_id_customer() {
        return _id_customer;
    }

    public void set_id_customer(long _id_customer) {
        this._id_customer = _id_customer;
    }
}
