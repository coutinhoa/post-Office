package com.example.postOffice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CreatePackageDTO {
    private double weight;
    private Date delivery_date;
    private Long sender_id;
    private Long addressee_id;
    private Long sender_country_id;
    private Long addressee_country_id;
}
