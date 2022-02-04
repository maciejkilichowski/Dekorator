package dekorator;

public class OpcjaZChromowaniem extends OpcjaLakierowania {

	public OpcjaZChromowaniem(LakierowanieSamochodu lakierowanie) {
		super(lakierowanie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getOpis() {

		return super.getOpis() + ", Chromowanie";
	}

	@Override
	public double getCena() {
		
		return super.getCena() + 500;
	}

}
