package myjob;

import java.util.Scanner;

//기획
//
//초보자 전사로 키우기
//
//1.사냥
//2.정보 창 열기
//3.종료
public class MyJob {
   public static void main(String[] args) {
      String tilte = "MapleStory 초보자 키우기";
      String message = "1. 페리온 사냥가기\n2. 정보 창 열기\n3. 종료";
      Scanner sc = new Scanner(System.in);
      String[] arJob = {"Lv1[초보자]", "Lv10, 1차 전직[전사] ", "Lv30, 2차 전직[스피어맨]",
                     "Lv70, 3차 전직[용기사]", "Lv120, 4차전직[다크나이트]"};
      Beginner zZ지존전사Zz = new Beginner("zZ지존전사Zz", 0, 60, 0);
      Beginner zZ지존전사Zz1 = new Beginner("zZ지존전사Zz", 0, 50, 0);
      
      int choice = 0;
      int successCount = 0, failCount = 0;
      
      while(true) {
         System.out.println(tilte);
         System.out.println(message);
         choice = sc.nextInt();
         
         if(choice == 3) {
            break;
         }
         
         switch(choice) {
         case 1:
            if(zZ지존전사Zz.hunt()) {
               zZ지존전사Zz.exp += 1_000_000;
               zZ지존전사Zz.successCount ++;
               successCount++;
               failCount = 0;
               
               System.out.println("Level Up!");
               System.out.println("현재 연속" + successCount +"번 사냥 성공!");
               if(successCount >=5) {
                  if(zZ지존전사Zz.Job < 4) { //5보다 작다고 했을때 사냥 성공하면 실행창이 닫혔었다
                                    //4로 적어서 확인해보니 초보자가 최초값, 전사 1, 스피어맨 2, 용기사 3, 다크나이트 4라서 그랬다 
                  zZ지존전사Zz.Job++;
                  System.out.println(arJob[zZ지존전사Zz.Job]+ "(으)로 전직!! 더 강해지셨군요!");   
                  }//if(zZ지존전사Zz.Job < 5) {
               } 
               break;
            }
      
            zZ지존전사Zz.exp /= 3;
            zZ지존전사Zz.failCount++;
            failCount ++;
            successCount = 0;
            System.out.println("가까운 마을로 귀환 합니다..");
            System.out.println("경험치가 차감되었습니다, " + failCount +"번 죽어서 망캐 위기입니다...!");
            if(failCount >=3) {
               if(zZ지존전사Zz.Job > 0) {      //위 주석에 이어 같은 맥락으로 >=0 으로 해보았는데 더 아래로 내려갈 등급이 없어서 실행창이 닫혔다
                  zZ지존전사Zz.Job--;
                  System.out.println(arJob[zZ지존전사Zz.Job] + "(으)로 하락 망캐입니다...!");
               }
            }
            break;
            
         case 2 :
            zZ지존전사Zz.printInfo();
            break;      
            
//            풀면서 궁금하거나 시도해보고 싶었던것
//            1.(시도) 사냥터를 추가하여 난이도 조정 높은 지역 사냥터 갈수록 경험치 상승률 증가로 기존 페리온보다 사냥성공 횟수를 줄여 다음등급 승급이 빠르도록
//            ex) 1.페리온 액스텀프 사냥하기(60퍼, 5번 성공시 승급) 2. 루디브리엄 로보토이 사냥하기(50퍼, 3번 성공시 승급)
//            2.(시도) 현재 조건으로 사냥성공에서 -> 대미지 입히기 성공, miss로 나눠서 죽는다는 조건 배제 
//            난이도가 상승하며 각 사냥터별 몬스터들의 체력이 추가되는걸 고려해서 ex) 페리온은 5번 공겨성공해야 액스텀프가 죽는다,
//            루디브리엄은 8번 공격 성공해야 로보토이가 죽는다 등으로 설정..
//            3.(시도) 다음 전직 성공시에는 레벨 격차를 생각하여 사냥 성공 횟수 증가 ex)1차는 5번 2차는 7번 3차는 10번 4차는 13번...
//            4.(궁금) 현재 소드코드에선 승급혹은 강등하고나서 연속성공, 실패가 이어지는 것으로 보이는데 승급성공후에 연속성공 초기화 강등후엔 연속실패를 할수있는지
//            
      
         }
		}
	}
}
