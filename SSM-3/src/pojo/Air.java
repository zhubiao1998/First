package pojo;

public class Air {
	private int id;
	private int districtid;
	private String monitor;
	private int pm10;
	private int pm25;
	private String monitoring;
	private String lasttime;

	private int did;
	private String name;
	
	public Air() {
	}
	
	public Air(int did, String name) {
		this.did = did;
		this.name = name;
	}

	public Air(int districtid, String monitor, int pm10, int pm25,
			String monitoring) {
		this.districtid = districtid;
		this.monitor = monitor;
		this.pm10 = pm10;
		this.pm25 = pm25;
		this.monitoring = monitoring;
	}

	public Air(int id, int districtid, String monitor, int pm10, int pm25,
			String monitoring, String lasttime) {
		this.id = id;
		this.districtid = districtid;
		this.monitor = monitor;
		this.pm10 = pm10;
		this.pm25 = pm25;
		this.monitoring = monitoring;
		this.lasttime = lasttime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDistrictid() {
		return districtid;
	}
	public void setDistrictid(int districtid) {
		this.districtid = districtid;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public int getPm10() {
		return pm10;
	}
	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}
	public int getPm25() {
		return pm25;
	}
	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}
	public String getMonitoring() {
		return monitoring;
	}
	public void setMonitoring(String monitoring) {
		this.monitoring = monitoring;
	}
	public String getLasttime() {
		return lasttime;
	}
	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
