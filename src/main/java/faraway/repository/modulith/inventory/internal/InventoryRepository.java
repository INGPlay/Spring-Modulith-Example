package faraway.repository.modulith.inventory.internal;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class InventoryRepository {
  InventoryRepositoryUtil util;
}
