Spring Expression Language SpEL:

@Value("#{topics}") and util

using  expressiong within the @Value annotation and return value
Expression :  is a comination of classes variables, methods , constructor and objects and also symbols
	symbols can be : chars, numerics, operators, keywords, and special symbol which will valuate and return a value
	
	an expressing will always go in to the @Value annotation and start with #(pound)
	ex : 	@Value("#{1+2}")
			@Value("#{5>6?1:2}")
			
	we can also use static methods, object methods, veriables and ....
	
	 
	