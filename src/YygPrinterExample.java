
public class YygPrinterExample {

	public static void main(String[] args) {
		YygPrinterExample printer = new YygPrinterExample();
		
		printer.printIn(10);
		printer.println(true);
		printer.printIn(5.7);
		printer.printIn("홍길동");
		
	}
	
	private boolean println(boolean b) {
		
		return b;
		
	}

	public int printIn(int a) {
		a = 0;
		return a;
	}
	
	
	
	public double printIn(double a) {
		a=3.14;
		return a;
	}
	
	public String printIn(String a) {
		a="aaa";
		return a;
	}
}
