

public class ArgRunner{
	public static void main(String[] arg){
		double num1 = Double.valueOf(arg[0]);
		char op = arg[1].charAt(0);
		double num2 = Double.valueOf(arg[2]);
		Calculator.result(num1, op, num2);
	}
}