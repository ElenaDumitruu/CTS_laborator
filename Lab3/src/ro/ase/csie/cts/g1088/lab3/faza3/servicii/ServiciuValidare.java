package ro.ase.csie.cts.g1088.lab3.faza3.servicii;

import ro.ase.csie.cts.g1088.lab3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.lab3.exceptii.ExceptieVechimeClient;

public class ServiciuValidare {
	@Override
	public static void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
		}
	}
	@Override
	public static void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient {
		if(vechimeClientiInAni < 0) {
			throw new ExceptieVechimeClient();
		}
	}
}
