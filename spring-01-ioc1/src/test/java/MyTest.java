import com.shimmer.dao.UserDao;
import com.shimmer.dao.UserDaoImpl;
import com.shimmer.dao.UserDaoMysqlImpl;
import com.shimmer.service.UserService;
import com.shimmer.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hui Li on 2021/1/1 12:43
 */
public class MyTest {
    public static void main(String[] args){
        //UserService userService = new UserServiceImpl();
        //userService.setUserDao(new UserDaoMysqlImpl());
        //userService.getUser();

        //拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = (UserServiceImpl)context.getBean("userService");
        userService.getUser();
    }
}
