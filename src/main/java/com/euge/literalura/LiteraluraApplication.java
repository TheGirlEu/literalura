package com.euge.literalura;

import com.euge.literalura.principal.Principal;
import com.euge.literalura.repository.AutorRepository;
import com.euge.literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private LibroRepository librorepo;
	@Autowired
	private AutorRepository autorrepo;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(librorepo, autorrepo);
		principal.muestraElMenu();
	}
}
