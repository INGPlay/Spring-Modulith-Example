package faraway.repository.modulith.call;

import faraway.repository.modulith.inventory.Inventory;
import faraway.repository.modulith.inventory.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CallService {

  InventoryService inventoryService;
  private final ApplicationEventPublisher publisher;

  public void call() {
    Inventory inventory = new Inventory("asdf");
    publisher.publishEvent(inventory);
  }
}
