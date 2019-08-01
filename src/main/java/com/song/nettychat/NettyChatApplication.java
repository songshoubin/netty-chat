package com.song.nettychat;

import com.song.nettychat.Server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NettyChatApplication {

    public static void main(String[] args) {
//        SpringApplication.run(NettyChatApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(NettyChatApplication.class, args);
        //		ServerBootstrap serverBootstrap = context.getBean(ServerBootstrap.class);
//		serverBootstrap.bind(8888).sync();
        NettyServer nettyServer = context.getBean(NettyServer.class);
        try {
            nettyServer.start();
        } catch (Exception e) {
            System.out.println("netty启动失败");
        }
    }

}
