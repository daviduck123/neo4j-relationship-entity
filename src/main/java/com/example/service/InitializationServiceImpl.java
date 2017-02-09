package com.example.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.neo.model.Company;
import com.example.neo.model.Product;
import com.example.neo.relationshipModel.CompanyHasLicenseFor;
import com.example.serviceModel.CompanyHasLicenseForService;
import com.example.serviceModel.CompanyService;
import com.example.serviceModel.ProductService;

@Service
@Transactional
public class InitializationServiceImpl implements InitializationService {
	private static final Logger LOG = LoggerFactory.getLogger(InitializationServiceImpl.class);

	@Autowired
	CompanyService companyService;

	@Autowired
	ProductService productService;
	
	@Autowired
	CompanyHasLicenseForService companyHasLicenseForService;

	@Override
	public void initData() {
		LOG.info("Start init Test");
		initTest();
		LOG.info("Finish init Data");
	}
	
	@Override
	public void initTest() {
		Company company = new Company("Company Test");
		companyService.save(company);
		Product product = new Product("Product Test");
		productService.save(product);
		CompanyHasLicenseFor com = new CompanyHasLicenseFor(company, product, new Date(), new Date());
		companyHasLicenseForService.save(com);
	}
}
