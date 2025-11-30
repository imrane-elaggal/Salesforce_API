package com.example.salesforcesynchrosystem.Controller;

import com.example.salesforcesynchrosystem.Entities.Projet;
import com.example.salesforcesynchrosystem.Services.ProjectSyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sync")
@RequiredArgsConstructor
public class SyncController {

    private final ProjectSyncService syncService;

    @PostMapping("/project/{salesforceId}")
    public Projet syncProject(@PathVariable String salesforceId) {
        return syncService.syncFromSalesforce(salesforceId);
    }
}
