interface  NumericFunc{
	int func(int n);
}

class Block{
	public static void main(String[] args) {
		NumericFunc smallestF = (n) -> {
			int result = 1;

			n = n < 0 ? -n : n;
			for(int i=2; i<=n/i; i++)
				if((n%i)==0){
					result = i;
					break;
				}
			return result;
		};
		int q = 15;
		System.out.println("Наименьший делитель " + q + " = " + smallestF.func(q));
	}
}
