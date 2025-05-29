package file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing // DB에 자동으로 날짜 기입하기 위해
public class Step16S3FileTApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step16S3FileTApplication.class, args);
	}

}
