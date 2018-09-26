
public class ComputeImplementation implements Calculator{
	
	//create an object of the interface
	Calculator obj;

	public float computeTax(float amount) {
		
		return obj.computeTax(amount);
	}

	public float weeklySalary(int i) {
		
		return obj.weeklySalary(i);
	}

	public float fortnightSalary(int j) {
		
		return obj.fortnightSalary(j);
	}

	public float computeKiwiSaver(int k) {
		
		return obj.computeKiwiSaver(k);
	}

	public void setObj(Calculator obj) {
		this.obj = obj;
	}

	

}
