import com.shimmer.pojo.User;
import com.shimmer.pojo.UserType;
import com.shimmer.pojo.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Hui Li on 2021/1/10 20:40
 */
public class MyTest {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        User user = (User)context.getBean("myUser");
        System.out.println(user.getName());

        UserType type = (UserType) context.getBean("getType");
        System.out.println(type.getType());
    }
}
