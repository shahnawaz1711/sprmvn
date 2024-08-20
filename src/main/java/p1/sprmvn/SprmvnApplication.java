package p1.sprmvn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SprmvnApplication {
	
	static Logger logger = LoggerFactory.getLogger(SprmvnApplication.class);

	@PostConstruct
	public void init() {
		logger.info("SprMvnApplication STARTED.....");
	}

	
	public static void main(String[] args) {
		logger.info("SprMvnApplication main method STARTED.....");
		SpringApplication.run(SprmvnApplication.class, args);
	}

}
