package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.MoldRole;
import ring.repository.suppor.SuperRepository;

@Repository
public interface MoldRoleRepository extends SuperRepository<MoldRole, Long> {

}
