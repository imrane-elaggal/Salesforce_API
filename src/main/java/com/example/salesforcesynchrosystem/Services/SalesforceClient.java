package com.example.salesforcesynchrosystem.Services;

import com.example.salesforcesynchrosystem.Entities.SalesforceProjectDTO;
import org.springframework.stereotype.Service;

@Service
public class SalesforceClient {

    public SalesforceProjectDTO fetchProjectFromSalesforce(String salesforceId) {


        return new SalesforceProjectDTO(
                salesforceId,
                "Projet Salesforce #" + salesforceId,
                "IN_PROGRESS",
                "John Doe"
        );
    }
}