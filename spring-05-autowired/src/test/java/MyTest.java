import com.shimmer.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hui Li on 2021/1/6 21:09
 */
public class MyTest {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person.getName());
        person.getCat().get();
        person.getDog().get();
    }
}
