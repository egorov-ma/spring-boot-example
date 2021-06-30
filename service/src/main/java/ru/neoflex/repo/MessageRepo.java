package ru.neoflex.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.neoflex.domain.Message;

public interface MessageRepo extends ReactiveCrudRepository <Message, Long> {
}
