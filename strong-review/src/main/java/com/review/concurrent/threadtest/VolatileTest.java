package com.review.concurrent.threadtest;

import javax.sound.midi.Soundbank;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2019-04-05 11:56
 */
public class VolatileTest extends Thread {

    boolean flag = false;
    int i = 0;

    @Override
    public void run() {
        while (!flag) {
            i++;
        }
        System.out.println("线程结束");
    }

    public static void main(String[] args) throws Exception {
        VolatileTest vt = new VolatileTest();
        vt.start();
       // Thread.sleep(2000);
        vt.flag = true;
        System.out.println("stope" + vt.i);
    }
}
