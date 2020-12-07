package com.example.demo.socket;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.Map;
@RequestMapping("/socket")
@RestController
public class SocketController {

    static Socket socket;

    {
        IO.Options options = new IO.Options();
        options.transports = new String[]{"websocket"};
        options.reconnectionAttempts = 2;
        options.reconnectionDelay = 1000;//失败重连的时间间隔
        options.timeout = 500;//连接超时时间(ms)

//        final Socket socket = IO.socket("http://localhost:9092/?token=123456", options);//错误的token值连接示例
//        final Socket socket = IO.socket("http://localhost:9009/?token=87df42a424c48313ef6063e6a5c63297", options);
        try {
            socket = IO.socket("http://192.168.13.147:9099/?userId=web-1000001281917092", options);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

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

        socket.on("event_test", new Emitter.Listener() {
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

    @PostMapping
    public Object pushMsg(@RequestBody Map<String,Object> payload){
        Emitter event_test = socket.emit("event_test", payload);
        return "";
    }
}
