package com.example.salesforcesynchrosystem.Services;


import com.example.salesforcesynchrosystem.Entities.Projet;
import com.example.salesforcesynchrosystem.Entities.SalesforceProjectDTO;
import com.example.salesforcesynchrosystem.Repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectSyncService {

    private final SalesforceClient sfdcClient;
    private final ProjectRepository repo;

    public Projet syncFromSalesforce(String salesforceId) {

        SalesforceProjectDTO dto = sfdcClient.fetchProjectFromSalesforce(salesforceId);

        Projet project = repo.findBySalesforceId(dto.getId())
                .orElse(new Projet());

        project.setSalesforceId(dto.getId());
        project.setName(dto.getName());
        project.setStatus(dto.getStatus());
        project.setOwner(dto.getOwner());

        return repo.save(project);
    }
}
