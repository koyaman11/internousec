package com.internousdev.ecsite.action;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class GoHomeAction extends ActionSupport{
	public Map<String,Object>session;
	public String execute(){
		return SUCCESS;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}
