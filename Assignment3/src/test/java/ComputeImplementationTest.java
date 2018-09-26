import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ComputeImplementationTest {
	
	Calculator interfaceObj;
	ComputeImplementation implementationObj;
	
	float amount = 120;
    int salary = 52000;

	@Before
	public void setUp() throws Exception {
		
		implementationObj = new ComputeImplementation();
		Employee emp = new Employee(0);
	
		interfaceObj = Mockito.mock(Calculator.class);
		Mockito.when(interfaceObj.computeTax(amount)).thenReturn((float) 2.4);
		Mockito.when(interfaceObj.weeklySalary(salary)).thenReturn((float) 1000);
		Mockito.when(interfaceObj.fortnightSalary(salary)).thenReturn((float) 2000);
		Mockito.when(interfaceObj.computeKiwiSaver(salary)).thenReturn((float) 5200);
		
		implementationObj.setObj(interfaceObj);
	}



	@After
	public void tearDown() throws Exception {
		interfaceObj = null;
		implementationObj = null;
	}


	@Test
	public void testComputeTax() {
		
		assertEquals((amount * 0.02), implementationObj.computeTax(amount),0.02);
		
	}

	@Test
	public void testWeeklySalary() {
		assertEquals(52, implementationObj.weeklySalary(1000),5200.00);
	}

	@Test
	public void testFortnightSalary() {
		assertEquals(26, implementationObj.fortnightSalary(2000),5200.00);
	}

	@Test
	public void testComputeKiwiSaver() {
		assertEquals(10, implementationObj.computeKiwiSaver(5200),5200.00);
	}

}
