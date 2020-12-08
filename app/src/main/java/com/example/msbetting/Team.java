
public class Team extends Sports{
	
	String arena;
	String city;
	float[] stats
	
	public String getArena() {
		return arena;
	}
	
	public String setArena(String arena) {
		this.arena = arena;
	}
	
	public String getCity() {
		return city;
	}
	
	public String setCity(String city) {
		this.city = city;
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
