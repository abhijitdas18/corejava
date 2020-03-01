package algorithm;

// Classic implementation , lazy instantiation
//SingleTon Constructor.
//Obj1 : algorithm.MySingleTon01@15db9742
//Obj2 : algorithm.MySingleTon01@15db9742
public class SingletonDemoO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySingleTon01 obj1 = MySingleTon01.getInstance();
		System.out.println("Obj1 : " + obj1);

		MySingleTon01 obj2 = MySingleTon01.getInstance();
		System.out.println("Obj2 : " + obj2);

	}

}

class MySingleTon01 {
	public static MySingleTon01 singleTon01 = null;

	private MySingleTon01() {
		System.out.println("SingleTon Constructor.");
	}

	public static MySingleTon01 getInstance() {
		if (singleTon01 == null) {
			singleTon01 = new MySingleTon01();
		}

		return singleTon01;
	}
}
