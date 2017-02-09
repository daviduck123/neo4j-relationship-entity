package com.example.neo.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.example.neo.model.Company;

public interface CompanyRepository extends GraphRepository<Company> {
	Company findById(String id);

	@Query("MATCH (n:Company) " + 
			"WITH n SKIP {0} LIMIT {1} MATCH p=(n)-[r*0..1]-()" + 
			"RETURN n, nodes(p), rels(p)")
	List<Company> findDataWithStartAndLimit(Integer startIndex, Integer limit);
}
