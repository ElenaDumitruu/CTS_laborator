package ro.ase.csie.cts.g1088.lab3.faza3.servicii;

import ro.ase.csie.cts.g1088.lab3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.lab3.exceptii.ExceptieVechimeClient;

public class ServiciuValidare implements InterfataValidare{

	public void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
		}
	}

	public void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient {
		if(vechimeClientInAni < 0) {
			throw new ExceptieVechimeClient();
		}
	}

}