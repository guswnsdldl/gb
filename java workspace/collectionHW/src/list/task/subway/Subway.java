package list.task.subway;

import java.util.Objects;

public class Subway {
	String stationName;
	String districtName;
	String line;
	int fare;
	
	public Subway() {;}
	
	public Subway(String stationName, String districtName, String line, int fare) {
		super();
		this.stationName = stationName;
		this.districtName = districtName;
		this.line = line;
		this.fare = fare;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Subway [stationName=" + stationName + ", districtName=" + districtName + ", line=" + line + ", fare="
				+ fare + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subway other = (Subway) obj;
		return Objects.equals(districtName, other.districtName) && fare == other.fare && line == other.line
				&& Objects.equals(stationName, other.stationName);
	}

}

	