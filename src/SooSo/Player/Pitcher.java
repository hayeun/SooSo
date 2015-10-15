package SooSo.Player;

public class Pitcher extends Player {

	Pitcher(String name, String team, int birth, byte backNumber, float average, short games, float innings, float ERA,
			byte wins, byte losses, byte completedGames, byte shutouts, byte saves, byte holds, byte blownSaves,
			short outs, short hits, short runs, short earnedRuns, byte homeRuns, byte walks, byte intentionalWalks,
			byte hitBatters, byte strikeouts, byte wildPitches, byte balks, byte baseAllowed,
			byte battersGroundedIntoDoublePlays) {
		super(name, team, birth, backNumber, average, games);
		// TODO Auto-generated constructor stub
		setInnings(innings);
		setERA(ERA);
		setWins(wins);
		setLosses(losses);
		setCompletedGames(completedGames);
		setShutouts(shutouts);
		setSaves(saves);
		setHolds(holds);
		setBlownSaves(blownSaves);
		setOuts(outs);
		setHits(hits);
		setRuns(runs);
		setEarnedRuns(earnedRuns);
		setHomeRuns(homeRuns);
		setWalks(walks);
		setIntentionalWalks(intentionalWalks);
		setHitBatters(hitBatters);
		setStrikeouts(strikeouts);
		setWildPitches(wildPitches);
		setBalks(balks);
		setBaseAllowed(baseAllowed);
		setBattersGroundedIntoDoublePlays(battersGroundedIntoDoublePlays);
	}

	public void setInnings(float innings) {
		this.innings = innings;
	}

	public void setERA(float ERA) {
		this.ERA = ERA;
	}

	public void setWins(byte wins) {
		this.wins = wins;
	}

	public void setLosses(byte losses) {
		this.losses = losses;
	}

	public void setCompletedGames(byte completedGames) {
		this.completedGames = completedGames;
	}

	public void setShutouts(byte shutouts) {
		this.shutouts = shutouts;
	}

	public void setSaves(byte saves) {
		this.saves = saves;
	}

	public void setHolds(byte holds) {
		this.holds = holds;
	}

	public void setBlownSaves(byte blownSaves) {
		this.blownSaves = blownSaves;
	}

	public void setOuts(short outs) {
		this.outs = outs;
	}

	public void setHits(short hits) {
		this.hits = hits;
	}

	public void setRuns(short runs) {
		this.runs = runs;
	}

	public void setEarnedRuns(short earnedRuns) {
		this.earnedRuns = earnedRuns;
	}

	public void setHomeRuns(byte homeRuns) {
		this.homeRuns = homeRuns;
	}

	public void setWalks(byte walks) {
		this.walks = walks;
	}

	public void setIntentionalWalks(byte intentionalWalks) {
		this.intentionalWalks = intentionalWalks;
	}

	public void setHitBatters(byte hitBatters) {
		this.hitBatters = hitBatters;
	}

	public void setStrikeouts(byte strikeouts) {
		this.strikeouts = strikeouts;
	}

	public void setWildPitches(byte wildPitches) {
		this.wildPitches = wildPitches;
	}

	public void setBalks(byte balks) {
		this.balks = balks;
	}

	public void setBaseAllowed(byte baseballowed) {
		this.baseAllowed = baseAllowed;
	}

	public void setBattersGroundedIntoDoublePlays(byte battersGroundedIntoDoublePlays) {
		this.battersGroundedIntoDoublePlays = battersGroundedIntoDoublePlays;
	}

	public float getInnings() {
		return innings;
	}

	public float getERA() {
		return ERA;
	}

	public byte getWinds() {
		return wins;
	}

	public byte getLosses() {
		return losses;
	}

	public byte getCompletedGames() {
		return completedGames;
	}

	public byte getShutouts() {
		return shutouts;
	}

	public byte getSaves() {
		return saves;
	}

	public byte getHolds() {
		return holds;
	}

	public byte getBlownSaves() {
		return blownSaves;
	}

	public short getOuts() {
		return outs;
	}

	public short getHits() {
		return hits;
	}

	public short getRuns() {
		return runs;
	}

	public short getEarnedRuns() {
		return earnedRuns;
	}

	public byte getHomeRuns() {
		return homeRuns;
	}

	public byte getWalks() {
		return walks;
	}

	public byte getIntentionalWalks() {
		return intentionalWalks;
	}

	public byte getHitBatters() {
		return hitBatters;
	}

	public byte getStrikeouts() {
		return strikeouts;
	}

	public byte getWildPitches() {
		return wildPitches;
	}

	public byte getBalks() {
		return balks;
	}

	public byte getBaseAllowed() {
		return baseAllowed;
	}

	public byte getBattersGroundedIntoDoublePlays() {
		return battersGroundedIntoDoublePlays;
	}

	private float innings; // �뜕吏� �씠�떇
	private float ERA; // 諛⑹뼱�쑉
	private byte wins; // �듅
	private byte losses; // �뙣
	private byte completedGames; // �셿�닾
	private byte shutouts; // �셿遊됱듅
	private byte saves; // �꽭�씠釉�
	private byte holds; // ���뱶
	private byte blownSaves; // 釉붾줎�꽭�씠釉�
	private short outs; // �븘�썐
	private short hits; // �뵾�븞��
	private short runs; // �떎�젏
	private short earnedRuns; // �옄梨낆젏
	private byte homeRuns; // �뵾�솃�윴
	private byte walks; // 蹂쇰꽬�뿀�슜
	private byte intentionalWalks; // 怨좎쓽�궗援�
	private byte hitBatters; // 紐몄뿉留욌뒗蹂�
	private byte strikeouts; // �궪吏�
	private byte wildPitches; // ���씪�뱶�뵾移�
	private byte balks; // 蹂댄겕
	private byte baseAllowed; // �룄猷⑦뿀�슜
	private byte battersGroundedIntoDoublePlays; // 蹂묒궡���쑀�룄

}
