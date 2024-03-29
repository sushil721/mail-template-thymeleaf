package com.paxcel.mail.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(value=JsonInclude.NON_EMPTY, content=Include.NON_NULL)
public class ModelMain {
	
	    private String pageName;
	   
	    @JsonProperty("View")
		private DomainModel domainModel;
		
		public String getPageName() {
			return pageName;
		}
		public void setPageName(String pageName) {
			this.pageName = pageName;
		}
		public DomainModel getDomainModel() {
			return domainModel;
		}
		public void setDomainModel(DomainModel domainModel) {
			this.domainModel = domainModel;
		}
	
}
