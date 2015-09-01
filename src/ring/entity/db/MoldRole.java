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
@Table(name="ring_mold_role")
public class MoldRole extends SuperEntity{
	
	private static final long serialVersionUID = 220427859049832085L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="ring_id")
	private Rings rings;
	@ManyToOne
	@JoinColumn(name="mold_id")
	private Mold mold;
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	@Column(name="status")
	private int status=Dictionary.STATUS_BLOCK;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Rings getRings() {
		return rings;
	}
	public void setRings(Rings rings) {
		this.rings = rings;
	}
	public Mold getMold() {
		return mold;
	}
	public void setMold(Mold mold) {
		this.mold = mold;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
