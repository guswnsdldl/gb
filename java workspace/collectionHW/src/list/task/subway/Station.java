package list.task.subway;

import java.util.ArrayList;

import list.task.DBConnecter;

//[ArrayList 과제2]
//	직접 주제를 정한 뒤 CRUD 연습하기
//	총 3가지의 주제로 구성하고 구현한다.
//	지하철역 
//	서울대입구, 강남, 미아4거리, 도봉산, 한남 각 역 해당 호선 조회(서울대입구 - 2호선, 강남 - 2호선, 미아 - 4호선, 도봉산 - 7호선, 한남 - 경의중앙선)
//	각 역 지역으로 조회 (서울대입구 - 관악구, 강남 - 강남구, 미아4거리 - 강북구, 도봉산 - 도봉구, 한남 - 용산구)
//	요금이 평균 이상인 호선 조회
public class Station {

	//	지하철역 이름으로 조회
	public Subway checkStationName(String name) {	
		ArrayList<Subway> subways = (ArrayList<Subway>) DBConnecter.subways.clone();	
		for (int i = 0; i < subways.size(); i++) {	
			if(subways.get(i).getStationName().equals(name)) {	
				return subways.get(i);		
			}
		}
		return null;	
	}
	
//	지하철역이 속한 지역구로 역 조회	
	public Subway checkdistrictName(String name) {		
		Subway subway = null;
		for (int i = 0; i < DBConnecter.subways.size(); i++) { 
			if(DBConnecter.subways.get(i).getDistrictName().equals(name)) {
				subway = DBConnecter.subways.get(i);
			}
		}
		return subway;
	}

//	역 추가
	public void add(Subway subway) {	
		DBConnecter.subways.add(subway); 
	}
	
//	역 삭제
	public void remove(Subway subway) {	//저장공간에 있는 과일을 삭제해주는 메소드
		DBConnecter.subways.remove(subway);	//
		}
	
// 	요금이 평균 이하인 호선 조회
	public Subway checkPrice(Subway subway) {	//
		int total = 0;		//정수형 total 초기값 0
		double average = 0.0;	//실수형 average 초기값 0.0
		
		for (int i = 0; i < DBConnecter.subways.size(); i++) { 
			total += DBConnecter.subways.get(i).getFare();	
		}
		
		average = (double)total / DBConnecter.subways.size();	
		
		return subway.getFare() < average ? subway : null;	
		}
//	사용자가 원하는 호선으로 역 조회

	public Subway wantLine(String line) {	
		ArrayList<Subway> subways = (ArrayList<Subway>) DBConnecter.subways.clone();	
		for (int i = 0; i < subways.size(); i++) {	
			if(subways.get(i).getLine().equals(line)) {	
				return subways.get(i);		
			}
		}
		return null;	
	}				
	
}