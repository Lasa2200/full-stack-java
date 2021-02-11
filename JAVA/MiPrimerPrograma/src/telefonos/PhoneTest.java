package telefonos;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("Galaxy S9", 99, "Verizon", "Ring Ring Ring!");
		IPhone iphoneTen = new IPhone("IPhone X", 100, "ATT&T", "Zing");
		
		
		
		s9.unlock();
		s9.ring();
		s9.displayInfo();
		
		
		iphoneTen.unlock();
		iphoneTen.ring();
		iphoneTen.displayInfo();
	}

}