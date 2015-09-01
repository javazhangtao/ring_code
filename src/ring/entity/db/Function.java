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
@Table(name="ring_function")
public class Function extends SuperEntity{

	private static final long serialVersionUID = -3078226750168315047L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="function_name")
	private String functionName;
	@Column(name="function_url")
	private String functionUrl;
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Function parent;
	@Column(name="status")
	private int status=Dictionary.STATUS_BLOCK;
	@Column(name="priority")
	private int priority;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public String getFunctionUrl() {
		return functionUrl;
	}
	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}
	public Function getParent() {
		return parent;
	}
	public void setParent(Function parent) {
		this.parent = parent;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
