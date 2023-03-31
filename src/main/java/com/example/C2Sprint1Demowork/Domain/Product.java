package com.example.C2Sprint1Demowork.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Product {
    @Id
    private int productId;
    private String name;
    private String description;
    private String amount;

}
