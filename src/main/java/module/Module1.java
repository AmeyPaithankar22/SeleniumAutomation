package module;

public class Module1 {

	int testAdd(int a, int b) {
		return a+b;
	}
	
	int testSub(int a, int b) {
		return a-b;
	}
	
	int testDiv(int a, int b) {
		if(b!=0)
			return a/b;
		else
			return 0;
	}
	
	int testMultiple(int a, int b) {
		return a*b;
	}
}
