package faraway.repository.modulith;

import faraway.repository.modulith.call.CallService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class ModulithApplicationTests {

  @Autowired
  CallService callService;

  @Test
  void contextLoads() {
    ApplicationModules.of(ModulithApplication.class).verify();
  }

  @Test
  void writeDocumentationSnippets() {

    new Documenter(ModulithApplication.class)
        .writeModulesAsPlantUml()
        .writeIndividualModulesAsPlantUml();
  }

  @Test
  void test() {
    callService.call();
  }
}
