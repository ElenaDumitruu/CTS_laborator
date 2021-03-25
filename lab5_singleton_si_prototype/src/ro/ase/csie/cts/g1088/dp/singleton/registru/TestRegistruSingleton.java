package ro.ase.csie.cts.g1088.dp.singleton.registru;

public class TestRegistruSingleton {

	public static void main(String[] args) {
		ConexiuneBD conexiune1 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
		ConexiuneBD conexiune2 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
		ConexiuneBD conexiune3 = ConexiuneBD.getConexiune("103.0.0.2", "test");
	
		if(conexiune1==conexiune2) {
			System.out.println("2 ref identice");
		}
		else {
			System.out.println("ref sunt diferite");
		}
		if(conexiune1==conexiune3) {
			System.out.println("2 ref identice");
		}
		else {
			System.out.println("ref sunt diferite");
		}
	}

}
