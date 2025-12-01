package com.example.salesforcesynchrosystem.Controller;

import com.example.salesforcesynchrosystem.Entities.SalesforceProjectDTO;
import com.example.salesforcesynchrosystem.Services.SalesforceSyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sfdc")
@RequiredArgsConstructor
public final class SalesforceWebhookController {

    private final SalesforceSyncService syncService;

    @PostMapping("/webhook")
    public String handleWebhook(@RequestBody SalesforceProjectDTO dto) {
        syncService.syncFromSalesforce(dto.getId());
        return "Webhook processed";
    }
}