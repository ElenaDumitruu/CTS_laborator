package ro.ase.csie.cts.g1088.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		UnitateAbstractaJoc grup1=new GrupCaractere();
		UnitateAbstractaJoc grup2=new GrupCaractere();
		grup1.adaugaCaracer(new CaracterNPC("Soldat", 100));
		grup1.adaugaCaracer(new CaracterNPC("Soldat", 100));
		
		grup2.adaugaCaracer(new CaracterNPC("Soldat", 100));
		grup2.adaugaCaracer(new CaracterNPC("Tanc", 300));
		
		UnitateAbstractaJoc grupNivel = new GrupCaractere();
		grupNivel.adaugaCaracer(new CaracterNPC("level BOSS", 500));
		grupNivel.adaugaCaracer(grup1);
		grupNivel.adaugaCaracer(grup2);
		
		grupNivel.atacaJucator(200);
		grupNivel.seRetrage();
		
	}

}
