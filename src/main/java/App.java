import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        Cat catOneBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catOneBean.getMessage());
        Cat catTwoBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catTwoBean.getMessage());

        if (bean==beanTwo){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (catOneBean==catTwoBean){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}