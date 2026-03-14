package com.example.backend;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
	@Bean
	public CommandLineRunner loadData(SinhVienRepository repository) {
		return args -> {
			if (repository.count() == 0) {
				repository.save(new SinhVien(
					"DH52200323",
					"Le Ngoc Duc Anh",
					"D22_TH11",
					LocalDateTime.now()
				));
				repository.save(new SinhVien(
					"DH52200324",
					"Nguyen Van Binh",
					"D22_TH11",
					LocalDateTime.now()
				));}
		};
	}


}