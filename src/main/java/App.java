import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld HelloBeanOne = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld HelloBeanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBeanOne = (Cat) applicationContext.getBean("cat");
        Cat catBeanTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(HelloBeanOne.getMessage());
        System.out.println(HelloBeanTwo.getMessage());
        System.out.println(catBeanOne.getMessage());
        System.out.println(HelloBeanTwo.getMessage());
        System.out.println(catBeanOne == catBeanTwo);

        System.out.println(HelloBeanOne == HelloBeanTwo);

    }
}