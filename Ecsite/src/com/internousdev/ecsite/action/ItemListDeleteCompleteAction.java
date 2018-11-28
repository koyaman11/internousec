package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.ItemListDeleteCompleteDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private ItemListDeleteCompleteDAO itemListDeleteCompleteDAO=new ItemListDeleteCompleteDAO();
	private ArrayList<ItemListDeleteCompleteDTO> itemListDTO=new ArrayList<ItemListDeleteCompleteDTO>();
	private String message;


	public String exceute()throws SQLException{
		if(!session.containsKey("item_name")){
			return ERROR;
		}

		int res=itemListDeleteCompleteDAO.itemListHistryDelete();
		if(res>0){
			itemListDTO=null;
			setMessage("消去しますか");
		}else if(res==0){
			setMessage("消去できませんでした");
		}
  String result=SUCCESS;
  return result;
	}

	public ArrayList<ItemListDeleteCompleteDTO> getItemListDTO(){
		return this.itemListDTO;
	}

	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}

}

