package com.baizhi.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.baizhi.service.IDemoService;

public class DemoService_v1 implements IDemoService {

	public int sum(Integer x, Integer y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	public int multi(Integer x, Integer y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	public String methodInvoke() {
		// TODO Auto-generated method stub
		return "new";
	}

	
	public String[] groupArray() {
		// TODO Auto-generated method stub
		System.out.println("----v1 groupArray--------------- ");
		
		return new String[]{"A","B","C"};
	}

	public List<String> groupList() {
		// TODO Auto-generated method stub
		
		System.out.println("----v1 groupList--------------- ");
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("groupListA");
		arrayList.add("groupListB");
		arrayList.add("groupListC");
		return arrayList;
	}

	public Map<String, Object> groupMap() {
		// TODO Auto-generated method stub
		
		System.out.println("----v1 groupMap--------------- ");
		
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("user01", "groupMapA");
		map.put("user02", "roupMapB");
		map.put("user03", "groupMapC_1111");
		return map;
	}

	@Override
	public Set<String> groupSet() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
