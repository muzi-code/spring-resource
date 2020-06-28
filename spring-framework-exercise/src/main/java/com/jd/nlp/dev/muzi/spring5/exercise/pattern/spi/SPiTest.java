package com.jd.nlp.dev.muzi.spring5.exercise.pattern.spi;

import java.util.ServiceLoader;

public class SPiTest {
    public static void main(String[] args) {

        /**
         * 这种SPI也是有利弊的，不能不分场合的随意效仿。
         * 优点：
         * 扩展很容易，写一个类加进去就可以。
         * 弊端：
         * 粒度不够细，通过配置的方式得到了一堆类。当你需要通过配置唯一获取一个类时，这种形式就不可以了。
         * 如果需要兼容的话就需要加入一些策略模式，通过一定的策略得到一个唯一的类。
         */
        ServiceLoader<SpiService> load = ServiceLoader.load(SpiService.class);

        // 这么使用其实和BeanPostProcessor很像
        for (SpiService spiService : load) {
            if (spiService instanceof SpiService01){
                spiService.query("90");
            }

            if (spiService instanceof SpiService02){
                spiService.query("90");
            }
        }
//
//        for (SpiService spiService : load) {
//            spiService.query("90");
//        }
//
//        System.out.println();
//
//        // 这么使用其实和BeanPostProcessor很像
//        for (SpiService spiService : load) {
//            if (spiService instanceof SpiService01){
//                spiService.query("90");
//            }
//        }

        /**
         * 扩展：在dubbo的配置里有 rpc.cluster.Cluster的配置中是以 key=value 来配置的。
         * 配置某个key会有唯一的实现类
         *
         * dubbo服务治理：又叫运行时干预，事件驱动，zk中改节点客户端监听节点。
         */
    }
}
