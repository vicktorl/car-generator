package ufro.demo;

import models.Automovil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

	@RestController
	public class AutomovilController {

		@GetMapping("/automoviles/{cantidad}")
		public List<Automovil> generarAutomoviles(@PathVariable int cantidad) {
			List<Automovil> automoviles = new ArrayList<>();
			for (int i = 0; i < cantidad; i++) {
				Automovil automovil = new Automovil();
				automoviles.add(automovil);
			}
			return automoviles;
		}
	}

}
