package pokemon;


	import java.util.ArrayList;

	public class Pokedex extends AbstractPokemon {
		private static ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();



		public void listPokemon() {
			System.out.println("Aquí están todos los Pokémon!");
			for(int i=0; i<myPokemons.size(); i++) {
				System.out.println("Name: "+myPokemons.get(i).getName()+ "| Type: "+myPokemons.get(i).getType()+ "| Health: "+myPokemons.get(i).getHealth());
			}

		}

		@Override
		public Pokemon createPokemon(String name, int health, String type) {
			// TODO Auto-generated method stub
			Pokemon pokemon = super.createPokemon(name, health, type);
			myPokemons.add(pokemon);
			//return super.createPokemon(name, health, type);
			return pokemon;
		}

		@Override
		public void pokemonInfo(Pokemon pokemon) {
			// TODO Auto-generated method stub
			super.pokemonInfo(pokemon);

		}


	}

