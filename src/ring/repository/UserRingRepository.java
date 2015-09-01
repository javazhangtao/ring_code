package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.UserRing;
import ring.repository.suppor.SuperRepository;
@Repository
public interface UserRingRepository extends SuperRepository<UserRing, Long> {

}
