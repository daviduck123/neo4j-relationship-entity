package com.example.neo.model;

import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.example.neo.relationshipModel.CompanyHasLicenseFor;

@NodeEntity
public class Product {
	@GraphId
	Long graphId;

	String id;

	String name;

	@Relationship(type = "company_has_license_for", direction = "UNDIRECTED")
	Set<CompanyHasLicenseFor> companylicenses;

	public Set<CompanyHasLicenseFor> getCompanylicenses() {
		return companylicenses;
	}

	public void setCompanylicenses(Set<CompanyHasLicenseFor> companylicenses) {
		this.companylicenses = companylicenses;
	}

	public Product() {
		super();
	}

	public Product(String name) {
		super();
		this.name = name;
	}

	public Long getGraphId() {
		return graphId;
	}

	public void setGraphId(Long graphId) {
		this.graphId = graphId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [graphId=" + graphId + ", id=" + id + ", name=" + name + "]";
	}
}