package arraypractice;

public class ArrayPractice {
	public static void main(String[] args){
		
		int[] iknowAll = {1,2,3,4,5};	//1부터 5까지 들어간 5칸짜리 배열
		System.out.println(iknowAll);	//주소
		for(int i = 0; i < iknowAll.length; i++) {	//반복문
			System.out.println(iknowAll[i]);	//출력
		}
		System.out.println("====================");
		int[] iknowit = new int[10];	//뭐가 들어갈진 모르지만 몇개가 들어갈지는 아는 10칸짜리 배열
		System.out.println(iknowit);	//주소
		for(int i = 0; i < iknowit.length; i++) {	//반복문
			iknowit[i]=i+1;		//i번째 방에 i 가 반복할때마다 +1 = i가 0 이라면 iknowit[0] = 1
			System.out.println(iknowit[i]);	//출력
		}
		System.out.println("====================");
		
		int[] idontknowit = null;
		for(int i = 0; i<idontknowit.length; i++) {
			idontknowit[i] = i+1;
			System.out.println(idontknowit);	//new를 이용해서 heap메모리에 주소값을 할당하지 않았기 때문에 런타임시 오류가 나온다
			System.out.println(idontknowit[i]);		//i번째 방도 동일하다					
		}
		String[] name = {"한민규", "고준영", "안세용", "조수인", "차지용", "양희승"};
		int i = 0;
		for(i = 0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
	}
}
