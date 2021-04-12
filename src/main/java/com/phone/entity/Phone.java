package com.phone.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phones")
@Data
public class Phone {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "brand_phone")
    private String brandPhone;

    @Column(name = "price")
    private double price;
}
