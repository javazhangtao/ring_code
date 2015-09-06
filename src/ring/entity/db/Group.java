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
@Table(name="ring_group")
public class Group extends SuperEntity{
	private static final long serialVersionUID = 5298603537203898337L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="group_name")
	private String groupName;
	@Column(name="group_address")
	private String groupAddress;
	@Column(name="group_lon")
	private Float groupLon;
	@Column(name="group_lat")
	private Float groupLat;
	@Column(name="group_num")
	private int groupNum;
	@Column(name="status")
	private int status=Dictionary.STATUS_BLOCK;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupAddress() {
		return groupAddress;
	}
	public void setGroupAddress(String groupAddress) {
		this.groupAddress = groupAddress;
	}
	public Float getGroupLon() {
		return groupLon;
	}
	public void setGroupLon(Float groupLon) {
		this.groupLon = groupLon;
	}
	public Float getGroupLat() {
		return groupLat;
	}
	public void setGroupLat(Float groupLat) {
		this.groupLat = groupLat;
	}
	public int getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
