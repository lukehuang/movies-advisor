package pro.ivashchuk.moviesadvisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.ivashchuk.moviesadvisor.domain.User;

import java.util.List;
import java.util.Optional;

public interface JpaUserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    Optional<User> findById(Long id);

    User findByUsername(String username);

    User save(User user);

    void delete(User user);
}
