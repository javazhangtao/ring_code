package ring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ring.entity.db.Role;
import ring.repository.RoleRepository;
import ring.service.RoleService;
import ring.service.SuperService;

@Service("roleService")
public class RoleServiceImpl extends SuperService implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	public Role findById(final Long id) {
		return roleRepository.findOne(id);
	}
	
	public List<Role> findList(){
		return roleRepository.findAll();
	}
}
