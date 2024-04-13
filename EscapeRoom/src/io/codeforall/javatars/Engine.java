package io.codeforall.javatars;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Engine {

    private static int PORT = 9000;
    private ExecutorService service = Executors.newFixedThreadPool(2);
    public ArrayList<Player> playerSocket = new ArrayList<>();

    public Engine() {
        init();
    }


    public void init() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            Socket teamSocket;
            System.out.println("The port number is: " + PORT);

            while (true) {
                teamSocket = serverSocket.accept();

                Player player = new Player(teamSocket, this);
                this.playerSocket.add(player);

                if(playerSocket.size() == 1){
                    PrintWriter out = new PrintWriter(playerSocket.get(0).getSocket().getOutputStream(), true);
                    out.println("\nWaiting for the other team to join");
                }
                if (playerSocket.size() == 2) {
                    service.submit(playerSocket.get(0));
                    service.submit(playerSocket.get(1));
                }
                if (playerSocket.size() > 2) {
                    PrintWriter out = new PrintWriter(playerSocket.get(2).getSocket().getOutputStream(), true);
                    out.println("The teams are full");
                    playerSocket.remove(2);
                    out.close();
                    teamSocket.close();
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR INIT " + e);
        }
    }



    public void broadcast(String input, Player player) {
        for (int i = 0; i < playerSocket.size(); i++) {
            if (playerSocket.get(i).equals(player)) {
                continue;
            }
            try {
                PrintWriter out = new PrintWriter(playerSocket.get(i).getSocket().getOutputStream(), true);
                out.println(input);
            } catch (IOException e) {
                System.out.println("ERROR BROADCAST" + e);
            }
        }
    }


    public static void main(String[] args) {
        new Engine();
    }
}
