package org.techlineafrica.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.techlineafrica.backend.services.RecordService;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    @Autowired
    private RecordService recordService;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		/*for (int i = 0; i < 20; i++) {
			RecordDto recordDto = new RecordDto();
			Random rand = new Random();
			recordDto.setNumber(rand.nextInt());
			recordService.save(recordDto);
		}*/


    }
}