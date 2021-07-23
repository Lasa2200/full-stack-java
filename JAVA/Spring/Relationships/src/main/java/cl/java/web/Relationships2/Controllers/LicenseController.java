package cl.java.web.Relationships2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import cl.java.web.Relationships2.Models.License;
import cl.java.web.Relationships2.Models.Person;
import cl.java.web.Relationships2.Services.LicenseService;


public class LicenseController {

	

	@Autowired
	private LicenseService licenseService;

	@GetMapping("/license")
	public String newLicense(@ModelAttribute("license") License license) {
		return "prueba.jsp";
	}

	@PostMapping("/license/new")
	public String save( @ModelAttribute("license") License license) {
		licenseService.createLicense(license);
		return "license.jsp";
	}
}
