https://www.tutorialspoint.com/spring/spring_java_based_configuration.htm

So far you have seen how we configure Spring beans using XML configuration file. If you are comfortable with XML configuration, then it is really not required to learn how to proceed with Java-based configuration as you are going to achieve the same result using either of the configurations available.

Java-based configuration option enables you to write most of your Spring configuration without XML but with the help of few Java-based annotations explained in this chapter.

`@Configuration` & `@Bean Annotations`

Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions. The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context. The simplest possible @Configuration class would be as follows −

    package com.tutorialspoint;
    import org.springframework.context.annotation.*;
    
    @Configuration
    public class HelloWorldConfig {
       @Bean 
       public HelloWorld helloWorld(){
          return new HelloWorld();
       }
    }
The above code will be equivalent to the following XML configuration −

    <beans>
       <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
    </beans>
Here, the method name is annotated with @Bean works as bean ID and it creates and returns the actual bean. Your configuration class can have a declaration for more than one @Bean. Once your configuration classes are defined, you can load and provide them to Spring container using AnnotationConfigApplicationContext as follows −

    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
       
       HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
       helloWorld.setMessage("Hello World!");
       helloWorld.getMessage();
    }
You can load various configuration classes as follows

    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    
       ctx.register(AppConfig.class, OtherConfig.class);
       ctx.register(AdditionalConfig.class);
       ctx.refresh();
    
       MyService myService = ctx.getBean(MyService.class);
       myService.doStuff();
    }