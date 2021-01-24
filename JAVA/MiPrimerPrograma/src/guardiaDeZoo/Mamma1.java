package guardiaDeZoo;

public class Mamma1 {
	// atributos
	private Integer energyLevel = 100;

	// constructor
	public Mamma1() {
		super();

	}

	// metodo
	public void desiplayEnergy() {
		this.setEnergyLevel(getEnergyLevel());
		System.out.println(energyLevel);

	}

	// setter y getter
	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}

}
