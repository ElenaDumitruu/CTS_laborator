package cts.Dumitru.Elena.AS.pattern.singleton;

public class RobotSoftware implements IRobotSoftware {
	private static RobotSoftware instance = null;

	private int idRobot;

	private RobotSoftware() {
		this.idRobot = 0;
	}

	public static RobotSoftware getInstance() {
		if (instance == null)
			instance = new RobotSoftware();

		return instance;
	}

	public void trimiteCerere(String denumire) {

	};

	public String getInformatii(String categorie) {
		return "informatii";
	};

	public void prelucrareCerere(String tip) {

	};

	public int getIdRobot() {
		return this.idRobot;
	};
}
