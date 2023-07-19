import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHello =
                (HelloWorld) applicationContext.getBean(("helloworld"));
        System.out.println();

        Cat catBean =
                (Cat) applicationContext.getBean("getCat");
        System.out.println(catBean.getMeow());
        Cat catBean1 =
                (Cat) applicationContext.getBean(("getCat"));
        System.out.println(catBean1.getMeow());
        System.out.println("------------------------------------");

        System.out.println("Сравнение бинов Cat : " + (catBean==catBean1));
        System.out.println("Сравнение бинов HelloWorld : " + (bean==beanHello));
    }
}