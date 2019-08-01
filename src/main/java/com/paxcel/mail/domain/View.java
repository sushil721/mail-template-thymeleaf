package com.paxcel.mail.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class View {
	
	private String type;
	private String title;
	
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
	private List<Children> children = new ArrayList<>();

	@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
	Map<String, Integer> properties = new HashMap<>();
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Children> getChildren() {
		return children;
	}
	public void setChildren(List<Children> children) {
		this.children = children;
	}
	public Map<String, Integer> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, Integer> properties) {
		this.properties = properties;
	}


}
