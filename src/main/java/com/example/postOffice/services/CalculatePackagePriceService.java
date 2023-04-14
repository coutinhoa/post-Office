package com.example.postOffice.services;

import com.example.postOffice.models.Package;
import com.example.postOffice.models.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CalculatePackagePriceService {

   private Price price;

   private Package weight;

    CalculatePackagePriceService(Package weight, Price price) {
        this.weight = weight;
        this.price = price;
        }

    public double getPricePackage(){
        //double result;
        //result = price.getPrice() * weight.getWeight();
        return 0;
    }
}
