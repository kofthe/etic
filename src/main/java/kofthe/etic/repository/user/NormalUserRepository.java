package kofthe.etic.repository.user;

import kofthe.etic.entities.user.NormalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormalUserRepository extends JpaRepository<NormalUser, Integer> {
}
