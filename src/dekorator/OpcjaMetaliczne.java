package dekorator;

public class OpcjaMetaliczne extends OpcjaLakierowania {
	public OpcjaMetaliczne(LakierowanieSamochodu lakierowanie) {
		super(lakierowanie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getOpis() {

		return super.getOpis() + ", Metaliczne";
	}

	@Override
	public double getCena() {

		return super.getCena() + 300;
	}
}