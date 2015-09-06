package ring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ring.entity.db.UserRole;
import ring.repository.UserRoleRepository;
import ring.service.SuperService;
import ring.service.UserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl extends SuperService implements UserRoleService {

	@Autowired
	UserRoleRepository userRoleRepository;
	
	public UserRole findByUserIdAndStatus(final Long userId , final Integer status) {
		return userRoleRepository.findOneByUserIdAndStatus(userId, status);
	}

}
