
public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> stList = new ArrayList<String>();
		ArrayList<Square> sqList = new ArrayList<Square>();
		ArrayList<PointThreeD> pList = new ArrayList<PointThreeD>();

		
		stList.addItem("Hello");
		stList.addItem("My");
		stList.addItem("Name");
		stList.addItem("Is");
		stList.addItem("Brian");
		
		System.out.println(stList.toString());
		
		Square sq1 = new Square();
		Square sq2 = new Square(5);
		Square sq3 = new Square(3.3);
		sqList.addItem(sq1);
		sqList.addItem(sq2);
		sqList.addItem(sq3);
		
		
		System.out.println(sqList.toString());
		
		PointThreeD p1 = new PointThreeD();
		PointThreeD p2 = new PointThreeD(0,3,7);
		PointThreeD p3 = new PointThreeD(5,-12,78.8);
		pList.addItem(p1);
		pList.addItem(p2);
		pList.addItem(p3);
		
		System.out.println(pList.toString());
	}

}
