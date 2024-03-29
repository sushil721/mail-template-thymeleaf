package com.paxcel.mail.components;

import org.springframework.stereotype.Service;

//import com.webfirmframework.wffweb.css.Src;
import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.Alt;
import com.webfirmframework.wffweb.tag.html.attribute.ColSpan;
import com.webfirmframework.wffweb.tag.html.attribute.EncType;
import com.webfirmframework.wffweb.tag.html.attribute.Height;
import com.webfirmframework.wffweb.tag.html.attribute.Href;
import com.webfirmframework.wffweb.tag.html.attribute.Method;
import com.webfirmframework.wffweb.tag.html.attribute.RowSpan;
import com.webfirmframework.wffweb.tag.html.attribute.Shape;
import com.webfirmframework.wffweb.tag.html.attribute.Src;
import com.webfirmframework.wffweb.tag.html.attribute.Target;
import com.webfirmframework.wffweb.tag.html.attribute.Type;
import com.webfirmframework.wffweb.tag.html.attribute.Width;
import com.webfirmframework.wffweb.tag.html.attribute.global.ClassAttribute;
import com.webfirmframework.wffweb.tag.html.attribute.global.Id;
import com.webfirmframework.wffweb.tag.html.attribute.global.Style;
import com.webfirmframework.wffweb.tag.html.attributewff.CustomAttribute;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Form;
import com.webfirmframework.wffweb.tag.html.images.Img;
import com.webfirmframework.wffweb.tag.html.links.A;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Span;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.StyleTag;
import com.webfirmframework.wffweb.tag.html.tables.Caption;
import com.webfirmframework.wffweb.tag.html.tables.TBody;
import com.webfirmframework.wffweb.tag.html.tables.Table;
import com.webfirmframework.wffweb.tag.html.tables.Td;
import com.webfirmframework.wffweb.tag.html.tables.Tr;
import com.webfirmframework.wffweb.tag.htmlwff.CustomTag;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

