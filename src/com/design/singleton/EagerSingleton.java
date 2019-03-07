package com.design.singleton;
/**
 * 设计模式之单例模式(饿汉式)
 * 		在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
 * @author zhaoYangQiu
 *
 */
public class EagerSingleton {
	//构造函数私有化,不让外部用new关键字创建对象
	private EagerSingleton() {}
	//创建一个唯一的本类对象并进行私有化，不让外部访问
	private static final EagerSingleton singleton = new EagerSingleton();
	//对外提供一个获取本类对象的接口                         不用同步(类加载时已初始化，不会有多线程的问题)
	public static EagerSingleton getInstance() {
		return singleton;
	}
}
