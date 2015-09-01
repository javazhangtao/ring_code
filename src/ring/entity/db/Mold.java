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
@Table(name="ring_mold")
public class Mold extends SuperEntity{
	private static final long serialVersionUID = 2841500439046749595L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="mold_name")
	private String moldName;
	@Column(name="status")
	private int status=Dictionary.STATUS_BLOCK;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMoldName() {
		return moldName;
	}
	public void setMoldName(String moldName) {
		this.moldName = moldName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
