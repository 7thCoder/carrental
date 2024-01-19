package com.carrental.carrental.model;

import lombok.Data;
import com.carrental.carrental.model.colors;

@Data
public class car {

    private final String Id;
    private final String Brand;
    private final String year;
    private final String price;
    private final colors color;    
}
