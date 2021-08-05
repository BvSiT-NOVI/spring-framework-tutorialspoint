package x.y;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import x.y.service.FooService;

import java.util.List;

public final class Boot {

    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        //See https://stackoverflow.com/questions/13461985/classcastexception-proxy-cannot-be-cast-to-using-aop
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) ctx.getBean("studentJDBCTemplate");
        System.out.println("------Records creation--------" );


        studentJDBCTemplate.create("Zara", 11, 99, 2010);
        studentJDBCTemplate.create("Nuha", 20, 97, 2010);
        studentJDBCTemplate.create("Ayan", 25, 100, 2011);

        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();

        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }





        FooService fooService = (FooService) ctx.getBean("fooService");
        Foo foo = new Foo();
        foo.name = "This is a test Foo object";
        fooService.getName(foo);
        //fooService.insertFoo (new Foo());
    }
}
