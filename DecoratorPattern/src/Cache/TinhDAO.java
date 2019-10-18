package Cache;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TinhDAO {
	public ArrayList<Tinh> getAll() {
		ArrayList<Tinh> listTinh = new ArrayList<>();
		Cache cache = Cache.getInstance();
		listTinh = cache.getAll();
		if (cache.getAll().isEmpty()) {
			try {
				
				DBUtils dbutil = DBUtils.getInstance();
				Connection connect = dbutil.getConnection();
				String sql = "select * from Tinh";
				PreparedStatement cmd = connect.prepareStatement(sql);
				ResultSet rs = cmd.executeQuery();
				while (rs.next()) {
					String matinh = rs.getString(1);
					String tentinh = rs.getString(2);
					Tinh tinh = new Tinh(matinh, tentinh);
					listTinh.add(tinh);
					//System.out.println("Ma tinh: " + matinh + ", ten tinh: " + tentinh);
					cache.put(matinh, tinh);
				}
				rs.close();
				System.out.println("Thong tin lay tu csdl");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Thong tin lay tu cache");
		}

		return listTinh;
	}
	
	public ArrayList<Huyen> getHuyenOf(String maTinh){
        ArrayList<Huyen> listHuyen = new ArrayList<>();
        CacheHuyen cacheHuyen = CacheHuyen.getInstance();
        if(cacheHuyen.currentSizeCache()==0) {
        	
        	try {
    			
    			DBUtils dbutil = DBUtils.getInstance();
    			Connection connect = dbutil.getConnection();
    			String sql = "select * from Huyen where MaTinh='" + maTinh + "'";
    			PreparedStatement cmd = connect.prepareStatement(sql);
    			ResultSet rs = cmd.executeQuery();
    			while (rs.next()) {
    				String mahuyen = rs.getString(1);
    				String tenhuyen = rs.getString(2);
    				String matinh = rs.getString(3);
    				Huyen huyen = new Huyen(mahuyen, tenhuyen, matinh);
    				listHuyen.add(huyen);
    				//System.out.println("Ma tinh: " + matinh + ", ten tinh: " + tentinh);   				
    			}
    			cacheHuyen.add(maTinh, listHuyen);
    			rs.close();
    			System.out.println("Thong tin lay tu csdl");
    		} catch (SQLException e) {
    			e.printStackTrace();
    		}
        	
        	
        } else {
        	if(cacheHuyen.get(maTinh)==null) {
        		try {
        			
        			DBUtils dbutil = DBUtils.getInstance();
        			Connection connect = dbutil.getConnection();
        			String sql = "select * from Huyen where MaTinh='" + maTinh + "'";
        			PreparedStatement cmd = connect.prepareStatement(sql);
        			ResultSet rs = cmd.executeQuery();
        			while (rs.next()) {
        				String mahuyen = rs.getString(1);
        				String tenhuyen = rs.getString(2);
        				String matinh = rs.getString(3);
        				Huyen huyen = new Huyen(mahuyen, tenhuyen, matinh);
        				listHuyen.add(huyen);
        				//System.out.println("Ma tinh: " + matinh + ", ten tinh: " + tentinh);   				
        			}
        			cacheHuyen.add(maTinh, listHuyen);
        			rs.close();
        			System.out.println("\nThong tin lay tu csdl");
        		} catch (SQLException e) {
        			e.printStackTrace();
        		}
        	} else {
        		listHuyen = cacheHuyen.get(maTinh);
            	System.out.println("\nThong tin lay tu cache");
        	}
        	
        }
        
        
        
        return listHuyen;
    }
}
