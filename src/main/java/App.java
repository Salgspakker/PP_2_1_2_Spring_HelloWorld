import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanNext =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCatA =
                (Cat) applicationContext.getBean("cat");
        Cat beanCatB =
                 applicationContext.getBean("cat", Cat.class);
        System.out.println(bean.getMessage());
        System.out.println(bean == beanNext);
        System.out.println(beanCatA == beanCatB);
    }
}