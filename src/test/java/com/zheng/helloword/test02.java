package com.zheng.helloword;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class test02 {
    //第二次修改
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(1000);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
        socket.receive(packet);
        int length = packet.getLength();
        System.out.println(new String(bytes, 0, length));
        socket.close();
    }
}
