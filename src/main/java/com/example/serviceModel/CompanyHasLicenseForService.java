package com.example.serviceModel;

import java.util.List;

import com.example.neo.relationshipModel.CompanyHasLicenseFor;

public interface CompanyHasLicenseForService {

	CompanyHasLicenseFor save(CompanyHasLicenseFor companyHasLicenseFor);

	List<CompanyHasLicenseFor> save(List<CompanyHasLicenseFor> companyHasLicenseFors);

	void delete(CompanyHasLicenseFor companyHasLicenseFor);

	void delete(List<CompanyHasLicenseFor> companyHasLicenseFors);
}
