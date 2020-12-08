
public class Player extends Sports{

	String team;
	String position;
	float[] stats
	
	public String getTeam() {
		return team;
	}
	
	public String setTeam(String team) {
		this.team = team;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String setPosition(String position) {
		this.position = position;
	}
	
	public String getStats() {
		return stats;
	}
	
	public String setStats(float[] stats) {
		for(int x =0;x!=stats.length;x++) {
			this.stats[x]=stats[x];
		}
	}
}
