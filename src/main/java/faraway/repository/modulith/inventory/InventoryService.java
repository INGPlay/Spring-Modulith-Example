package faraway.repository.modulith.inventory;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class InventoryService {

  @ApplicationModuleListener
  public void on(Inventory inventory) {
    log.info("Received inventory: {}", inventory);
  }
}
