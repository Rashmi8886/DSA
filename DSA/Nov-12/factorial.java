public class factRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fact(5));

	}
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		return n*fact(n-1);

}
}