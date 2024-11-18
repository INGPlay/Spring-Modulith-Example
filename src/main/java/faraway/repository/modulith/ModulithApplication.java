package faraway.repository.modulith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulith;

@Modulith
@SpringBootApplication
public class ModulithApplication {

  public static void main(String[] args) {
    SpringApplication.run(ModulithApplication.class, args);
  }

}
