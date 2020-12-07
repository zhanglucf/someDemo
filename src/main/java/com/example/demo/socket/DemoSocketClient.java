package com.example.demo.socket;

import com.alibaba.fastjson.JSONObject;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

import java.net.URISyntaxException;
/**
 * @Author: ZhangZhenhua
 * @Date: 2020/9/24 9:16
 */
public class DemoSocketClient {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        IO.Options options = new IO.Options();
        options.transports = new String[]{"websocket"};
        options.reconnectionAttempts = 2;
        options.reconnectionDelay = 1000;//失败重连的时间间隔
        options.timeout = 500;//连接超时时间(ms)

//        final Socket socket = IO.socket("http://localhost:9092/?token=123456", options);//错误的token值连接示例
//        final Socket socket = IO.socket("http://localhost:9009/?token=87df42a424c48313ef6063e6a5c63297", options);
        final Socket socket = IO.socket("http://192.168.13.147:9099/?userId=web-1000001281917092", options);

        socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println("连接server成功");
//                JSONObject jsonObject = new JSONObject();
//                jsonObject.put("type", "type");
//                jsonObject.put("operateId", "operateId");
//                socket.send("hello");
            }
        });

        socket.on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                                    System.out.println("连接关闭");
            }
        });

        socket.on("file_share", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println("sessionId:" + socket.id());
                for (Object obj : args) {
                    System.out.println(obj);
                }
                System.out.println("收到服务器应答，将要断开连接...");
                socket.disconnect();
            }
        });

        socket.on("invite_cooperate", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println("sessionId:" + socket.id());
                for (Object obj : args) {
                    System.out.println(obj);
                }
                System.out.println("收到服务器应答，将要断开连接...");
                socket.disconnect();
            }
        });

        socket.on("agenda_message", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println("sessionId:" + socket.id());
                for (Object obj : args) {
                    System.out.println(obj);
                }
                System.out.println("收到服务器应答...");
//                socket.disconnect();
            }
        });

        socket.connect();

    }

}
