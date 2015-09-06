package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.UserGroup;
import ring.repository.suppor.SuperRepository;
@Repository
public interface UserRingRepository extends SuperRepository<UserGroup, Long> {

}
