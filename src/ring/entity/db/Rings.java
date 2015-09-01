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
@Table(name="rings")
public class Rings extends SuperEntity{
	private static final long serialVersionUID = 5298603537203898337L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="ring_name")
	private String ringName;
	@Column(name="ring_address")
	private String ringAddress;
	@Column(name="ring_lon")
	private Float ringLon;
	@Column(name="ring_lat")
	private Float ringLat;
	@Column(name="ring_num")
	private int ringNum;
	@Column(name="status")
	private int status=Dictionary.STATUS_BLOCK;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRingName() {
		return ringName;
	}
	public void setRingName(String ringName) {
		this.ringName = ringName;
	}
	public String getRingAddress() {
		return ringAddress;
	}
	public void setRingAddress(String ringAddress) {
		this.ringAddress = ringAddress;
	}
	public Float getRingLon() {
		return ringLon;
	}
	public void setRingLon(Float ringLon) {
		this.ringLon = ringLon;
	}
	public Float getRingLat() {
		return ringLat;
	}
	public void setRingLat(Float ringLat) {
		this.ringLat = ringLat;
	}
	public int getRingNum() {
		return ringNum;
	}
	public void setRingNum(int ringNum) {
		this.ringNum = ringNum;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
