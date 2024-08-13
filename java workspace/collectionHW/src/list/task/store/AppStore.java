package list.task.store;

import java.util.ArrayList;

import list.task.DBConnecter;

public class AppStore {
//	[심화실습2]
//	앱스토어
//	상품 클래스 선언
//	상품 CRUD 선언
//	상품 추가 Create
//	상품 조회 Read
//	상품 수정 Update
//	상품 삭제 Delete
//	상품 목록 Read
	
//	상품 조회 Read
	public App checkAppName(String name) {
		App apP = null;		
		for (int i = 0; i < DBConnecter.apps.size(); i++) { 
			if(DBConnecter.apps.get(i).getAppName().equals(name)) {	
				apP = DBConnecter.apps.get(i);
			}
		}
		return apP;	
	}
private Object getAppName() {	//뭔지 잘 모르겠습니다.. 빨간줄 해결하려고 일단 해봤어요
		return null;
	}

	//	상품 추가 Create
	public void add(AppStore appStore) {	
		DBConnecter.apps.add(appStore); 
	}
	
//	상품 추가 Delete
	public void Delete(AppStore appStore) {	
		DBConnecter.apps.add(appStore); 
	}
//	앱 가격 상승 Update
	public void update(AppStore appStore) {	//void형 update를 사용하면 
		int targetIndex = DBConnecter.apps.indexOf(appStore);	//음식이름이 들어오면 문자열에 해당위치를 찾는다
		appStore.setPrice((int)(appStore.setPrice() * 1.3)); 		//들어온 음식의 가격을 가져오고 10%상승시켜 수정한다
		DBConnecter.apps.set(targetIndex, appStore);
	}
	private double setPrice() {			//뭔지 잘 모르겠습니다.. 빨간줄 해결하려고 일단 해봤어요
		// TODO Auto-generated method stub
		return 0;
	}
	private void setPrice(int i) {		//뭔지 잘 모르겠습니다.. 빨간줄 해결하려고 일단 해봤어요
		// TODO Auto-generated method stub
		
	}		
//  사용자가 원하는 앱 종류로 조회
	public ArrayList<AppStore> checkKind(String Data) {
		ArrayList<AppStore> apps = (ArrayList<AppStore>) DBConnecter.apps.clone();
		ArrayList<Dress> result = new ArrayList<Dress>();
		for (int i = 0; i < apps.size(); i++) {		
			if(apps.get(i).getGenre().equals(Data)) {	
			}
	    }
	    return null;
	}
	private Object getGenre() {		//뭔지 잘 모르겠습니다.. 빨간줄 해결하려고 일단 해봤어요
		// TODO Auto-generated method stub
		return null;
	}
	public void add(App 카카오톡) {
		// TODO Auto-generated method stub
		
	}
}
	
