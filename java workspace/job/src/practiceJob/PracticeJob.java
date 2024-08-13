package practiceJob;

import java.util.Scanner;

//기획
//
//월클 선수  son 키우기
//
//1. 경기뛰기
//2. 선수 정보 보기
//3. 은퇴

public class PracticeJob {
   public static void main(String[] args) {
      String title = "월클 선수 son 키우기";
      String menu = "1. 경기 뛰기\n2. 선수 정보 보기\n3. 은퇴";
      Scanner sc = new Scanner(System.in);
      String[] arClub = {"노팅엄 포레스트", "뉴캐슬 유나이티드", "맨체스터 시티"};
      SoccerPlayer son = new SoccerPlayer("son", 0, 60, 0);
                              //    이름   goal  확률  돈 
//                                 name / goal / bool / money         
      int choice = 0;
      int goalCount = 0, failGoalCount = 0;
      
      while(true) {   //기획한 게임이 몇번 끝날지 모르기 때문에 while문
         System.out.println(title);
         System.out.println(menu);
         choice = sc.nextInt();
         
         if(choice == 3) {   //3번 은퇴를 선택할시 그대로 실행창 종료
            break;
         }
         
         switch(choice) {
         case 1:
            if(son.play()) {
               son.money += 50_000_000;
               son.allGoal ++;
               goalCount++;
               failGoalCount = 0;
               
               System.out.println("Goal!! 골 넣기 성공!!");
               System.out.println("현재 연속 " + goalCount +"경기 연속골 성공! ");
               if(goalCount >= 4) {
                  if(son.club < 2) {
                    son.club ++;
                    System.out.println(arClub[son.club] + "으로 이적!! 월클선수 얼마 안남았습니다!");
                    goalCount = 0;
                    son.rating += 5;
                  }
            }
               break;
         }
               son.money -= 30_000_000;
               son.failGoalCount ++;
               failGoalCount ++;
               goalCount = 0;
               System.out.println("이번경기 골넣기 실패..");
                  System.out.println("부진하고 있습니다, 현재 " + failGoalCount + "경기째 무득점입니다");
                  if(failGoalCount >= 3) {
                     if(son.club > 0) {
                        son.club--;
                        System.out.println(arClub[son.club] + "(으)로 하향이적ㅠㅠㅠㅠ 훈련하세요!");
                     }
                  }
               
               break;
               case 2 :
                  son.printInfo();
                  break;
            
      }
   }   
   }
}
