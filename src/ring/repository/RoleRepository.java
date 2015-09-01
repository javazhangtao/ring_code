package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.Role;
import ring.repository.suppor.SuperRepository;
@Repository
public interface RoleRepository extends SuperRepository<Role, Long> {

}
