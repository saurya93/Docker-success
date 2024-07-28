package springBoot_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpDockerApplication {
	@GetMapping("/message")
	public String getMessage(){
		return "hii";
	}
//	echo "# Docker-success" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/saurya93/Docker-success.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(SpDockerApplication.class, args);
	}

}
