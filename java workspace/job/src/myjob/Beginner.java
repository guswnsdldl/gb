package myjob;

import java.util.Random;

//1) 초보자 
//성공 확률 70%
//      사냥 성공! 
//       경험치 20% 추가!
//실패 확률 30%
//      가까운 마을로 귀환
//      경험치 3/1 하락!
//연속 5회 성공 시
//    Level Up!, 전직!
//
//연속 3회 실패 시
//    경험치가 차감되었습니다, 망캐!
//
//
//1-1) 등급
//   초보자 Lv1[초보자]
//    1차 Lv10,전직[전사]
//  2차 Lv30,전직[스피어맨]
//    3차 Lv70,전직[용기사]
//   4차 Lv120,전직[다크나이트]
//
//2) 정보 보기
//닉네임
//성공 횟수
//실패 횟수
//현재 직업
//3) 로그아웃
public class Beginner {
   String name;
   int successCount;
   int failCount;
   int exp;
   int rating;
   int Job;
   
   public Beginner(String name, int exp, int rating, int Job) {
      this.name = name;
      this.exp = exp;
      this.rating = rating;
      this.Job = Job;
   }
   
   boolean hunt() {
      Random random = new Random();
      int[] arData = new int[10];
      int randomIndex = 0;
      
      for (int i = 0 ; i < rating / 10; i++) {
         arData[i] = 1;
      }
      randomIndex = random.nextInt(arData.length);
      
      if(arData[randomIndex] == 1) {
         return true;
      }
         return false;
   }
   
      void printInfo() {
         String infoMessage = "닉네임 : " + this.name + "\n"
               + " 사냥 성공 횟수 : " + this.successCount + "번\n"
                     + "사냥 실패 횟수 : " + this.failCount + "번\n"
                           + "현재 경험치 : " + this.exp + "Exp";
         System.out.println(infoMessage);
      }
}   
   