package cts.Dumitru.Elena.AS.pattern.singleton;

public interface IRobotSoftware {
	public void trimiteCerere(String denumire);

	public String getInformatii(String categorie);

	public void prelucrareCerere(String tip);

	public int getIdRobot();
}
