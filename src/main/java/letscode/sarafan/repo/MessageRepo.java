package letscode.sarafan.repo;

import letscode.sarafan.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
