package cts.Dumitru.Elena.AS.pattern.state;


import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CerereStudent implements ICerereStudent{
	 private String stare;
	    
	 public CerereStudent(String denumire, Date termenLimita) {
	        if(denumire.isEmpty()) {
	            this.respingere();
	            return;
	        }
	        
	        Date today = new Date();
	        
	        this.stare = "Cerere trimisa pe flux";
	        long diferenta = today.getTime() - termenLimita.getTime();
	        long diferentaInZile = TimeUnit.DAYS.convert(diferenta, TimeUnit.MILLISECONDS);
	        
	        if(diferentaInZile >= 10) {
	            this.respingere();
	        }
	    }
	    
	    public void confirmare() {
	        this.stare = "Cerere primita";
	    }

	    public void verificare() {
	        this.stare = "Aprobata";
	    }

	    public void avizareDecanat() {
	        this.stare = "Avizare";
	    }

	    public void respingere() {
	        this.stare = "Respinsa";
	    }

	    public String getStare() {
	    	return this.stare;
	    }
}
