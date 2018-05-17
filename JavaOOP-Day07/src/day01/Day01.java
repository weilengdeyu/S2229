package day01;

import java.util.ArrayList;
/**2018年3月8日*/
public class Day01 {
    /**
     * 多线程
     * 理解线程的概念
     * 线程：是【进程（看成是线程的母亲）】中执行运算的最小单位
     * 进程：是一次程序的执行，是一次程序的活动
     * 多线程：就是同时有多个线程执行，共同维护程序中的数据。（个人理解）
     * 
     * 
     * 
		掌握线程的创建和启动
		了解线程的状态
		掌握线程调度的常用方法
     * @param args
     */
	public static void main(String[] args) {
		//ArrayList 案例    红海行动
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName()+"线程名称");
		currentThread.setName("主线程");
		System.out.println(currentThread.getName()+"线程名称");
	}

}
