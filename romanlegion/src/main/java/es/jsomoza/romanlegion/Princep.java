package es.jsomoza.romanlegion;

public class Princep extends Unit {

	public Princep(String name) {
		super(name);
	}

	@Override
	public Integer getAttack() {
		return super.getAttack() + 2;
	}

	@Override
	public Integer getDefense() {
		return super.getDefense() + 2;
	}
}