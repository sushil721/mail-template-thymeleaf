package com.paxcel.mail.components;

import java.util.List;

import org.springframework.stereotype.Component;

import com.paxcel.mail.model.DomainModel;

@Component
public class ChildChecker {

	public boolean checkChild(int children) {
		// TODO Auto-generated method stub
		return  children>0 ? true : false;
	}

	
}
