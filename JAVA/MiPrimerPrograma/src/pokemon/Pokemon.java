package pokemon;

public class Pokemon {
	private String name = "";
	private int health;
	private String type = "";
	private static int pCount;

	//getters and setters for each member variable.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health += health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public static int getpCount() {
		return pCount;
	}
	public static void setpCount(int pCount) {
		Pokemon.pCount = pCount;
	}
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
	}
	// create a constructor class to set the instance's name, health, and type on creation
	public Pokemon(String name, int health, String type) {
		setpCount(getpCount() + 1);
		setName(name);
		setHealth(health);
		setType(type);
		System.out.println("Pokémon fue creado " + name +" "+ health +" "+ type);
	}

}

