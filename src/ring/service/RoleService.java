package ring.service;

import java.util.List;

import ring.entity.db.Role;

public interface RoleService {

	Role findById(final Long id);
	
	List<Role> findList();
}
