package com.iwooto.quartz;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;



@Component("Schedule")
public class Schedule {
	
	private static Logger logger = Logger.getLogger(Schedule.class.getName());


	//private ErpbgdLinkService erpbgdLinkService;
	public synchronized void init() {
		System.out.println("我是一个定时任务");
		
	}
	


	/**
	 * 测试方法
	 * @param args
	 */
	public static void main(String[] args) {
//		String ss="01220-01222,01223-01225";
//		Schedule sch=new Schedule();
//		String s=sch.getFpNo(ss);
//		System.out.println(s);
	}
}
