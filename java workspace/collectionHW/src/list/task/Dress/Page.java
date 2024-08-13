package list.task.Dress;

import java.awt.image.ShortLookupTable;
import java.util.ArrayList;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		Dress shirt = new Dress("셔츠", "lazy", 23000);
		Dress bottom = new Dress("바지", "medium", 35000);
		Dress shortShirt = new Dress("반팔", "small", 13000);
		Dress shortBottom = new Dress("반바지", "Lazy", 21000);
		Dress Tshirt = new Dress("티셔츠", "Free", 22500);
		
		Shop shop = new Shop();
		
		if(shop.checkDressKind(shirt.getName()) == null) {
			shop.add(shirt);

		
		if(shop.checkDressKind(bottom.getName()) == null) {
			shop.add(bottom);
		}
		
		if(shop.checkDressKind(shortShirt.getName()) == null) {
			shop.add(shortShirt);
			
			
		}
		if(shop.checkDressKind(shortBottom.getName()) == null) {
			shop.add(shortBottom);
			
			
		}
		if(shop.checkDressKind(Tshirt.getName()) == null) {
			shop.add(Tshirt);
			}
		}
		
		ArrayList<Dress> dress = shop.findAll();
		
		shop.add(Tshirt);
		shop.add(shirt);
		shop.add(bottom);
		shop.add(shortShirt);
		shop.add(shortBottom);
		dress = shop.findAll();
		
		System.out.println(shop.checkSize("medium"));	//미디움 조회
		System.out.println(shop.checkDressKind("청바지"));	//목록에 없어서 null
		System.out.println(DBConnecter.dress);	//전체 목록 조회
		System.out.println(shop.checkPrice(shortShirt));	//평균 가격보다 낮은 옷 조회
		
		
		
		
		
		
	}
}
