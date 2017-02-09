package com.example.serviceModel;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.neo.model.Company;
import com.example.neo.repository.CompanyRepository;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Company save(Company company) {
		if (company.getId() == null) {
			company.setId(UUID.randomUUID().toString());
		}
		return companyRepository.save(company);
	}

	@Override
	public List<Company> save(List<Company> companys) {
		for (Company company : companys) {
			if (company.getId() == null) {
				company.setId(UUID.randomUUID().toString());
			}
		}
		return (List<Company>) companyRepository.save(companys);
	}

	@Override
	public void delete(Company company) {
		companyRepository.delete(company);
	}

	@Override
	public void delete(List<Company> companys) {
		companyRepository.delete(companys);
	}

	@Override
	public Company findById(String id) {
		return companyRepository.findById(id);
	}

	@Override
	public List<Company> findDataWithStartAndLimit(Integer startIndex, Integer limit) {
		return companyRepository.findDataWithStartAndLimit(startIndex, limit);
	}
}