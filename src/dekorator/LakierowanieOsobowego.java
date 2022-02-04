package dekorator;

public class LakierowanieOsobowego implements LakierowanieSamochodu{

	@Override
	public String getOpis() {

		return "Lakierowanie samochodu osobowego";
	}

	@Override
	public double getCena() {
		// TODO Auto-generated method stub
		return 5000;
	}



}
