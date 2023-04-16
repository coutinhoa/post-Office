package com.example.postOffice.dto;

import lombok.Data;

@Data
public class CreatePriceDTO {
    private double price;
    private Long sender_country_id;
    private Long addressee_country_id;
}
