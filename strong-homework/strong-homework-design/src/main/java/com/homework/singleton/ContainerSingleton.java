package com.homework.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-03-01 11:05
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>(16);

    public static Object getInstance(String className) {
        if (!ioc.containsKey(className)) {
            synchronized (ioc) {
                Object obj = ioc.get(className);
                if (obj == null) {
                    try {
                        obj = Class.forName(className).newInstance();
                        ioc.put(className, obj);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                return obj;
            }
        } else {
            return ioc.get(className);
        }
    }
}
