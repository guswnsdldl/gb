package practiceJob;

import java.util.Random;

//기획
//
// 월클 선수 키우기
//
//1. 경기뛰기
//   골 넣을 확률 60%
//   주급 상승 +50_000_000
//
//   골 못넣을 확률 40%
//   주급 하락 -20_000_000
//
//1-1) 명성에 따른 구단
//   노팅엄 포레스트
//   뉴캐슬 유나티이트
//   맨체스터 시티
//2. 선수 정보 보기
//   이름 : Son
//   누적넣은 골수 :
//   못넣은 경기수 : 
//   주급 : 100_000_00 시작 +a
//
//3. 은퇴
public class SoccerPlayer {
   String name;
      int allGoal;
      int failGoalCount;
      int money;
      int rating;
      int club;

      public SoccerPlayer(String name, int allGoal, int rating, int money) {
         this.name = name;
            this.allGoal = allGoal;
            this.rating = rating;
            this.money = money;
   }

   boolean play(){
         Random random = new Random();
         int[] arData = new int[10];
         int randomIndex = 0;
         
         for (int i = 0; i < rating / 10; i++) {
            arData[i] = 1;
         }
         
         randomIndex = random.nextInt(arData.length);
         
         if(arData[randomIndex] == 1) {
            return true;
         }
         return false;
      }
      boolean congoal(){
            Random random = new Random();
            int[] arData = new int[10];
            int randomIndex = 0;
            
            for (int i = 0; i < rating / 10; i++) {
               arData[i] = 1;
            }
            
            randomIndex = random.nextInt(arData.length);
            
            if(arData[randomIndex] == 1) {
               return true;
            }
            
            return false;
      }
      
      void printInfo() {
         String infoMessage = "이름: " + this.name + "\n"
               + "이번 시즌 득점 : " + this.allGoal + "호 골\n"
                     + "무득점 경기: " + this.failGoalCount + "번\n"
                           + "현재 잔액: " + this.money + "원";
         System.out.println(infoMessage);
      }
   }