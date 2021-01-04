package ImportDemo;

//Importar la clase Date
import java.util.Date;
public class ImportDemo {
  public String getCurrentDate() {
      Date date = new Date();
      return "La fecha actual es: " + date;
  }
}
