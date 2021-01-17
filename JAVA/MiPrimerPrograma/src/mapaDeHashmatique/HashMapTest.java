package mapaDeHashmatique;
import java.util.*;
import java.util.Set;


public class HashMapTest {
    public static void main(String[] args) {
    	HashMap<String,String> trackList = new HashMap<String, String>();
        trackList.put("Desconfío,Pappo's Blues", "No sé por qué, Imaginé... Que estabamos unidos... Y me sentí mejor...Pero aquí estoy Tan solo en la vida,Que mejor me voy");
        trackList.put("Blues del Esclavo,Mecano", "El ser negrito es un color, lo de ser esclavo no lo trago.Me tiene frito tanto trabajar de sola sol, las tierras del maldito señorito");
        trackList.put("Perdón, Los Cafers", "Perdón, no es algo magico ni tragico,Perdón es algo práctico,didáctico, Perdón, para tu hijo tu familia hay un perdón");
        trackList.put("Todo Cambia, Mercedes Sosa", "Cambia lo superficial, Cambia también lo profundo Cambia el modo de pensar Cambia todo en este mundo");
        trackList.put("Antiguos dueños de las flechas,Tomolec","Indio Toba no llorando aquel tiempo feliz Pilcomayos y Bermejos llorando por mi Campamento de mi raza es la America es ");
        String name= (String) trackList.get("nninjacodigo.com");
        System.out.println("El Nobre completo es:"+ name);
        
        
        
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));  // con este codigo accedo al valor nancy ninja  imprimo solo una cosa
        }
    }
}
