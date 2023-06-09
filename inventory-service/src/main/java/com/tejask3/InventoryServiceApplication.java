package com.tejask3;

import com.tejask3.model.Inventory;
import com.tejask3.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iPhone_11");
			inventory.setQuantity(100);

			Inventory inventoryRed = new Inventory();
			inventoryRed.setSkuCode("iPhone_11_Red");
			inventoryRed.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventoryRed);
		};
	}
}
