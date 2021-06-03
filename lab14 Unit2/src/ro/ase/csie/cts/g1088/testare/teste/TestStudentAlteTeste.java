package ro.ase.csie.cts.g1088.testare.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.sun.tools.javac.code.Attribute.Array;

import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1088.testare.module.Student;

public class TestStudentAlteTeste {
//test fixture
	static Student student;
	static ArrayList<Integer> noteInitiale=new ArrayList<>();
	static String numeInitial;
	static int varstaInitiala;
	static int nrNoteInitiale;
	public static void setUpBeforeClass() throws Exception{
		numeInitial="gigel";
		varstaInitiala=Student.MIN_VARSTA+1;
		nrNoteInitiale=3;
		for(int i=0; i<nrNoteInitiale; i++) {
		noteInitiale.add(Student.MAX_NOTA-i);
		}
	}
	public static void tearDownAfterClass() throws Exception{
		
	}
	public void setUp() throws Exception{
		student = new Student(numeInitial, varstaInitiala, noteInitiale);
	}
	public void tearDown() throws Exception{
		student=null;
	}
	@Test(expected =ExceptieVarsta.class)
	public void testSetVarstaRangeMinValue() throws ExceptieVarsta {
		int varstaNoua=Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}
	@Test(expected=ExceptieVarsta.class)
	public void testSetVarstaRangeValoarePozzitivaMare()throws ExceptieVarsta{
		
	}
	@Test
	public void testSetValoareVrastaBoundaryLimitaInferioara() throws ExceptieVarsta{
		int varstaNoua=Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("tets pt varsta min, varstaNoua, varstaStudent");
	}
	private void assertEquals(String string) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testSetValoareVrastaBoundaryLimitaInferioaraMax() throws ExceptieVarsta{
		int varstaNoua=Student.MAX_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("tets pt varsta max, varstaNoua, varstaStudent");
	}
	@Test
	public void testSetNoteReferenceShallowCopy() {
		int[] noteStudent = new int[] {9,9, 10};
		List<Integer>refNote=new ArrayList<>( Array.asList(9,9,10));
		student.setNote(refNote);
		refNote.set(0, 5);
		int noteExiste[]= new int[student.getNrNote()];
		int[] noteExistente;
		for(int i = 0; i<student.getNrNote();i++) {
			noteExistente[i]=student.getNota(i);
		}
		assertArrayEquals("test shalloe", noteStudent, noteExistente);
	}
	
	@Test
	public void testGetMediePerformance() {
		ArrayList<Integer>note = new ArrayList<>();
		int nrNote=(int) 1e6;
		Random random= new Random();
		for(int i=0; i<nrNote; i++) {
			note.add(random.nextInt(Student.MAX_NOTA)+1);
		
		}	student.setNote(note);
		long tStart = System.currentTimeMillis();
		student.getMedie();
		long tFinal=System.currentTimeMillis();
		
		long durata=tFinal-tStart;
		if(durata<=10) {
			assertTrue(true);
		}else {
			fail("calc dureaza mai mult");
		}
	}
}
