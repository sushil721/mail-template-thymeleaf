package com.paxcel.mail.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@SuppressWarnings("deprecation")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class DomainModel {
	
	private String type;
	private String title;
	private String lg;
	
	private String altText; 
	private String text;
	private String src;
	private String width;
	
	private String binding;
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
	private Boolean readonly=false;
	private String label;//"  : "Account Number",
	private String messageKey;//": "Copyright (c) Paymentus Co. 2019",
	

	@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
	private List<DomainModel> children = new ArrayList<>();

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

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getMessageKey() {
		return messageKey;
	}
    
	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public String getLg() {
		return lg;
	}

	public void setLg(String lg) {
		this.lg = lg;
	}

	public Boolean getReadonly() {
		return readonly;
	}

	public void setReadonly(Boolean readonly) {
		this.readonly = readonly;
	}

	public List<DomainModel> getChildren() {
		return children;
	}

	public void setChildren(List<DomainModel> children) {
		this.children = children;
	}
	
	

}