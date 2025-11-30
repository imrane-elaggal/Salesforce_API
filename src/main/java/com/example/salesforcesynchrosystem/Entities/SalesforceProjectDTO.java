package com.example.salesforcesynchrosystem.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesforceProjectDTO {

    private String id;
    private String name;
    private String status;
    private String owner;

}