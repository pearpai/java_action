package com.action.netty3.action.chapter4;

import io.netty.util.CharsetUtil;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 15. 5月 2020 10:01 上午
 */
public class PlainOioServer {

    public void serve(int port) throws IOException {

        // 将服务器绑定到指定端口
        final ServerSocket socket = new ServerSocket(port);

        try {
            for (; ; ) {
                // 接受连接
                final Socket clientSocket = socket.accept();
                System.out.println("Accepted connection from " + clientSocket);
                // 创建一个新的线程来处理改连接
                // 启动线程
                new Thread(() -> {
                    OutputStream out;
                    try {
                        // 将消息写给已连接的客户端
                        out = clientSocket.getOutputStream();
                        out.write("Hi!\r\n".getBytes(CharsetUtil.UTF_8));
                        out.flush();
                        // 关闭连接
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            clientSocket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }).start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
