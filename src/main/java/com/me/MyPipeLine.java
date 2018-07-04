package com.me;

import com.me.bean.Informations;
import com.me.services.IService;
import com.me.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import javax.annotation.Resource;
//自定义PipeLine（处理数据类），存入数据库
@Component(value = "MyPipeLine")
public class MyPipeLine implements PageModelPipeline<Informations> {
    @Autowired
    private IService iService;

    @Override
    public void process(Informations informations, Task task) {

        iService.insertInfo(informations);
    }
}
