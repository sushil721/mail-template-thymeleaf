# mail-template-thymeleaf
Email Send By Template using json request and json like,

Request URI:- http://localhost:8080/newJsonRequest

Request Type:- GET

{
"pageName": "This is page name",
"View": {
	"type": "View",
	"title": "This is title",
	"children": [{
			"type": "ViewHeader",
			"lg": 12,
			"children": [{
					"type": "ContainerRow",
					"lg": 12,
					"children": [{
							"type": "Image",
							"altText": null,
							"text": "Payment Center",
							"src": "https://images.pexels.com/photos/807598/pexels-photo-807598.jpeg?cs=srgb&dl=4k-wallpaper-close-up-dew-807598.jpg&fm=jpg",
							"lg": 6,
							"width": "48px"
						},
						{
						  "type": "PlainText",
		  "lg": 6,
		  "messageKey": "Sushil Co."
						}
				    ]
				}
			]
		},
		{
			"type": "SplitColumn",
			"lg": 12,
			"children": [{
					"type": "ViewCol",
					"lg": 12,
					"children": [{
							"type": "Form",
							"title": "Payment Method",
							"lg": 12,
							"children": [{
									"type": "Container",
									"lg": 12,
									"title": null,
									"children": [{
											"type": "ContainerRow",
											"lg": 12,
											"children": [
												{
													"type": "TextInput",
													"binding": "LiabilityInfo.AccountNumber",
													"readonly": true,
													"label"  : "Account Number",
													"lg": 6
											    },
												{
													"type": "TextInput",
													"binding": "LiabilityInfo.AuthToken1",
													"label"  : "Auth Token",
													"lg": 6
												}
											]
										}
									]
								}
							]
				}
			]
		}
	]
},
{
	"type": "ViewFooter",
	"lg": 12,
	"children": [{
			"type": "ContainerRow",
			"lg": 12,
			"children": [{
					"type": "PlainText",
					"messageKey": "Copyright (c) Sushil Co. 2019",
					"lg": 6
				}
			]
		}
	]
  }
]
}
}

