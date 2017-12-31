package com.demo.dao;
import java.sql.*;
public class LoginDao {
	String sql ="select * from login where uname=? and pass=?";
	String url="jdbc:mysql://localhost:3306/college";
	String username = "root";
	String password = "Atif123#1";
	public boolean check(String usname,String passw)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username,password);
			PreparedStatement st =con.prepareStatement(sql);
			st.setString(1, usname);
			st.setString(2, passw);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}catch(Exception e){ e.printStackTrace();}
		return false;
	}
}
