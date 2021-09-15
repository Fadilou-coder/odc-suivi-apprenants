package com.odc.suiviapprenants;

import com.odc.suiviapprenants.model.Admin;
import com.odc.suiviapprenants.model.Role;
import com.odc.suiviapprenants.service.ApplicationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class SuiviapprenantsApplication implements CommandLineRunner {

	@Autowired
	private ApplicationService applicationService;

	public static void main(String[] args) {
		SpringApplication.run(SuiviapprenantsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// applicationService.addAdmin(new Admin("admin", "passer", "prenom", "nom", "email@email.com", "12345678", "adresse", "777777777", new Role("ADMIN",null )));
	}
}
