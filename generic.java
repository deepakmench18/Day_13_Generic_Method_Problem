public class MaximumTest<T extends Comparable<T>> {
	T x,y,z;
	public MaximumTest(T x,T y,T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public T maximum()
	{
		return MaximumTest.maximum(x,y,z);
		
	}
	public static <T extends Comparable<T>> T maximum(T x,T y,T z)
	{
		T max = x;
		if(y.compareTo(max) > 0)
		{
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x,y,z,max);
		return max;
	}
	public static String testMaximum(String x,String y,String z) 
	{
		String max = x;
		if(y.compareTo(max) > 0)
		{
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x,y,z,max);
		return max;
	}
	public static <T> void printMax(T x,T y,T z,T max)
	{
		System.out.printf("Max of %s,%s and %s is %s \n\n",x,y,z,max);
	}
	public static void main(String args[]) {
		String xStr = "pear",yStr ="apple",zStr = "orange";
                new MaximumTest<String>(xStr,yStr,zStr).maximum();
                String xStr = "apple",yStr ="pear",zStr = "orange";
                new MaximumTest<String>(xStr,yStr,zStr).maximum();
		String xStr = "orange",yStr ="apple",zStr = "pear";
                new MaximumTest<String>(xStr,yStr,zStr).maximum();


	}
}
