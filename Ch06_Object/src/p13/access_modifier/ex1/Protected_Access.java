package p13.access_modifier.ex1;
//protected접근제한자 : 
public class Protected_Access {
	public static void main(String[] args) {
		ProtectedData pd = new ProtectedData();
		System.out.println(pd.protectedVar);
	}
}
