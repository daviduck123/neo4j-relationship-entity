package com.example.neo.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.example.neo.relationshipModel.CompanyHasLicenseFor;

public interface CompanyHasLicenseForRepository extends GraphRepository<CompanyHasLicenseFor> {	
}