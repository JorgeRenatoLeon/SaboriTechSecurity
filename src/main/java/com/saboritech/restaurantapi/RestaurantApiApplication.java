package com.saboritech.restaurantapi;

import com.saboritech.restaurantapi.models.ERole;
import com.saboritech.restaurantapi.models.Platillo;
import com.saboritech.restaurantapi.models.Role;
import com.saboritech.restaurantapi.repositories.PlatilloRepository;
import com.saboritech.restaurantapi.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RestaurantApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApiApplication.class, args);
	}

	@Component
	public class PostConstructExampleBean {

		@Autowired
		private RoleRepository roleRepository;

		@Autowired
		private PlatilloRepository platilloRepository;

		@PostConstruct
		public void init() {
			Role adminRole = new Role();
			adminRole.setName(ERole.ROLE_ADMIN);
			roleRepository.save(adminRole);

			Role userRole = new Role();
			userRole.setName(ERole.ROLE_USER);
			roleRepository.save(userRole);

			Platillo platillo = new Platillo();
			platillo.setNombre("Pizza Napolitana");
			platillo.setVegetariano(false);
			platillo.setDescripcion("Este platillo es elaborado con agua y harina, queso mozzarella, el tomate, la albahaca y el aceite de oliva.");
			platillo.setDisponible(true);
			platillo.setPrecio((float) 24.99);

			platilloRepository.save(platillo);

			Platillo platillo2 = new Platillo();
			platillo2.setNombre("Sushi");
			platillo2.setVegetariano(false);
			platillo2.setDescripcion("El sushi está hecho de arroz adobado con pescado o mariscos crudos (en algunos casos cocinados), vegetales y hojas de algas o nori.");
			platillo2.setDisponible(true);
			platillo2.setPrecio((float) 19.99);

			platilloRepository.save(platillo2);
		}
	}
}
