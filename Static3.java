class Static3{
	final int a=5;
	public static void main(String args[]){
		//a=6;	// Error because final variable can't be changed
		int a=6;// Different variable as compared to final int a
		System.out.println(a);
	}
}