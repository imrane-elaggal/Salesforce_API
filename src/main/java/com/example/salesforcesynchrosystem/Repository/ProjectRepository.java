package com.example.salesforcesynchrosystem.Repository;

import com.example.salesforcesynchrosystem.Entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Projet,Long> {

    Optional<Projet> findBySalesforceId(String salesforceId);

}
