package list.task.epl;

import java.util.Objects;

public class Team {
	String teamName;
	int wins;
	int KoreanLeaguer;
	
	public Team() {;}

	public Team(String teamName, int wins, int koreanLeaguer) {
		super();
		this.teamName = teamName;
		this.wins = wins;
		KoreanLeaguer = koreanLeaguer;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getKoreanLeaguer() {
		return KoreanLeaguer;
	}

	public void setKoreanLeaguer(int koreanLeaguer) {
		KoreanLeaguer = koreanLeaguer;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", wins=" + wins + ", KoreanLeaguer=" + KoreanLeaguer + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return KoreanLeaguer == other.KoreanLeaguer && Objects.equals(teamName, other.teamName) && wins == other.wins;
	}
	
	
	
	
}
