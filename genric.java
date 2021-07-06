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
	public static <T> void printMax(T x,T y,T z,T max)
		{
		System.out.printf("Max of %s,%s and %s is %s \n\n",x,y,z,max);
		}     
	public static void main(String args[]) {
		Float xFl = 8.8f,yFl = 6.6f,zFl = 7.7f;
		new MaximumTest<Float>(xFl,yFl,zFl).maximum();
		Float xFl = 6.6f,yFl = 8.8f,zFl = 7.7f;
                new MaximumTest<Float>(xFl,yFl,zFl).maximum();
		Float xFl = 6.6f,yFl = 7.7f,zFl = 8.8f;
                new MaximumTest<Float>(xFl,yFl,zFl).maximum();

	
}
	}
