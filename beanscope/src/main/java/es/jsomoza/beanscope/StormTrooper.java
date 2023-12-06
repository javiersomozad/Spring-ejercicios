package es.jsomoza.beanscope;

public class StormTrooper {
	private String id;
	private String rank;
	private Logger logger;

	public StormTrooper() {
	}

	public StormTrooper(String id, String rank, Logger logger) {
		this.id = id;
		this.rank = rank;
		this.logger = logger;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "StormTrooper [id=" + id + ", rank=" + rank + "]";
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
