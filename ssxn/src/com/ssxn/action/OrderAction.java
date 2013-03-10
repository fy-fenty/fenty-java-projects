package com.ssxn.action;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.ssxn.model.Morder;
import com.ssxn.util.Struts2Utils;

public class OrderAction {
	public String list(){
		List<Morder> orders = new LinkedList<Morder>();
		orders.add(new Morder(1,1,1f,new Date(),1,"1",1f,1f,new Date(),"1","1","1","1","1","1","1","1",1,"1","1"));
		orders.add(new Morder(2,2,2f,new Date(),2,"2",2f,2f,new Date(),"2","2","2","2","2","2","2","2",2,"2","2"));
		orders.add(new Morder(3,3,3f,new Date(),3,"3",3f,3f,new Date(),"3","3","3","3","3","3","3","3",3,"3","3"));
		orders.add(new Morder(4,4,4f,new Date(),4,"4",4f,4f,new Date(),"4","4","4","4","4","4","4","4",4,"4","4"));
		Struts2Utils.renderHtml(true, orders);
		return null;
	}
}
