package com.sb.main.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskService {

    //Fixed rate -runs every 5 sec
    @Scheduled(fixedRate = 5000)
    public void runFixedRateTask()
    {
        System.out.println("Fixed Rate Task : "+ LocalDateTime.now());
    }

    //fixed delay - runs 5 sec after previous task has finished
    @Scheduled(fixedDelay = 5000)
    public void runFixedDelay()
    {
        System.out.println("Fixed delay task : "+ LocalDateTime.now());
    }

    // cron Expression : runs at 10:15 am every day
    //format : sec,min,hour,day of month,month,day of week
    @Scheduled(cron = "0 15 10 * * ?")
    public void runCronTask()
    {
      System.out.println("Cron task executed at : "+ LocalDateTime.now());
    }

    //Async task : runs in a separate thread
    @Async
    public void executeAsyncTask(String taskName)
    {
        System.out.println("Executing "+taskName+ "asynchronously on thread: "+Thread.currentThread().getName());
    }
}
