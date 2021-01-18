import com.shimmer.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Hui Li on 2021/1/16 23:06
 */
public class MyTest {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-3.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.update("测试");

    }
}
