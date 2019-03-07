package com.design.singleton;
/**
 * 设计模式之单例模式(懒汉式)
 * 		比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
 * @author zhaoYangQiu
 *
 */
public class LazySingleton {
	private LazySingleton() {}
	private static LazySingleton singleton = null;
	//并发访问会产生安全问题，所以加入同步机制解决安全问题，同步降低效率，通过双重判断解决效率问题，减少判断锁的次数
	public static LazySingleton getInstance() {
		if(singleton == null) {
			synchronized(LazySingleton.class) {
				if(singleton == null) {
					singleton = new LazySingleton();
				}
			}
		}
		return singleton;
	}
}
