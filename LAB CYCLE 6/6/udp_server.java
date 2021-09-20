package CO6;
import java.io.*;
import java.net.*;

public class udp_server {
    public static void main(String[] args) throws IOException {
        DatagramSocket server=new DatagramSocket(8760);
        byte[] buf=new byte[256];
        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        server.receive(packet);
        String reply =new String(packet.getData());
        System.out.println("\n Client Says : "+reply);
        server.close();
    }

}