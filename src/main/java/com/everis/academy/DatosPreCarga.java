package com.everis.academy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.everis.academy.models.Profesor;
import com.everis.academy.repositories.ProfesorRepository;

@Configuration
public class DatosPreCarga {	
	/*
	@Bean
	public CommandLineRunner cargaProfesores(ProfesorRepository profesorRepository) {
		return (args -> {
			String defaultPassword = "12345";
			Profesor p1 = new Profesor("Gabriel", "gabriel@gato.cat", defaultPassword, defaultPassword, "Licenciado");
			Profesor p2 = new Profesor("Victor", "victor@gato.cat", defaultPassword, defaultPassword, "Licenciado");
			Profesor p3 = new Profesor("Cristian", "cristian@gato.cat", defaultPassword, defaultPassword, "Licenciado");
			Profesor p4 = new Profesor("Nicolas", "nicolas@gato.cat", defaultPassword, defaultPassword, "Licenciado");
			profesorRepository.save(p1);
			profesorRepository.save(p2);
			profesorRepository.save(p3);
			profesorRepository.save(p4);

			System.out.println("email: "+ p1.getEmail()+"\n" + "Contraseña: "+p1.getPassword());
		});
	}	*/
}
