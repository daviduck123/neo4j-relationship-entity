package com.example.serviceModel;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.neo.relationshipModel.CompanyHasLicenseFor;
import com.example.neo.repository.CompanyHasLicenseForRepository;

@Service
@Transactional
public class CompanyHasLicenseForServiceImpl implements CompanyHasLicenseForService {

	@Autowired
	private CompanyHasLicenseForRepository companyHasLicenseForRepository;
	
	@Override
	public CompanyHasLicenseFor save(CompanyHasLicenseFor companyHasLicenseFor) {
		if (companyHasLicenseFor.getId() == null) {
			companyHasLicenseFor.setId(UUID.randomUUID().toString());
		}
		return companyHasLicenseForRepository.save(companyHasLicenseFor);
	}
	
	@Override
	public List<CompanyHasLicenseFor> save(List<CompanyHasLicenseFor> companyHasLicenseFors) {
		for (CompanyHasLicenseFor companyHasLicenseFor : companyHasLicenseFors) {
			if (companyHasLicenseFor.getId() == null) {
				companyHasLicenseFor.setId(UUID.randomUUID().toString());
			}
		}
		return (List<CompanyHasLicenseFor>) companyHasLicenseForRepository.save(companyHasLicenseFors);
	}

	@Override
	public void delete(CompanyHasLicenseFor companyHasLicenseFor) {
		companyHasLicenseForRepository.delete(companyHasLicenseFor);
	}
	
	@Override
	public void delete(List<CompanyHasLicenseFor> companyHasLicenseFors) {
		companyHasLicenseForRepository.delete(companyHasLicenseFors);
	}	
}