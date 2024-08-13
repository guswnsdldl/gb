package list.task.Dress;


import java.util.ArrayList;

import list.task.DBConnecter;

public class Shop {
//	[ArrayList 실습3]
//			   직접 주제를 정한 뒤 CRUD 연습하기(Outfit,
//			   총 3가지의 주제로 구성하고 구현한다.
//			   - 쇼핑몰 - 옷 종류 추가 삭제
//			   - 셔츠, T셔츠, 반팔, 긴바지, 반바지
//			   - 각 종류 마다 사이즈 M, L, Free 사이즈
//			   - 옷 가격
//			   - 5종 전체 조회
//			   - 옷 5가지 중 사이즈 별 옷 조회
//			   - 옷 5가지 중 평균 가격보다 높은 옷 조회 
	
//	옷 이름으로 옷 조회
	public Dress checkDressKind(String name) {
		ArrayList<Dress> dress = (ArrayList<Dress>) DBConnecter.dress.clone();
		for(int i =0; i<dress.size(); i++) {
			if(DBConnecter.dress.get(i).getName().equals(name)) {
				return dress.get(i);
			}
		}return null;
	}
//	옷 추가
	public void add(Dress dress) {
		DBConnecter.dress.add(dress);
	}
//	옷 삭제
	public void remove(Dress dress) {
		DBConnecter.dress.remove(dress);
	}
//  사이즈가 ?인 옷 조회
	public ArrayList<Dress> checkSize(String size) {
		ArrayList<Dress> dress = (ArrayList<Dress>) DBConnecter.dress.clone();
		ArrayList<Dress> result = new ArrayList<Dress>();
		
		for (int i = 0; i < dress.size(); i++) {		
			if(dress.get(i).getSize().equals(size)) {	
				result.add(dress.get(i));
			}
	    }
	    return result;
	}
	
//	가격이 평균보다 높은 옷 조회 	
		public Dress checkPrice(Dress dress) {	
			int total = 0;		
			double average = 0.0;
			for (int i = 0; i < DBConnecter.dress.size(); i++) { 
				total += DBConnecter.dress.get(i).getPrice();	
			}
			average += (double)total / DBConnecter.dress.size();
		
			return dress.getPrice() > average ? dress : null;
		}
		
//		옷 전체 조회
		public ArrayList<Dress> findAll() {				//
			return (ArrayList<Dress>) DBConnecter.dress.clone();	// 어레이리스트 후르츠 안에 있는 저장공간속 과일의 값 주소를 복제하여 어레이 리스트에 리턴 
		}
}