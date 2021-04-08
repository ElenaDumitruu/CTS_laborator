package ro.ase.csie.cts.g1088.dp.facade;

public class FacadeAPIJoc {
	//interfata soimplificata pt a  obt profil unui jucator
	public static String getProfil(String username, String pass) {
		ConexiuneServerJoc conexiune = new ConexiuneServerJoc();
		conexiune.conectare();
		
		//2.login  player
		Player player = new Player();
		player.login(conexiune);
		
		//3.obt profil
		ProfilPlayer = player.getProfil();
		
		//4. obt date
		String dateProfil = profil.getprofil();
		
		return dateProfil;
	}
}
