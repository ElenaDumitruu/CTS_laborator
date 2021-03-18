package ro.ase.csie.cts.g1088.lab3.faza3.servicii;

public class StrategieMk2021 implements InterfataMarketing {
	@Override
	public float getDiscountFidelitate(int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? 
				DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100;
	}
}
