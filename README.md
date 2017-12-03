# spring-boot-mybatis-swagger
spring-boot跟swagger一个简单的集成
***
简单的实现
##maven依赖

    <dependency>
     <groupId>io.springfox</groupId>
     <artifactId>springfox-swagger2</artifactId>
     <version>2.7.0</version>
    </dependency>
 
 		<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
 	<dependency>
     	<groupId>io.springfox</groupId>
     	<artifactId>springfox-swagger-ui</artifactId>
     	<version>2.7.0</version>
     </dependency>	        
        
#配置文件
    @Configuration
    @EnableSwagger2
    public class  SwaggerConfig {
    
    
        @Bean
        public Docket createRestApi() {
            Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
                @Override
                public boolean apply(RequestHandler input) {
                    Class<?> declaringClass = input.declaringClass();
                    if (declaringClass == BasicErrorController.class)// 排除
                        return false;
                    if(declaringClass.isAnnotationPresent(RestController.class)) // 被注解的类
                        return true;
                    if(input.isAnnotatedWith(ResponseBody.class)) // 被注解的方法
                        return true;
                    if (input.isAnnotatedWith(PostMapping.class))//被这个注解的方法
                        return true;
                    if (input.isAnnotatedWith(GetMapping.class))//被这个注解的方法
                        return true;
    
                    return false;
                }
            };
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .useDefaultResponseMessages(false)
                    .select()
                    .apis(predicate)
                    .build();
        }
    
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("张远明  spring boot swagger ui 使用第一版本")//大标题
                    .version("1.0")//版本
                    .build();
        }
    
    }

##配置文件说明




#mybatis 集成
 maven
 
 		
 		<dependency>
        		<groupId>mysql</groupId>
        		<artifactId>mysql-connector-java</artifactId>
        		<scope>runtime</scope>
        </dependency>
 		<dependency>
 			    <groupId>org.springframework.boot</groupId>
 			    <artifactId>spring-boot-starter-jdbc</artifactId>
 		</dependency>
 		<!--mybatis-->
 		<dependency>
 			    <groupId>org.mybatis.spring.boot</groupId>
 			    <artifactId>mybatis-spring-boot-starter</artifactId>
 			    <version>1.3.0</version>
 		</dependency>   