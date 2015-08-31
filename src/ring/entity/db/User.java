package ring.entity.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ring.common.Dictionary;
import ring.entity.SuperEntity;

@Entity
@Table(name="ring_user")
public class User extends SuperEntity{
	private static final long serialVersionUID = 2597562997163086076L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_pass")
	private String userPass;
	@Column(name="level")
	private Integer level=Dictionary.INIT_USER_LEVEL;
	@Column(name="phone")
	private String phone;
	@Column(name="email")
	private String email;
	@Column(name="status")
	private Integer status=Dictionary.STATUS_BLOCK;
	@Column(name="create_time")
	private Long createTime;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	

}
