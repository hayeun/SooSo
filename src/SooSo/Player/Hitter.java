package SooSo.Player;

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

	private short atBats; //
	private short runs; //
	private short hits; //
	private short singles; //
	private byte doubles; //
	private byte triples; //
	private byte homeRuns; //
	private short runsBattedIn; //
	private byte sacrificeHits; //
	private byte sacrificeFlys; //
	private byte stolenBases; //
	private byte caughtStealing; //
	private byte walks; //
	private byte intentionalWalks; //
	private byte hitByPitch; //
	private short strikeouts; //
	private byte groundIntoDoublePlay; //
	private float OPS; //
	private byte errors; //
}
