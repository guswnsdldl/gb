package list.task.epl;

import java.util.ArrayList;

import list.task.DBConnecter;
import list.task.subway.Subway;

public class EPL {

//	[ArrayList 과제3]
//	직접 주제를 정한 뒤 CRUD 연습하기
//	가지의 주제로 구성하고 구현한다.
//	EPL BIG 클럽 정보(개인 생각 기준)
//	맨시티 아스날 리버풀, 토트넘, 맨유, 첼시
//	리그 우승 횟수 10 / 13 / 19 / 2 / 20 / 6 조회
//	리그우승 평균 이상 팀 조회
//	한국인 뛴 팀 조회  맨유 1, 아스날 1, 토트넘 2 
//	최다 우승 팀 조회
	
	
public static final char[] checkGoatTeam = null;

//팀 이름으로 조회
public Team checkTeamName(String name) {	
	ArrayList<Team> teams = (ArrayList<Team>) DBConnecter.teams.clone();	
	for (int i = 0; i < teams.size(); i++) {	
		if(teams.get(i).getTeamName().equals(name)) {	
			return teams.get(i);		
		}
	}
	return null;	
}

	//	팀이름으로 리그우승 횟수 조회
	public Team checkWins(String name) {
		ArrayList<Team> teams = (ArrayList<Team>) DBConnecter.teams.clone();
		for (int i = 0; i < teams.size(); i++) {
			if(teams.get(i).getTeamName().equals(name)) {
				return teams.get(i);
			}
		}
		return null;	
	}

//	팀 추가
	public void add(Team team) {	
		DBConnecter.teams.add(team); 
	}
	
//	팀 삭제
	public void remove(Team team) {	
		DBConnecter.teams.remove(team);
	}
	
//	한국인이 뛴 팀검색으로 명 수 조회
	public Team playerNum(String team) {	
		ArrayList<Team> teams = (ArrayList<Team>) DBConnecter.teams.clone();	
		for (int i = 0; i < teams.size(); i++) {	
			if(teams.get(i).getTeamName().equals(team)) {	
				return teams.get(i);		
			}
		}
		return null;	
	}
	
//	리그우승 평균 이상 팀 조회
		public Team winsAVG(Team team) {	//
		int total = 0;		//정수형 total 초기값 0
		double average = 0.0;	//실수형 average 초기값 0.0
		
		for (int i = 0; i < DBConnecter.teams.size(); i++) { 
			total += DBConnecter.teams.get(i).getWins();	
		}
		
		average = (double)total / DBConnecter.subways.size();	
		
		return team.getWins() < average ? team : null;	
	}
	
	
}
