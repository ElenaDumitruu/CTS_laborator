package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {
	String ip;
	String denumire;
	
	//vers eager
	//private static ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1","cts");
	
	private static ConexiuneBD conexiune = null;
	
	private ConexiuneBD() {
		
		
	}

	private ConexiuneBD(String ip, String denumire) {
		System.out.println("Apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	//implementare standard pt singleton
	//versiune lazy
	
	public static synchronized ConexiuneBD getConexiune() {
		if(conexiune == null) {
			//date se pot prelua din fis de configurare
			conexiune = new ConexiuneBD("10.0.0.1", "cts");
		}
		return conexiune;
	}
}
