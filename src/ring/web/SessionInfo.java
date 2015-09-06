package ring.web;

import ring.entity.db.Role;
import ring.entity.db.User;

public class SessionInfo {
	
	private User user;
	private Role role;
	private String token;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
