package list.task.store;

import java.util.Objects;

public class App {
	private String appName;
	private String genre;
	private int data;
	private String price;
	
	public App () {;}
	
	public App(String appName, String genre, int data, String price) {
		super();
		this.appName = appName;
		this.genre = genre;
		this.data = data;
		this.price = price;
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "App [appName=" + appName + ", genre=" + genre + ", data=" + data + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		App other = (App) obj;
		return Objects.equals(appName, other.appName) && data == other.data && Objects.equals(genre, other.genre)
				&& price == other.price;
	}

	
	
}
