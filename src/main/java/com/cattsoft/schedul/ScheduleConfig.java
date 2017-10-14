package com.cattsoft.schedul;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * 定时任务配置
 * 每个任务都会使用一个新的线程（任务的定时重复调用，每次都不在同一个线程中）
 * 使用该配置时，应注释掉applicationContext.xml中的schedule配置
 */
//@Configuration
//public class ScheduleConfig implements SchedulingConfigurer, AsyncConfigurer {
//
//	/**
//	 * 并行任务
//	 */
//	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//		TaskScheduler taskScheduler = taskScheduler();
//		taskRegistrar.setTaskScheduler(taskScheduler);
//	}
//
//	/**
//	 * 并行任务使用策略：多线程处理
//	 *
//	 * @return ThreadPoolTaskScheduler 线程池
//	 */
//	@Bean(destroyMethod = "shutdown")
//	public ThreadPoolTaskScheduler taskScheduler() {
//		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//		scheduler.setPoolSize(20);
//		scheduler.setThreadNamePrefix("task-");
//		scheduler.setAwaitTerminationSeconds(60);
//		scheduler.setWaitForTasksToCompleteOnShutdown(true);
//		return scheduler;
//	}
//
//	/**
//	 * 异步任务
//	 */
//	public Executor getAsyncExecutor() {
//		Executor executor = taskScheduler();
//		return executor;
//	}
//
//	/**
//	 * 异步任务 异常处理
//	 */
//	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//		return new SimpleAsyncUncaughtExceptionHandler();
//	}
//}


public class ScheduleConfig{}