import com.alice.service.IUserLoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class TestUnitl
{
    @Resource
    Date date;

/*    @Autowired
    private IUserLoginService userLoginService;*/

    @Test
    public void testForConfig()
    {
//        userLoginService.verifyLoginUser("123456","123456");
        System.out.println("现在的时间是：" + date);
    }
}
