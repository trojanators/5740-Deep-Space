package main.java.com.DsClient.udp;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class server{
    private DatagramSocket udpSocket;
    private int port = 5100;
 
    public server(int port) throws SocketException, IOException {
        this.port = port;
        this.udpSocket = new DatagramSocket(this.port);
    }
    private void listen() throws IOException {
        System.out.println("-- Running Server at " + InetAddress.getLocalHost() + "--");
        String msg;
        
        while (true) {
            
            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            
            // blocks until a packet is received
            udpSocket.receive(packet);
            msg = new String(packet.getData()).trim();
            
            System.out.println(
                "Message from " + packet.getAddress().getHostAddress() + ": " + msg);
        }
    }
    
    public static void main(String[] args) throws Exception {
        server client = new server(Integer.parseInt(args[0]));
        
        client.listen();
    }

}