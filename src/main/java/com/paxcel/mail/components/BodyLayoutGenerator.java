package com.paxcel.mail.components;

import com.paxcel.mail.model.DomainModel;

public interface BodyLayoutGenerator {

	StringBuffer tableLayout(DomainModel dm);

	StringBuilder getStringNextValue();

}
