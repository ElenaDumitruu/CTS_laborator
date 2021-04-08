package ro.ase.csie.cts.g1088.dp.facade;

public class TestFacade {
	ConexiuneServerJoc conexiune = new ConexiuneServerJoc();
	conexiune.conectare();
	
	//2.login  player
	Player player = new Player();
	player.login(conexiune);
	
	//3.obt profil
	ProfilPlayer = player.getProfil();
	
	//4. obt date
	String dateProfil = profil.getprofil();
	
	
}
