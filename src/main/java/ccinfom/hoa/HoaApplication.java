package ccinfom.hoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class HoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoaApplication.class, args);
	}

}
