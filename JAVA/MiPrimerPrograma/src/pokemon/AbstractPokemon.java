package pokemon;

	public abstract class AbstractPokemon implements PokemonInterface {
		public Pokemon createPokemon(String name, int health, String type) {
			return new Pokemon(name, health, type);
		}
		public void pokemonInfo(Pokemon pokemon) {
			System.out.println("Name: "+pokemon.getName()+" Health: "+pokemon.getHealth()+" Type: "+pokemon.getType());
		}
	}
	
	

