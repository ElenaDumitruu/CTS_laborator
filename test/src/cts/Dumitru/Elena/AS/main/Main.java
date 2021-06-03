package cts.Dumitru.Elena.AS.main;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

import cts.Dumitru.Elena.AS.pattern.singleton.RobotSoftware;
import cts.Dumitru.Elena.AS.pattern.state.CerereStudent;

public class Main {

	public static void main(String[] args)  throws Exception{
		RobotSoftware robotSoftware1 = RobotSoftware.getInstance();
		RobotSoftware robotSoftware2 = RobotSoftware.getInstance();
		RobotSoftware robotSoftware3 = RobotSoftware.getInstance();

		// Test "incercarea de a construi mai multe instante de tip robot software nu va
		// conduce la existenta mai multor obiecte."
		System.out.println("id robot: " + robotSoftware1.getIdRobot());
		System.out.println("id robot: " + robotSoftware2.getIdRobot());
		System.out.println("id robot: " + robotSoftware3.getIdRobot());
		
SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        
        System.out.println("cerere completata");
        CerereStudent cerere1 = new CerereStudent("cerinta 1", formatter.parse("10-May-2021"));
        System.out.println("stare cerere: " + cerere1.getStare());
        cerere1.confirmare();
        System.out.println("stare cerere: " + cerere1.getStare());
        cerere1.avizareDecanat();
        System.out.println("stare cerere: " + cerere1.getStare());
        cerere1.verificare();
        System.out.println("stare cerere: " + cerere1.getStare());
        
        System.out.println("cererinta goala");
        CerereStudent cerere2 = new CerereStudent("", formatter.parse("09-May-2021"));
        System.out.println("stare cerere: " + cerere2.getStare());
        
        System.out.println("cererinta cu termen expirat");
        CerereStudent cerere3 = new CerereStudent("cerinta 3", formatter.parse("01-May-2021"));
        System.out.println("stare cerere: " + cerere3.getStare());

	}

}
