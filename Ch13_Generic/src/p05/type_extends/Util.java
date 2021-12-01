package p05.type_extends;

public class Util {
	//T: Number,Byte,Double,Integer,Long,Float, Short
	public static<T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
	
		return Double.compare(v1, v2);//-1,0,1
		
	}
}
