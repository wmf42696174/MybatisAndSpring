import com.neuedu.entity.User;
import com.neuedu.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017-04-18.
 */
@ContextConfiguration(locations = "classpath:spring-core.xml")
public class EvnTest extends AbstractJUnit4SpringContextTests{

    @Resource
    private UserService service;
    @Test
    public void TestFindAllUser(){
        List<User> users=service.FindAllUser();
        Assert.assertTrue(users.size()==15);
    }
}
