package CO6;
import java.io.*;
import java.net.*;

public class udp_client {
    public static void main(String[] args) throws IOException {
        DatagramSocket client= new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        String str ="Hello Server";
        byte[] bufBytes = str.getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,8760);
        client.send(datagramPacket);
        client.close();
    }

}