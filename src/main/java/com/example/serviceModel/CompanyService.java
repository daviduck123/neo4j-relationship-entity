package com.example.serviceModel;

import java.util.List;

import com.example.neo.model.Company;

public interface CompanyService {

	Company save(Company company);

	List<Company> save(List<Company> companys);

	void delete(Company company);

	void delete(List<Company> companys);

	Company findById(String id);

	List<Company> findDataWithStartAndLimit(Integer startIndex, Integer limit);
}