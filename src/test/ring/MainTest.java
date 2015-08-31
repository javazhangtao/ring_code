package test.ring;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ring.entity.db.Role;
import ring.service.RoleService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring/ring-context.xml" })  
public class MainTest {
	
	@Autowired
	RoleService roleService;
	
	@Test
	public void test() {
		try {
			List<Role> rs=roleService.findList();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
