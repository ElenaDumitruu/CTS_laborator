package ro.ase.csie.cts.g1088.tema1;

import ro.ase.csie.cts.g1088.tema1.exceptii.ExceptieValoareInvalida;

public class Imprumut {
	double valoare_imprumut;
	double rata;
	int zileActiv;
	int tip_cont;
	
	public double AfisareValoareImprumut() {
		System.out.println("Valoarea imprumutului este " + this.valoare_imprumut);
		return valoare_imprumut;
	}

	public double AfisareRata() {
		System.out.println("Rata este " + rata);
		return this.rata;
	}

	public double getRataLunara() {
		return valoare_imprumut * rata;
	}

	public void setValoareImprumut(double valoare) throws ExceptieValoareInvalida {
		if (valoare < 0) {
			throw new ExceptieValoareInvalida();
		} else {
			valoare_imprumut  = valoare;
		}
	}

	public String toString() {
		return "Loan: " + valoare_imprumut + "; rate: " + rata +
				"; days active:" + zileActiv + "; Type: " + tip_cont + ";";
	}

	public static double CalculeazaComisionTotal(Imprumut[] conturi) {
		double comisionTotal = 0.0;
		Imprumut cont;

		for (int i = 0; i < conturi.length; i++) {
			cont = conturi[i];
			if (cont.tip_cont == Account.PREMIUM || cont.tip_cont == Account.SUPER_PREMIUM) {
				comisionTotal += 0.0125 * (cont.valoare_imprumut * Math.pow(cont.rata, (cont.zileActiv / 365)) - cont.valoare_imprumut);
			}
		}

		return comisionTotal;
	}

	public Imprumut(double valoare, double rata, int tip_cont) throws ExceptieValoareInvalida {
		if (valoare < 0) {
			throw new ExceptieValoareInvalida();
		} else {
			valoare_imprumut = valoare;
		}
		this.rata = rata;
		this.tip_cont = tip_cont;
	}

}
