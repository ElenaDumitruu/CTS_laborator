package ro.ase.csie.cts.g1088.tema1.servicii;

import ro.ase.csie.cts.g1088.tema1.exceptii.ExceptieValoareInvalida;

public class ServiciiValidare implements InterfataValidare{

	@Override
	public void validareValoare(double valoare) throws ExceptieValoareInvalida {
		if(valoare<0) {
			throw new ExceptieValoareInvalida();
		}
		
	}
	
}
