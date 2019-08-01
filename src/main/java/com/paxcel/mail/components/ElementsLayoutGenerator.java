package com.paxcel.mail.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paxcel.mail.model.DomainModel;

@Service
public class ElementsLayoutGenerator {
	
	/*
	 * @Autowired private ChildChecker childChecker;
	 */
	public String generateImage(DomainModel domainModelNew) {
		StringBuilder strElementImg = new StringBuilder();
		
		strElementImg.append("<table width=\"100%\">\r\n" + 
				"			  <tbody>\r\n"+
				"				<tr>\r\n");
		strElementImg.append("<td class=\"lg-"+domainModelNew.getLg()+"\">\r\n");
		
		strElementImg.append("<img src=\""+domainModelNew.getSrc()+"\" alt=\""+domainModelNew.getAltText()+"\" width=\""+domainModelNew.getWidth()+"\"  />\r\n");
		
		strElementImg.append("</td>\r\n");
		strElementImg.append("</tr>\r\n" + 
				"			  </tbody>\r\n"+
				"				</table>\r\n");
		
		return strElementImg.toString();
	}

	public String generateTextInput(DomainModel domainModelNew) {
		StringBuilder strElementImg = new StringBuilder();
		
		strElementImg.append("<table width=\"100%\">\r\n" + 
				"			  <tbody>\r\n"+
				"				<tr>\r\n");
		strElementImg.append("<td class=\"lg-"+domainModelNew.getLg()+"\">\r\n");
		
		strElementImg.append("<input type=\"text\" value=\""+domainModelNew.getBinding()+"\" />\r\n");
		
		strElementImg.append("</td>\r\n");
		strElementImg.append("</tr>\r\n" + 
				"			  </tbody>\r\n"+
				"				</table>\r\n");
		
		return strElementImg.toString();
	}

	public String generatePlainText(DomainModel domainModelNew) {
		
		StringBuilder strElementImg = new StringBuilder();
		
		strElementImg.append("<table width=\"100%\">\r\n" + 
				"			  <tbody>\r\n"+
				"				<tr>\r\n");
		strElementImg.append("<td class=\"lg-"+domainModelNew.getLg()+"\">\r\n");
		strElementImg.append("Hello Paxcel");
		//strElementImg.append("<img src=\""+domainModelNew.getSrc()+"\" alt=\""+domainModelNew.getAltText()+"\" width=\""+domainModelNew.getWidth()+"\"  />\r\n");
		
		strElementImg.append("</td>\r\n");
		strElementImg.append("</tr>\r\n" + 
				"			  </tbody>\r\n"+
				"				</table>\r\n");
		
		return strElementImg.toString();
	}

	

}
