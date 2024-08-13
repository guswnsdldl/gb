package list.task.subway;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		
		Subway 서울대입구 = new Subway("서울대입구", "관악구","2호선", 1400);
		Subway 강남 = new Subway("강남", "강남구","2호선", 1750);
		Subway 미아4거리 = new Subway("미아4거리", "강북구","4호선", 1400);
		Subway 도봉산 = new Subway("도봉산", "도봉구","7호선", 1400);
		Subway 한남 = new Subway("한남", "용산구","경의중앙선", 1400);
		
		Station station = new Station();
		ArrayList<Subway> subways = null;
		
		if(station.checkStationName("서울대입구") == null) {
			station.add(서울대입구);
		}
		if(station.checkStationName("강남") == null) {
			station.add(강남);
		}
		if(station.checkStationName("미아4거리") == null) {
			station.add(미아4거리);
		}
		if(station.checkStationName("도봉산") == null) {
			station.add(도봉산);
		}
		if(station.checkStationName("한남") == null) {
			station.add(한남);
		}
		
		System.out.println(DBConnecter.subways);
		
		System.out.println("선택하신 역은 " + station.checkStationName("강남").getLine()+"이 있습니다.");

		System.out.println("선택하신 지역구는 " + station.checkdistrictName("용산구").getStationName()+"역이 있습니다.");
		
		System.out.println(station.wantLine("7호선"));
	
		System.out.println(station.checkPrice(강남));
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
