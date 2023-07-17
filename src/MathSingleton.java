
public class MathSingleton {
	private static MathSingleton mathinstance;
	private int variablei1;
	private int variablei2;
	private MathSingleton(){};
	
	public static MathSingleton getInstance() {
		if(mathinstance == null) {
			mathinstance = new MathSingleton();
		}
		return mathinstance;
	}
	
	public int getvariablei2() {
		return variablei2;
	}
	
	public void setvariablei2(int variablei2) {
		this.variablei2 = variablei2;
	}
	
	public int getvariablei1() {
		return variablei1;
	}
	
	public void setvariablei1(int variablei1) {
		this.variablei1 = variablei1;
	}
	
	public int add() {
		return this.variablei1 + this.variablei2;
	}

	public int subtract() {
		return this.variablei1 - this.variablei2;
	}

	public int multiply() {
		return this.variablei1 * this.variablei2;
	}

	public int divide() {
		return this.variablei1 / this.variablei2;
	}
}