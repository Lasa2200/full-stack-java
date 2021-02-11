package pokemon;

public class PokemonTest {
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon kakuna = pokedex.createPokemon("Kakuna", 95, "Bug");
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 100, "Electric");
		Pokemon abra = pokedex.createPokemon("Abra", 80, "Psychic");
		Pokemon rapidash = pokedex.createPokemon("Rapidash", 97, "Fire");
		Pokemon kingler = pokedex.createPokemon("Kingler", 86, "Water");
		pokedex.pokemonInfo(kakuna);

		pikachu.attackPokemon(kakuna);
		kingler.attackPokemon(abra);
		abra.attackPokemon(rapidash);

		pokedex.listPokemon();

	}

} 
