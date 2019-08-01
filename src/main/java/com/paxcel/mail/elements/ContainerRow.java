package com.paxcel.mail.elements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paxcel.mail.components.ChildChecker;
import com.paxcel.mail.model.DomainModel;

@Component
public class ContainerRow {
	
	@Autowired
	private ChildChecker childChecker;

	public String getGeneratedView(DomainModel domainModelNew) {
		String str = "<div class=\"md-"+domainModelNew.getLg()+"\">\r\n";
		
		  if(childChecker.checkChild(domainModelNew.getChildren().size())) {
			  
			  for(DomainModel dm:domainModelNew.getChildren()) {
				str.concat("Sushil Kumar Singh");  
			  }
		     }
		   str.concat("</div>\r\n");
		return str;
	}

}
