package ro.ase.csie.cts.g1088.lab3.faza2;

public enum TipProdus {
	NOU(0),DISCOUNT(0.1f),STOC_LIMITAT(0.25f),VECHI(0.35f);
	
	private final float discount;
	
	//def constructor
	private TipProdus(float discount) {
		this.discount = discount;
	}
	
	//constructor default
	//private TipProdus() {
		//this.discount = 0;
	//}
	//nu folosesc constructor default pt ca imi face toata lista de enum discaount 0
	
	public float getDiscount() {
		return this.discount;
	}
}
