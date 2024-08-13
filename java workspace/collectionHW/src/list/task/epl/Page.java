package list.task.epl;

import java.util.ArrayList;

import list.task.DBConnecter;


public class Page {
	public static void main(String[] args) {
		
		Team 맨시티 = new Team("맨체스터 시티",10, 0);
		Team 아스날 = new Team("아스날",13, 1);
		Team 리버풀 = new Team("리버풀",19, 0);
		Team 토트넘 = new Team("토트넘 홋스퍼",2, 2);
		Team 맨유 = new Team("맨체스터 유나이티드",20, 1);
		Team 첼시 = new Team("첼시",6, 0);
		
		EPL epl = new EPL();
		ArrayList<Team> teams = null;
		
		if(epl.checkTeamName("맨체스터 시티") == null) {
			epl.add(맨시티);
		}
		if(epl.checkTeamName("아스날") == null) {
			epl.add(아스날);
		}
		if(epl.checkTeamName("리버풀") == null) {
			epl.add(리버풀);
		}
		if(epl.checkTeamName("토트넘 홋스퍼") == null) {
			epl.add(토트넘);
		}
		if(epl.checkTeamName("맨체스터 유나이티드") == null) {
			epl.add(맨유);
		}
		if(epl.checkTeamName("첼시") == null) {
			epl.add(첼시);
		}
		
		System.out.println(DBConnecter.teams);
		
		
		System.out.println("선택한 팀은 " + epl.checkWins("아스날").getWins()+ "회 우승하였습니다");
		
		System.out.println("선택한 팀은 역대 " + epl.playerNum("토트넘 홋스퍼").getKoreanLeaguer()+ "호 코리안리거가 있습니다");
		
		System.out.println(epl.winsAVG(리버풀));
		
	}
}