@Service
public class AutoTemplateGenerator {
	final ClassAttribute classAttribute8 = new ClassAttribute("lg-12");
	final RowSpan rowSpan10 = new RowSpan("1");
	final ColSpan colSpan11 = new ColSpan("1");
	final Width width15 = new Width("100%");
	final ClassAttribute classAttribute16 = new ClassAttribute("lg-6");
	final ClassAttribute classAttribute18 = new ClassAttribute("container-title");
	final ClassAttribute classAttribute55 = new ClassAttribute("underlined-caption ");
	final ClassAttribute classAttribute57 = new ClassAttribute("container-title lg-12");

	
	@SuppressWarnings("serial")
	public String getAutoGeneratedTemplate() {
	
	Html html = new Html(null,
	    new CustomAttribute("xmlns", "http://www.w3.org/1999/xhtml")) {{
	new Head(this) {{
	    new StyleTag(this,
	        new Type("text/css"),
	new CustomAttribute("xml:space", "preserve")) {{
	new NoTag(this, ".lg-1 {\n	width: 8.33%;\n}\n\n.lg-2 {\n	"
		+ "width: 16.66%;\n}\n\n.lg-3 {\n	width: 25%;\n}\n\n.lg-4 {\n	width: 33.33%;\n}\n\n.lg-5 {\n	"
		+ "width: 41.66%;\n}\n\n.lg-6 {\n	width: 50%;\n}\n\n.lg-7 {\n	width: 58.33%;\n}\n\n.lg-8 {\n	"
		+ "width: 25%;\n}\n\n.lg-9 {\n	width: 75%;\n}\n\n.lg-10 {\n	width: 83.33%;\n}\n\n.lg-11 {\n	"
		+ "width: 91.66%;\n}\n\n.lg-12 {\n	width: 100%;\n}\n\n.summaryContainer {\n	"
		+ "border: 1px solid black;\n}\n\n.summaryContainer .container-title {\n	"
		+ "font-weight: bold\n}\n\n.amountDueContainer {\n	border: 1px solid black;\n	"
		+ "background-color: #9dcfe6\n}\n\n.amountDueContainer div {\n	text-align: center;\n}\n\ncaption {\n"
		+ "	text-align: left;\n	padding: 5px;\n}\n\n.underlined-caption caption {\n"
		+ "	border-bottom: 1px solid black;\n}\n\ntable {\n	border-spacing: 0px;\n	padding: 5px\n}");
	    }};
	}};
	new Body(this,
	    new Style("background-color:#f6f6f6;")) {{
	new CustomTag("center", this) {{
	new Div(this,
	    new Id("View_1")) {{
	new Table(this,
	    new Width("600px")) {{
new Caption(this);
    new TBody(this) {{
        new Tr(this,
            new Id("ViewRow_2"),
            classAttribute8) {{
            new Td(this,
                new Id("ViewCol_3"),
                classAttribute8,
                rowSpan10,
                colSpan11) {{
                new Form(this,
                    new Id("form_4"),
                    new Method("get"),
                    new EncType("application/x-www-form-urlencoded")) {{
                    new Table(this,
                        width15) {{
                        new Caption(this);
                        new TBody(this) {{
                            new Tr(this) {{
                                new Td(this,
                                    rowSpan10,
                                    colSpan11) {{
                                    new Table(this,
                                        width15) {{
                                        new TBody(this) {{
                                            new Tr(this) {{
                new Td(this,
                    classAttribute16,
                    rowSpan10,
                    colSpan11) {{
                    new Div(this,
                        new Id("Container_8")) {{
                        new Table(this,
                            width15) {{
                            new Caption(this,
                                classAttribute18);
                            new TBody(this) {{
                                new Tr(this,
                                    new Id("ContainerRow_6"),
                                    classAttribute8) {{
                                    new Td(this,
                                        rowSpan10,
                                        colSpan11) {{
                                        new Div(this,
                                            new Id("Image_7"),
                                            new ClassAttribute("lg-3")) {{
                                            new Img(this,
                                                new Src("https://s3.amazonaws.com/paymentus-logos-dev/PAYMENTUS-DEV/N503/logo/logo.jpeg?timestamp=1560114033212"),
                                                new Alt("null"),
                                                new Height("48px"),
                                                new Width("48px"));
                                        }};
                                    }};
                                }};
                            }};
                        }};
                    }};
                }};
                new Td(this,
                    classAttribute16,
                    rowSpan10,
                    colSpan11) {{
                    new Div(this,
                        new ClassAttribute("amountDueContainer "),
                        new Id("Container_9")) {{
                        new Table(this,
                            width15) {{
                            new Caption(this,
                                classAttribute18);
                            new TBody(this) {{
                                new Tr(this,
                                    new Id("ContainerRow_10"),
                                    classAttribute8) {{
                                    new Td(this,
                                        rowSpan10,
                                        colSpan11) {{
                                        new Div(this,
                                            new Id("LiabilityInfo.AmountDueHL"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Amount Due : $ 11.09 ");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.DueDateHL"),
                                            classAttribute8) {{
                                            new NoTag(this, "\non 2019-07-19 or ");
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.DueDateHL2"),
                                            classAttribute8) {{
                                            new NoTag(this, "\nPayment scheduled for 2019-07-19 ");
                                        }};
                                    }};
                                }};
                            }};
                        }};
                    }};
                }};
            }};
            new Tr(this,
                classAttribute8) {{
                new Td(this,
                    classAttribute16,
                    rowSpan10,
                    colSpan11) {{
                    new Div(this,
                        new ClassAttribute("summaryContainer "),
                        new Id("Container_11")) {{
                        new Table(this,
                            width15) {{
                            new Caption(this,
                                classAttribute18) {{
                                new NoTag(this, "\nAccount Summary ");
                            }};
                            new TBody(this) {{
                                new Tr(this,
                                    new Id("ContainerRow_12"),
                                    classAttribute8) {{
                                    new Td(this,
                                        rowSpan10,
                                        colSpan11) {{
                                        new Div(this,
                                            new Id("LiabilityInfo.AccountNumber"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Account Number : ");
                                                }};
                                                new NoTag(this, "6759370 ");
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.EffectiveDate"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Statement Date : 2019-07-19 ");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.LastName"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Customer Name : ");
                                                }};
                                                new NoTag(this, "McCurley ");
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.FirstName"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Customer Name : ");
                                                }};
                                                new NoTag(this, "Peter ");
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.LastBillAmount"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Previous Bill Amount : $ null ");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.LastPaymentAmount"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Payments : $ null ");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.AmountDue"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Amount Due : $ 11.09 ");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.DueDate"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Due Date : 2019-07-19 ");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("LiabilityInfo.AddressLine1"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Address : ");
                                                }};
                                                new NoTag(this, "10 First St. ");
                                            }};
                                        }};
                                    }};
                                }};
                            }};
                        }};
                    }};
                }};
                new Td(this,
                    classAttribute16,
                    rowSpan10,
                    colSpan11) {{
                    new Div(this,
                        new ClassAttribute("optionsContainer underlined-caption "),
                        new Id("Container_13")) {{
                        new Table(this,
                            width15) {{
                            new Caption(this,
                                classAttribute18) {{
                                new NoTag(this, "\nPayment Options ");
                            }};
                            new TBody(this) {{
                                new Tr(this,
                                    new Id("ContainerRow_14"),
                                    classAttribute8) {{
                                    new Td(this,
                                        rowSpan10,
                                        colSpan11) {{
                                        new Div(this,
                                            new Id("Plain Text_16"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Pay online:");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("Html Link_17"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new A(this,
                                                    new Href("https://dev.paymentus.io/rotp/abc"),
                                                    new Target("_self"),
                                                    new Shape("rect")) {{
                                                    new NoTag(this, "Pay Link");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("Plain Text_18"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Pay by Phone:");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("Plain Text_19"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "phone number here");
                                                }};
                                            }};
                                        }};
                                        new Div(this,
                                            new Id("Plain Text_20"),
                                            classAttribute8) {{
                                            new P(this) {{
                                                new Span(this) {{
                                                    new NoTag(this, "Mail");
                                                }};
                                            }};
                                        }};
                                    }};
                                }};
                            }};
                        }};
                    }};
                }};
            }};
                new Tr(this) {{
                    new Td(this,
                        rowSpan10,
                        colSpan11) {{
                        new Div(this,
                            classAttribute55,
                            new Id("Container_21")) {{
                            new Table(this,
                                width15) {{
                                new Caption(this,
                                    classAttribute57) {{
                                    new NoTag(this, "\nImportant Messages ");
                                }};
                                new TBody(this) {{
                                    new Tr(this,
                                        new Id("ContainerRow_22"),
                                        classAttribute8) {{
                                        new Td(this,
                                            rowSpan10,
                                            colSpan11) {{
                                            new Div(this,
                                                new Id("Plain Text_27"),
                                                classAttribute8) {{
                                                new P(this) {{
                                                    new Span(this) {{
                                                        new NoTag(this, "messages here");
                                                    }};
                                                }};
                                            }};
                                        }};
                                    }};
                                }};
                            }};
                        }};
                    }};
                }};
                new Tr(this) {{
                    new Td(this,
                        rowSpan10,
                        colSpan11) {{
                        new Div(this,
                            classAttribute55,
                            new Id("Container_25")) {{
                            new Table(this,
                                width15) {{
                                new Caption(this,
                                    classAttribute57) {{
                                    new NoTag(this, "\nCustomer Service ");
                                }};
                                new TBody(this) {{
                                    new Tr(this,
                                        new Id("ContainerRow_26"),
                                        classAttribute8) {{
                                        new Td(this,
                                            rowSpan10,
                                            colSpan11) {{
                                            new Div(this,
                                                new Id("Plain Text_28")) {{
                                                new P(this) {{
                                                    new Span(this) {{
                                                        new NoTag(this, "For emergencies and reporting outages:");
                                                    }};
                                                    new Span(this) {{
                                                        new NoTag(this, " [phone number here]");
                                                    }};
                                                }};
                                            }};
                                        }};
                                    }};
                                }};
                            }};
                        }};
                    }};
                }};
                                        }};
                                    }};
                                }};
                            }};
                        }};
                    }};
                }};
            }};
        }};
    }};
}};
	            }};
	        }};
	    }};
	}};
	html.setPrependDocType(true);
	return html.toHtmlString();
	}
	
}
