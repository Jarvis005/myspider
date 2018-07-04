package com.me;

import com.me.bean.Informations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.OOSpider;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspiderApplicationTests {
    @Autowired
    private MyPipeLine myPipeLine;

    @Test
    public void contextLoads() {
        OOSpider.create(Site.me()
                .setUserAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")
                .setSleepTime(10000).setCycleRetryTimes(10000), myPipeLine,Informations.class)
                .addUrl("http://toutiao.hc360.com/").thread(5).run();
    }
}
