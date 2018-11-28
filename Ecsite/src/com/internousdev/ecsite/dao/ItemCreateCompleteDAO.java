package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemCreateCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();

	private String sql="INSERT INTO item_info_transaction(item_name,item_price,item_stock,insert_date) VALUES(?,?,?,?)";

	public int cerateInfo(String itemName,String itemPrice,String itemStock)
			throws SQLException{
		int count = 0; //countという受け皿作った

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,itemName);
			preparedStatement.setString(2,itemPrice);
			preparedStatement.setString(3,itemStock);
			preparedStatement.setString(4,dateUtil.getDate());
			count = preparedStatement.executeUpdate(); //処理件数をcountに入れる
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return count;

	}

}
