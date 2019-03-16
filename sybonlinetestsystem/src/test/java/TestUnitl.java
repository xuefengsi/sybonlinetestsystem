import com.alice.entity.UserAccountEntity;
import com.alice.service.impl.IUserLoginServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestUnitl
{
    @Autowired
    private IUserLoginServiceImpl userLoginService;

    @Test
    public void testForConfig()
    {
        UserAccountEntity test = userLoginService.verifyLoginUser("123456","123456");
        System.out.println("搜索的结果：" + test);
    }
}
