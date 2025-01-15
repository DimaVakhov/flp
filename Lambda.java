interface MyValue{
	double getValue();
}

interface MyParamValue{
	double getPValue(int n);
}

interface NumericTest{
	boolean test(int n, int m);
}

class Lambda {
	public static void main(String[] args){
		MyValue myVal;
		myVal = () -> 100.2;
		System.out.println("Значение1: " + myVal.getValue());
		myVal = () -> Math.random() * 10.2;
		System.out.println("Значение2: " + myVal.getValue());
		
		MyParamValue myPVal;
		myPVal = (n) -> 1.6/n;
		System.out.println("Значение1 для интерфейса с параметром: " + myPVal.getPValue(10));
		myPVal = (n) -> n*n;
		System.out.println("Значение2 для интерфейса с параметром: " + myPVal.getPValue(5));
		
		NumericTest isFactor = (n, d) -> (n % d) == 0;
		int q, w;
		q = 10;
		w = 2;
		if(isFactor.test(q, w))
			System.out.println(w + " является делителем " + q);
		else
			System.out.println(w + " не является делителем " + q);
	
		NumericTest lessThen = (n, m) -> (n < m);
		int n1 = 2;
		int m1 = 10;
		if(lessThen.test(n1, m1))
			System.out.println(n1 + " меньше " + m1);
		if(!lessThen.test(m1, n1))
			System.out.println(m1 + " не меньше " + n1);

		NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
		int x1, x2;
		x1 = 10;
		x2 = -5;
		if(absEqual.test(x1, x2))
			System.out.println("Абсолютные значения " + x1 + " и " + x2 + " равны");
		else
			System.out.println("Абсолютные значения " + x1 + " и " + x2 + " не равны");
	}
}
