
public class Calculator{
	
	
	public static void result(double num1,char op,double num2){
		switch(op){
			case '+':
				System.out.println(plusOp(num1,num2));
				break;
			case '-':
				System.out.println(minusOp(num1,num2));
				break;
			case 'x':
				System.out.println(multiOp(num1,num2));
				break;
			case '/':
				System.out.println(devOp(num1,num2));
				break;
			case '%':
				System.out.println(ostDevOp(num1,num2));
				break;
			default:
				System.out.println("Enter correct math operator!");
		}
	}

	private static double plusOp(double num1, double num2){
		return num1 + num2;
	}
	
	private static double minusOp(double num1, double num2){
		return num1 - num2;
	}
	
	private static double multiOp(double num1, double num2){
		return num1 * num2;
	}
	
	private static double devOp(double num1, double num2){
			if(num2 > 0)
				return num1 / num2;
			else
				System.out.println("Keep Calm and NOT division to ZERO!");
			return 0;
	}
	
	private static double ostDevOp(double num1, double num2){
		if(num2 > 0)
				return num1 % num2;
			else
				System.out.println("Keep Calm and NOT division to ZERO!");
			return 0;
	}
}