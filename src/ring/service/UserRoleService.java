package ring.service;

import ring.entity.db.UserRole;

public interface UserRoleService {

	UserRole findByUserIdAndStatus(final Long userId , final Integer status);
}
