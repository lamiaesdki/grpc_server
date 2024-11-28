package org.xproce.server;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.xproce.service.BankGrpcService;
import java.io.IOException;
public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Build and start the server
        Server server = ServerBuilder.forPort(5555)
                .addService(new BankGrpcService())
                .build();

        System.out.println("Server started, listening on port 5555"); // Add this line to log the start
        server.start();
        server.awaitTermination();
    }
}
