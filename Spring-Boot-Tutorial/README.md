# Spring-Boot-Tutorial
 
## Rest API architecture

    Application    Data     Controller <-------- service <------- Repository
    
Annotations

    1.@Entity
    
      above data class and for data types and constructors
       
    2.@Id  ------------------------------------------------------------
                                                                       |-------for Getter and Setter methods
    3.@GeneratedValue(strategy=GenerationType.IDENTITY-----------------
    
    4.@RestController
         for Controller Class
         
    5.@Autowired
         for declaring objects of another class
         
    6.@GetMapping
       for returning list of all students and list of one students
       
    7.@PostMapping
        for adding student list---data
        
    8.@DeleteMapping
        for deleting student list---data
        
    9.@Service
       for Service class
       
    10.@PathVariable
    
    11.@RequestBody
    
    12.@Required
       for Getter and Setter methods
       
    13.@Controller
    
    14.@Repository
    
    15.@RequestMapping
    
    16.@Component
    
    17.@Configuration
    
    18.@ComponentScan
    
    19.@EnableAutoConfiguration
    
    20.@PutMapping
           for update of student list -data
           
    21.@PatchMapping
    
    22.@ResponseBody
    
    23.@RequestParam
    
    24.@RequestHeader
    
    25.@RequestAttribute
    
    27.@Table(name="-------")
    
    28.@Override
      for toString method
      eg:
              @Override  
               public String toString()   
               {  
                return "User [id=" + id + ", uname=" + username + "]";  
                }  
    
    
## Spring Boot Property Categories

There are sixteen categories of Spring Boot Property are as follows:

- Core Properties
- Cache Properties
- Mail Properties
- JSON Properties
- Data Properties
- Transaction Properties
- Data Migration Properties
- Integration Properties
- Web Properties
- Templating Properties
- Server Properties
- Security Properties
- RSocket Properties
- Actuator Properties
- DevTools Properties
- Testing Properties


#application.properties

    server.port=8085  

    spring.h2.console.enabled=true  

    spring.datasource.plateform=h2  

    spring.datasource.url=jdbc:h2:mem:javatpoint  


#Creating SQL File

    Resourses----->create new file ----------->filename.sql
    
 #Create .jsp file for html and css\
 
    Resourses-------->create new file ----------> filename.jsp
   
 #Application Properties
 
- server.port=2323

- management.security.enabled=false
  
- spring.jpa.hibernate.ddl-auto=none
  spring.datasource.url=jdbc:mysql://localhost:3306/mydb
  spring.datasource.username=root
  spring.datasource.password=ramesh


#ThymeLeafBasicProject

    @org.springframework.stereotype.Controller
    public class Controller {
    @GetMapping({"/","/hello"})
    public String hello(@RequestParam(value="name",defaultValue = "world",required = true)String  name, Model model)
    {
        model.addAttribute("name",name);
        return "hello";
     }
    }
    
 #Default Html text to Display name
 
    <body>
    <p th:text=" ' Hello,' +${name}+'! ' "/>
    </body>
    
 #Server to insert text
  
    localhost:8080/?name=Ramesh
