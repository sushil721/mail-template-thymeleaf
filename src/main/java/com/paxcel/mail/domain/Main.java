package com.paxcel.mail.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Main {
	private String pageName;//": "OneTimePayment",
	 @JsonProperty("View")
	private View view;
	
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public View getView() {
		return view;
	}
	public void setView(View view) {
		this.view = view;
	}
	
	
}
