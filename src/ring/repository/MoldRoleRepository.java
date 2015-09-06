package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.GroupMoldRole;
import ring.repository.suppor.SuperRepository;

@Repository
public interface MoldRoleRepository extends SuperRepository<GroupMoldRole, Long> {

}
