package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class ContBancar extends Cont {

	protected double balanta;
	protected String iban;
	//constrcutior care cere acesti param
	public ContBancar(double balanta, String iban) {
		
		this.balanta = balanta;
		this.iban = iban;
	}
	//supradefinire met getbalanta
	//nu trb sa modific in header ul metodei
	
	@Override
	public double getBalanta() {
		return this.balanta;
	}
	
	
	
	
}
