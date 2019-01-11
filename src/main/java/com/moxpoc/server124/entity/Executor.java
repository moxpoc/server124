package com.moxpoc.server124.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "executor")
public class Executor {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long _id;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "second_name", nullable = true)
    private String second_name;

    @Column(name = "sur_name", nullable = false)
    private String sur_name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "phone_number", nullable = true)
    private String phone_number;

    @Column(name = "referal_link", nullable = false)
    private String referal_link;

    @Column(name = "fb_orders")
    private String fb_orders;

    @Column(name = "tw_orders")
    private String tw_orders;

    @Column(name = "insta_orders")
    private String insta_orders;

    @Column(name = "vk_orders")
    private String vk_orders;

    @Column(name = "ok_orders")
    private String ok_orders;

    public Executor(){

    }

    public long getId() {
        return _id;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getSur_name() {
        return sur_name;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getReferal_link() {
        return referal_link;
    }

    public void setReferal_link(String referal_link) {
        this.referal_link = referal_link;
    }

    public String getFb_orders() {
        return fb_orders;
    }

    public void setFb_orders(String fb_orders) {
        this.fb_orders = fb_orders;
    }

    public String getTw_orders() {
        return tw_orders;
    }

    public void setTw_orders(String tw_orders) {
        this.tw_orders = tw_orders;
    }

    public String getInsta_orders() {
        return insta_orders;
    }

    public void setInsta_orders(String insta_orders) {
        this.insta_orders = insta_orders;
    }

    public String getVk_orders() {
        return vk_orders;
    }

    public void setVk_orders(String vk_orders) {
        this.vk_orders = vk_orders;
    }

    public String getOk_orders() {
        return ok_orders;
    }

    public void setOk_orders(String ok_orders) {
        this.ok_orders = ok_orders;
    }
}
