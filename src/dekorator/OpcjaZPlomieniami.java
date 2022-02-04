package dekorator;

public class OpcjaZPlomieniami extends OpcjaLakierowania {
	public OpcjaZPlomieniami(LakierowanieSamochodu lakierowanie) {
		super(lakierowanie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getOpis() {
	
		return super.getOpis() + ", ozdobione plomieniami";
	}
	
	@Override
	public double getCena() {

		return super.getCena() + 1000;
	}
}