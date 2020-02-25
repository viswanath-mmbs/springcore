A===depends on ======  B to do its job 
 
then B is the dependency and A is the Dependent object

DI :  	Setter , Constructor using ref tag   

the process if linking the dependent an dependency is called wiring/ wiring of beans

if this processs done by programmer then it is called by wiring
if this processs done by container then it is called by auto wiring

					autowiring : two way 
	1 XML												2 Annotation
		*No(Default)										@Autowired
		*By Type											@Qualifier
		*By Name
		*Auto Detect (lower spring 2 and lower)
		*Constructor
	


By Type :
	
	* spring container will try to find bean if it finds it injects if not found no exception, spring container inject null
	* No qualifying bean of type 'com.mvn.spring.springcore.session9.advanced.autowiring.Address' available: expected single matching bean but found 2: address,address1
	
	
By Name : 

 // if two beans with same name
 * Bean name 'address' is already used in this <beans> element Offending resource: class path resource [com/mvn/spring/springcore/session9/advanced/autowiring/config.xml]
 
 // if not found return null