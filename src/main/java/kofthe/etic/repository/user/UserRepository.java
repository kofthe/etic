package kofthe.etic.repository.user;

import kofthe.etic.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsById(int id);

    boolean existsByEmail(String email);


}
