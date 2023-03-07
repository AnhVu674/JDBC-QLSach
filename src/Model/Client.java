package Model;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
//		Sach s1 = new Sach("205", "Java", "2002", 100000);
//		Sach s2 = new Sach("112", "C", "2022", 20000);
//		Dao_Sach.getInstence().insert(s1);
//		for (int i = 0; i <= 100; i++) {
//			Sach s = new Sach("id" + i, "ten" + i, "nam" + i, i);
//			Dao_Sach.getInstence().insert(s);
//		}
//		Dao_Sach.getInstence().update(s2);
//		Dao_Sach.getInstence().delete(s2);
		ArrayList<Sach> list = Dao_Sach.getInstence().selectAll();
		for (Sach sach : list) {
			System.out.println(sach.toString());
		}
		Sach find = new Sach();
		find.setId("Java");
		Sach sach = Dao_Sach.getInstence().selectByID(find);
		System.out.println(sach);
		ArrayList<Sach> listSach = Dao_Sach.getInstence().selectByCondition("gia<100000");
		for (Sach sach2 : listSach) {
			System.out.println(sach2.toString());
		}
	}
}
