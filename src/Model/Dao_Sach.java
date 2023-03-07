package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Databate.JBDCUtil;

public class Dao_Sach implements Dao_Interface<Sach> {

	public static Dao_Sach getInstence() {
		return new Dao_Sach();
	}

	@Override
	public int insert(Sach t) {
		Connection c;
		try {
			Connection con = JBDCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO Sach(id,ten,namXuatBan,gia)" + " VALUES ('" + t.getId() + "','" + t.getTen()
					+ "','" + t.getNamXuatBan() + "'," + t.getGia() + "";
			int check = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi:" + sql);
			System.out.println("Co " + check + "dong bi thay doi!!");
			JBDCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Sach t) {
		int check = 0;
		try {
			Connection con = JBDCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = " UPDATE Sach " + " SET " + " ten:'" + t.getTen() + "', id:'" + "' , namXB:'"
					+ t.getNamXuatBan() + "' , gia:" + t.getGia() + "WHERE ID:'" + t.getId() + ",'";
			check = st.executeUpdate(sql);
			System.out.println("Cau lenh sql: " + sql);
			System.out.println("So dong thay doi" + check);
			JBDCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public int delete(Sach t) {
		int check = 0;
		try {
			Connection con = JBDCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = " DELETE FROM Sach " + " WHERE ID:'" + t.getId() + "'";
			check = st.executeUpdate(sql);
			System.out.println("Cau lenh:" + sql);
			System.out.println("so dong thay doi:" + check);
			JBDCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return check;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		ArrayList<Sach> check = new ArrayList<Sach>();
		try {
			Connection con = JBDCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM Sach";
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Thuc thi: "+sql);
			while (rs.next()) {
				String ten = rs.getString("ten");
				String id = rs.getString("id");
				String namXuatBan = rs.getString("namXuatBan");
				Float gia = rs.getFloat("gia");
				Sach s = new Sach(id, ten, namXuatBan, gia);
				check.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}

	@Override
	public Sach selectByID(Sach t) {
		Sach check = null;
		try {
			Connection con = JBDCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM Sach where id='"+t.getId()+"'";
			ResultSet rs = st.executeQuery(sql);
			String id = rs.getString("id");
			String ten = rs.getString("ten");
			String namXuatBan = rs.getString("namXuatBan");
			Float gia = rs.getFloat("gia");
			System.out.println("Cau lenh:"+sql);
			check = new Sach(id, ten, namXuatBan, gia);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		ArrayList<Sach> check = new ArrayList<Sach>();
		try {
			Connection con = JBDCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT FROM Sach where"+condition;
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("id");
				String ten = rs.getString("ten");
				String namXuatBan = rs.getString("namXuatBan");
				Float gia = rs.getFloat("gia");
				Sach s = new Sach(id, ten, namXuatBan, gia);
				check.add(s);
			}
			System.out.println("Cau lenh :"+sql);
			System.out.println(rs);
			JBDCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}

}
