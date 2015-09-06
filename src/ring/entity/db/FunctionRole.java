package ring.entity.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ring.common.Dictionary;
import ring.entity.SuperEntity;
@Entity
@Table(name="ring_function_role")
public class FunctionRole extends SuperEntity {
	private static final long serialVersionUID = -5624481122763972645L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="function_id")
	private Function function;
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	@Column(name="operates")
	private Integer operates=Dictionary.ROLE_BROWSE;
	@Column(name="status")
	private int status=Dictionary.STATUS_BLOCK;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Function getFunction() {
		return function;
	}
	public void setFunction(Function function) {
		this.function = function;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Integer getOperates() {
		return operates;
	}
	public void setOperates(Integer operates) {
		this.operates = operates;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
