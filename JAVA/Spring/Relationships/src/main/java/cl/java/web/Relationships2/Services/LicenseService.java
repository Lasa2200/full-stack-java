package cl.java.web.Relationships2.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.java.web.Relationships2.Models.License;
import cl.java.web.Relationships2.Repositories.LicenseRepository;

	@Service
	public class LicenseService {

	@Autowired
	private  LicenseRepository licenseRepository;

	public List<License> allLicense() {
		return (List<License>) licenseRepository.findAll();
	}

	public License createLicense(License license) {
		return licenseRepository.save(license);

	}
}
