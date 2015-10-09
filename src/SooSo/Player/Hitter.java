package SooSo.player;

public class Hitter extends Player {

	Hitter(String name, String team, int birth, byte backNumber, float average, short games, short atBats, short runs,
			short hits, short singles, byte doubles, byte triples, byte homeRuns, short runsBattedIn,
			byte sacrificeHits, byte sacrificeFlys, byte stolenBases, byte caughtStealing, byte walks,
			byte intentionalWalks, byte hitByPitch, short strikeouts, byte groundIntoDoublePlay, float OPS,
			byte errors) {
		super(name, team, birth, backNumber, average, games);
		// TODO Auto-generated constructor stub

		setAtBats(atBats);
		setRuns(runs);
		setHits(hits);
		setSingles(singles);
		setDoubles(doubles);
		setTriples(triples);
		setHomeRuns(homeRuns);
		setRunsBattedIn(runsBattedIn);
		setSacrificeHits(sacrificeHits);
		setSacrificeFlys(sacrificeFlys);
		setStolenBases(stolenBases);
		setCaughtStealing(caughtStealing);
		setWalks(walks);
		setIntentionalWalks(intentionalWalks);
		setHitByPitch(hitByPitch);
		setStrikeouts(strikeouts);
		setGroundIntoDoublePlay(groundIntoDoublePlay);
		setOPS(OPS);
		setErrors(errors);
	}

	public void setAtBats(short atBats) {
		this.atBats = atBats;
	}

	public void setRuns(short runs) {
		this.runs = runs;
	}

	public void setHits(short hits) {
		this.hits = hits;
	}

	public void setSingles(short singles) {
		this.singles = singles;
	}

	public void setDoubles(byte doubles) {
		this.doubles = doubles;
	}

	public void setTriples(byte triples) {
		this.triples = triples;
	}

	public void setHomeRuns(byte homeRuns) {
		this.homeRuns = homeRuns;
	}

	public void setRunsBattedIn(short runsBattedIn) {
		this.runsBattedIn = runsBattedIn;
	}

	public void setSacrificeHits(byte sacrificeHits) {
		this.sacrificeHits = sacrificeHits;
	}

	public void setSacrificeFlys(byte sacrificeFlys) {
		this.sacrificeFlys = sacrificeFlys;
	}

	public void setStolenBases(byte stolenBases) {
		this.stolenBases = stolenBases;
	}

	public void setCaughtStealing(byte caughtStealing) {
		this.caughtStealing = caughtStealing;
	}

	public void setWalks(byte walks) {
		this.walks = walks;
	}

	public void setIntentionalWalks(byte intentionalWalks) {
		this.intentionalWalks = intentionalWalks;
	}

	public void setHitByPitch(byte hitByPitch) {
		this.hitByPitch = hitByPitch;
	}

	public void setStrikeouts(short strikeouts) {
		this.strikeouts = strikeouts;
	}

	public void setGroundIntoDoublePlay(byte groundIntoDoublePlay) {
		this.groundIntoDoublePlay = groundIntoDoublePlay;
	}

	public void setOPS(float OPS) {
		this.OPS = OPS;
	}

	public void setErrors(byte errors) {
		this.errors = errors;
	}

	public short getAtBats() {
		return atBats;
	}

	public short getRuns() {
		return runs;
	}

	public short getHits() {
		return hits;
	}

	public short getSingles() {
		return singles;
	}

	public byte getDoubles() {
		return doubles;
	}

	public byte getTriples() {
		return triples;
	}

	public byte getHomeRuns() {
		return homeRuns;
	}

	public short getRunsBattedIn() {
		return runsBattedIn;
	}

	public byte getSacrificeHits() {
		return sacrificeHits;
	}

	public byte getSacrificeFlys() {
		return sacrificeFlys;
	}

	public byte getStolenBases() {
		return stolenBases;
	}

	public byte getCaughtStealing() {
		return caughtStealing;
	}

	public byte getWalks() {
		return walks;
	}

	public byte getIntentionalWalks() {
		return intentionalWalks;
	}

	public byte getHitByPitch() {
		return hitByPitch;
	}

	public short getStrikeouts() {
		return strikeouts;
	}

	public byte getGroundIntoDoublePlay() {
		return groundIntoDoublePlay;
	}

	public float getOPS() {
		return OPS;
	}

	public byte getErrors() {
		return errors;
	}

	private short atBats; // 타수
	private short runs; // 득점
	private short hits; // 안타
	private short singles; // 단타
	private byte doubles; // 2루타
	private byte triples; // 3루타
	private byte homeRuns; // 홈런
	private short runsBattedIn; // 타점
	private byte sacrificeHits; // 희생번트
	private byte sacrificeFlys; // 희생플라이
	private byte stolenBases; // 도루
	private byte caughtStealing; // 도루실패
	private byte walks; // 볼넷
	private byte intentionalWalks; // 고의사구
	private byte hitByPitch; // 몸에맞는공
	private short strikeouts; // 삼진
	private byte groundIntoDoublePlay; // 병살
	private float OPS; // 출루율 + 장타율
	private byte errors; // 실책
}
