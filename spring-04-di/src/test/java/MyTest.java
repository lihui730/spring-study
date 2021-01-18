import com.shimmer.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hui Li on 2021/1/3 21:20
 */
public class MyTest {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) applicationContext.getBean("student");

        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getBooks());
        System.out.println(student.getCards());
        System.out.println(student.getHobbies());
        System.out.println(student.getProperties());
    }
}
