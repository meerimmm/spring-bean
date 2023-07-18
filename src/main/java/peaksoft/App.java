package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1) Cat деген POJO класс тузунуз
 * 2) AppConfig класстын ичинде cat деген класска бин тузунуз
 * 3) Ал бинди ар бир чакырганда жаны объект тузуло тургандай кылып настройка кылыныз
 * 4) App классында HelloWorld-ду дагы бир жолу жана Catти эки жолу чакырыныз. Аларды ссылкасы менен салыштырып коруп жообун консольго чыгарыныз.
 * 5) Тестти комментарийден чыгарып иштетип корунуз
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean.getMessage());
        System.out.println(cat.getMessage());

        System.out.println("Сравнение HelloWorld -> " + (bean == bean1));
        System.out.println("Сравнение Cat -> " + (cat == cat1));

    }
}
