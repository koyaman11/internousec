package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private ItemListDAO itemListDAO=new ItemListDAO();
	private ArrayList<ItemListDTO>itemListDTO=new ArrayList<ItemListDTO>();

	public String execute() throws SQLException{

        itemListDTO=itemListDAO.getItemListInfo();//DAOのItemListInfo内をitemListにいれる
			String result=SUCCESS;
			return result;

	}
public ArrayList<ItemListDTO> getItemListDTO(){
	return this.itemListDTO;
}

public void setSession(Map<String,Object>session){
	this.session=session;
}
}
