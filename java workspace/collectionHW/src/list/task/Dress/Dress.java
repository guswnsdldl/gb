package list.task.Dress;

import java.util.Objects;

/**
 * 
 */
public class Dress {
	String name;
	String size;
	int price;
	
	public Dress(String name, String size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Dress [name= " + name + ", size= " + size + ", price= " + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dress other = (Dress) obj;
		return Objects.equals(name, other.name) && price == other.price && Objects.equals(size, other.size);
	}

	



}