package ro.ase.csie.cts.g1088.laborator.exceptii;

public class ExceptieFonduriInsuficiente extends Exception {

	public ExceptieFonduriInsuficiente(String mesaj) {
		super(mesaj);//modul in care apelam constructorii in clasa de baza
		//constructor care imi permite sa citesc un mesaj
		
	}
	
	public ExceptieFonduriInsuficiente(){
		//constructor default
	}
}
