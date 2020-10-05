package letscode.sarafan.repo;

import letscode.sarafan.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
