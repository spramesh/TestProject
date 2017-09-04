
public class TEstk {
public static void main(String[] args) {
	System.out.println(String.class.getClassLoader());// return null
	System.out.println(TEstk.class.getClassLoader()); // return Lancher$ApplicationLoader@566
}
}
