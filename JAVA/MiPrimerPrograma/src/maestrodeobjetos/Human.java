package maestrodeobjetos;



public class Human {

	private Integer strength = 3;
	private Integer	stealth = 3; 
	private Integer	intelligence = 3;
	private Double health = 100D;
	
	//constructores
	public Human() {
		super();
	}

	public Human(Integer strength, Integer stealth, Integer intelligence, Double health) {
		super();
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}
	// metodo
	public void attack(Human atakador) {
		//reducir el atributo health del humano atacado 
		//por los puntos de strength del humano atacante.
		this.setHealth(this.getHealth() -atakador.getStrength());
		atakador.setHealth(0D);
	}
	public boolean energia(){// tiene energia o no, si es negativa setea en 0
		if (getHealth()<1) {
			setHealth(0d);
			return false;
		}
		return true;
	}
	
		//set and get
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getStealth() {
		return stealth;
	}
	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public Double getHealth() {
		return health;
	}
	public void setHealth(Double health) {
		this.health = health;
	}
	
	
}

