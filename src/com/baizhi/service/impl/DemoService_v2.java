package com.baizhi.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.baizhi.service.IDemoService;

public class DemoService_v2 implements IDemoService {

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
		return "old";
	}

	public String[] groupArray() {
		// TODO Auto-generated method stub
		System.out.println("----v2 groupArray--------------- ");
		return new String[]{"C","D","F"};
	}

	public List<String> groupList() {
		// TODO Auto-generated method stub
		System.out.println("----v2 groupList--------------- ");
		List<String> arrayList = new ArrayList<String>();
	
		arrayList.add("groupListC");
		arrayList.add("groupListD");
		arrayList.add("groupListF");
		return arrayList;
	}

	public Map<String, Object> groupMap() {
		// TODO Auto-generated method stub
		System.out.println("----v2 groupMap--------------- ");
		
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("user03", "groupMapC_22222");
		map.put("user04", "groupMapD");
		map.put("user05", "groupMapE");
		return map;
	}

	@Override
	public Set<String> groupSet() {
		// TODO Auto-generated method stub
		return null;
	}
 

}
