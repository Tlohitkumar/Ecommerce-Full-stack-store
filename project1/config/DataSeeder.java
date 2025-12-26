package com.example.project1.config;

import java.util.Arrays;




import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.project1.model.Category;
import com.example.project1.model.Product;
import com.example.project1.repository.CategoryRepository;
import com.example.project1.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {

	
		private final ProductRepository productRepository;
		private final CategoryRepository categoryRepository;
		
		public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
			this.productRepository = productRepository;
			this.categoryRepository = categoryRepository;
			
		}
		
		
	@Override
	public void run(String... args) throws Exception {
		
		//Clear all Existing data
		productRepository.deleteAll();
		categoryRepository.deleteAll();
		
		
		//Create Categories
		
		Category electronics = new Category();
		electronics.setName("Electronics");
		
		Category clothing = new Category();
		clothing.setName("Clothing");
		
		Category home = new Category();
		home.setName("Home and Kitchen");
		
		categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));
		
		
		//Create Products
		
		Product phone = new Product();
		phone.setName("SmartPhone");
		phone.setDescription("Latest Model SmartPhone with FlackShip features");
		phone.setImageUrl("https://placehold.co/600x400");
		phone.setPrice(799.999);
		phone.setCategory(electronics);
		
		Product laptop = new Product();
		laptop.setName("Laptop");
		laptop.setDescription("High Performance Laptop with AI features");
		laptop.setImageUrl("https://placehold.co/600x400");
		laptop.setPrice(999.999);
		laptop.setCategory(electronics);
		
		Product jacket = new Product();
		jacket.setName("Jacket");
		jacket.setDescription("A good leathered Jacket for casual wear");
		jacket.setImageUrl("https://placehold.co/600x400");
		jacket.setPrice(999.99);
		jacket.setCategory(clothing);
		
		Product blender = new Product();
		blender.setName("Blender");
		blender.setDescription("A Juice Bleander with fine sharp Blades");
		blender.setImageUrl("https://placehold.co/600x400");
		blender.setPrice(249.99);
		blender.setCategory(home);
		
		productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
		
	}

}
