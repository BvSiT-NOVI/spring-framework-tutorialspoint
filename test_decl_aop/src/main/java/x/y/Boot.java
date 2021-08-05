package x.y;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import x.y.service.FooService;

public final class Boot {

    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        FooService fooService = (FooService) ctx.getBean("fooService");
        Foo foo = new Foo();
        foo.name = "This is a test Foo object";
        fooService.getName(foo);
        //fooService.insertFoo (new Foo());
    }
}
