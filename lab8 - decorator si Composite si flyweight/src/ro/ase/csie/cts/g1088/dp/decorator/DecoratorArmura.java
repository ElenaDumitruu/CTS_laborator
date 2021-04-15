package ro.ase.csie.cts.g1088.dp.decorator;

public class DecoratorArmura extends DecoratorErouAbstract{
//ce vrem sa modificam in cazul nostru armura
	int nivelArmura;
	
	public DecoratorArmura(SuperErou erou, int nivelArmura) {
		super(erou);
		this.nivelArmura = nivelArmura;
	}

	@Override
	public void esteLovit(int puncte) {
		int punctePierdute = puncte - nivelArmura;
		if(punctePierdute > 0) {
			this.erou.esteLovit(punctePierdute);
		}
	}
	
	
	

}
