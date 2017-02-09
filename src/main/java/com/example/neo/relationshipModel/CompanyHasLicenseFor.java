package com.example.neo.relationshipModel;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.example.neo.model.Company;
import com.example.neo.model.Product;

@RelationshipEntity(type="company_has_license_for")
public class CompanyHasLicenseFor {
	@GraphId
	Long graphId;

	String id;

	@StartNode
	Company company;

	@EndNode
	Product product;
	
	Date startDate;
	
	Date endDate;

	public CompanyHasLicenseFor() {
		super();
	}

	public CompanyHasLicenseFor(Company company, Product product, Date startDate, Date endDate) {
		super();
		this.company = company;
		this.product = product;
		this.startDate = startDate;
		this.endDate = endDate;
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "CompanyHasLicenseFor [graphId=" + graphId + ", id=" + id + ", company=" + company + ", product="
				+ product + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
