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

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "fb_count")
    private long fb_count;

    @Column(name = "tw_count")
    private long tw_count;

    @Column(name = "insta_count")
    private long insta_count;

    @Column(name = "vk_count")
    private long vk_count;

    @Column(name = "ok_count")
    private long ok_count;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "_id_customer")
    private long ids;

    /*@OneToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE, CascadeType.DETACH})
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;*/
}
