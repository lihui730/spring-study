import com.shimmer.pojo.User;
import com.shimmer.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hui Li on 2021/1/2 9:27
 */
public class MyTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user1 = (User)context.getBean("user");
        User user2 = (User)context.getBean("user");

        System.out.println(user1 == user2);

        //UserT userT = (UserT) context.getBean("secondUser");
        UserT userT = (UserT) context.getBean("u22");
        userT.show();
    }
}
