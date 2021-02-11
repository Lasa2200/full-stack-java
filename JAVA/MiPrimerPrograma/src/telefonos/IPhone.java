package telefonos;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    
    
	@Override
	public void ring() {
		System.out.println("RinTone: " + getRingTone());
		
	}

	@Override
	public void unlock() {
		System.out.println(getVersionNumber());
		
	}

	@Override
	public void displayInfo() {
		System.out.println("Porcentaje de bateria: " + getBatteryPercentage());
		System.out.println("Compañia :"+ getCarrier());
		
	}
   
    
}