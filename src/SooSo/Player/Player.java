package SooSo.player;

public class Player {

	// constructor
	Player(String name, String team, int birth, byte backNumber, float average, short games) {
		setName(name);
		setTeam(team);
		setBirth(birth);
		setBackNumber(backNumber);
		setAverage(average);
		setGames(games);
	}

	// set functions
	public void setName(String name) {
		// if(name!=null)
		this.name = name;
	}

	public void setTeam(String team) {
		// if(team!=null)
		this.team = team;
	}

	public void setBirth(int birth) {
		// if(birth/10000000>1)
		this.birth = birth;
	}

	public void setBackNumber(byte backNumber) {
		this.backNumber = backNumber;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public void setGames(short games) {
		this.games = games;
	}

	// get functions
	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	public int getBirth() {
		return birth;
	}

	public byte getBackNumber() {
		return backNumber;
	}

	public float getAverage() {
		return average;
	}

	public short getGames() {
		return games;
	}

	private String name; //이름
	private String team; //소속팀
	private int birth; //생년월일
	private byte backNumber; //등번호
	private float average; //투수: 방어율, 타자: 타율
	private short games; //출전게임수

}