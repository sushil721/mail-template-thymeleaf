package com.paxcel.mail.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.paxcel.mail.model.DomainModel;

@Service
//@Configurable
public class BodyLayoutGeneratorImpl implements BodyLayoutGenerator {

	@Autowired
	private ChildChecker childChecker;
	
	@Autowired
	private ElementsLayoutGenerator elementsLayoutGenerator;

	public StringBuffer tableLayout(DomainModel domainModel) {
		
		StringBuffer strBuilder = new StringBuffer();

//		if(childChecker.checkChild(domainModel.getChildren())) {
		for(DomainModel domainModelNew:domainModel.getChildren()) {
			
//			strLayout.append("<td class=\"lg-"+domainModelNew.getLg()+"\">\r\n");
			//strLayout.append("Sushil");
			if("Image".equals(domainModelNew.getType())) {
				
//				System.err.println("Within Image ----> ");
				strBuilder.append("<table width=\"100%\">\r\n" + 
						"			  <tbody>\r\n"+
						"				<tr>\r\n");
				strBuilder.append("<td class=\"lg-"+domainModelNew.getLg()+"\">\r\n");
				strBuilder.append("<img src=\""+domainModelNew.getSrc()+"\" alt=\""+domainModelNew.getAltText()+"\" width=\""+domainModelNew.getWidth()+"\"  />\r\n");
				
				strBuilder.append(" </td>\r\n");
				strBuilder.append("</tr>\r\n" + 
						"	    </tbody>\r\n"+
						"	  </table>\r\n");
				
			}else if("TextInput".equalsIgnoreCase(domainModelNew.getType())) {
				System.err.println("Within Text Input ----> ");
				//strLayout.append(elementsLayoutGenerator.generateTextInput(domainModelNew)+"\r\n");
			}else if("PlainText".equalsIgnoreCase(domainModelNew.getType())) {
				System.err.println("Within Plain Text ----> ");
				//strLayout.append(elementsLayoutGenerator.generatePlainText(domainModelNew)+"\r\n");
			}
			
			
//			strLayout.append("</td>\r\n");
			
			if(childChecker.checkChild(domainModelNew.getChildren().size())) {
//				System.err.println("In Childrren");
				tableLayout(domainModelNew);
			}//inner loop
		}//for loop
//		}//upper if		
//		System.err.println("Out Childrren");

//		strLayout.append("</tr>\r\n");
		System.err.println("print one by one obj:- "+strBuilder.toString());
		//String str = strBuilder.toString();
		//System.err.println("print String obj:- "+str);
		return strBuilder;
	}

	
	@Override 
	public StringBuilder getStringNextValue() { 
		
	  StringBuilder str = new StringBuilder(); str.append(" World");
	  
	  System.err.println(" "+str); return str; 
	 }
	
}
