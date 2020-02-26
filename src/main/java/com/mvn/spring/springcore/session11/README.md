Sterio type annotation

* @Component
	it is only used for user defined classes
	@Component()  // default bean name is camelcase class name if you want to specify bean name as below line
	//@Component("inst") 
	

Scopes using annotations :

default : singleton

	@Scope("prototype")

	@Value("9") // to assign value using annotation @Value
	
	@Value("#{topics}") spring expression language 
		to inject collection to a bean using @Value annotation from config as below
	
		<util:list list-class="java.util.LinkedList" id="topics">
	    	<value>Java</value>
	    	<value>Springboot</value>
	    </util:list>
	    
	@Autowired to inject reference type to a bean
    
    
    