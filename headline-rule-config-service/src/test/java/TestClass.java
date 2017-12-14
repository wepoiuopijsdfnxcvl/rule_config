import com.honglu.headline.rule.config.core.Application;
import com.honglu.headline.rule.config.facade.business.BusinessParamDubboBusiness;
import com.honglu.headline.rule.config.facade.business.ScParamDubboBusiness;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestClass {

    Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    private ScParamDubboBusiness scParamDubboBusiness;

//    @Test
    public void test() {
//        Object object = scParamDubboBusiness.querySysParamByParamValueRedis("21");
//        logger.debug(object + "1111111111111111111");
    }

}
