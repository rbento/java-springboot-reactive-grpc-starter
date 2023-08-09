
/* Copyright (c) 2023 Rodrigo Bento */

package rbento.starter.client;

import lombok.extern.slf4j.Slf4j;
import rbento.api.v1.ListNoteRequest;
import rbento.starter.client.grpc.NotepadGrpcClient;

@Slf4j
public class Client {

    private static final String HOST = "localhost";
    private static final int PORT = 6565;

    public static void main(String[] args) {

        log.info("Starting gRPC Client...");

        NotepadGrpcClient client = new NotepadGrpcClient(HOST, PORT);
        log.info("client: {}", client);

        ListNoteRequest request = ListNoteRequest.newBuilder().build();
        log.info("request: {}", request);

        log.info("Done");
    }
}
