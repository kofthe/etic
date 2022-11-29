package kofthe.etic.repository.user;

import kofthe.etic.entities.user.PremiumUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiumRepositoryUser extends JpaRepository<PremiumUser, Integer> {
}
