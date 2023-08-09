
/* Copyright (c) 2023 Rodrigo Bento */

package rbento.starter.client.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import rbento.api.v1.ReactorNotepadGrpc;

@Slf4j
public class NotepadGrpcClient {
    private final ReactorNotepadGrpc.ReactorNotepadStub reactorStub;

    public NotepadGrpcClient(final String host, final int port) {
        ManagedChannel channel =
                ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.reactorStub = ReactorNotepadGrpc.newReactorStub(channel);
    }
}
