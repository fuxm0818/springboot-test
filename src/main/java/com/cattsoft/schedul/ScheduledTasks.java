package com.cattsoft.schedul;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private static final Logger logger = Logger.getLogger(ScheduledTasks.class);

//    @Scheduled(cron = "0/2 * * * * ?")
//    public void executeFileDownLoadTask() {
//
//        // 间隔2秒钟,执行工单上传任务
//        Thread current = Thread.currentThread();
//        System.out.println("定时任务1:" + current.getId());
//        logger.info("ScheduledTest.executeFileDownLoadTask 定时任务1:" + current.getId() + ",name:" + current.getName());
//    }

}
