import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class TestSingleton {

	private static void hienthi() {
		try {		
			DBUtils dbutil = DBUtils.getInstance();
			Connection connect = dbutil.getConnection();
			String sql = "select * from TrangTriCafe";
			PreparedStatement cmd = connect.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
				String ten = rs.getString(1);
				int gia = rs.getInt(2);
				System.out.println("Ten trang tri: " + ten + ", gia: " + gia);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		hienthi();
	}
}
