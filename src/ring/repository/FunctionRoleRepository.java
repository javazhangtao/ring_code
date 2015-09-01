package ring.repository;

import org.springframework.stereotype.Repository;

import ring.entity.db.FunctionRole;
import ring.repository.suppor.SuperRepository;
@Repository
public interface FunctionRoleRepository extends SuperRepository<FunctionRole, Long> {

}
