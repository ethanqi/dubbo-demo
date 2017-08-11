package com.gomefin.dubbo.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gomefin.dubbo.api.DemoService;

public class BaseClient {
    protected static final Log logger = LogFactory.getLog(BaseClient.class);
    public static DemoService service = init();// rpc接口实例


    /**
     * 获得接口实例
     *
     * @return
     */
    @SuppressWarnings("resource")
    public static DemoService init() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "dubbo-demo-consumer.xml" });
        context.start();
        logger.info("测试服务已开启>>>>>>>>>>");
        DemoService port = (DemoService) context.getBean("ClientService", DemoService.class);
        return port;
    }

}
