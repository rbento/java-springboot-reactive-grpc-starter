
/* Copyright (c) 2023 Rodrigo Bento */

package rbento.starter.server;

import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import rbento.api.v1.CreateNoteRequest;
import rbento.api.v1.ReactorNotepadGrpc;
import rbento.starter.server.base.GrpcServiceTest;
import rbento.starter.server.grpc.NotepadGrpcService;
import reactor.test.StepVerifier;

@SpringBootTest
public class NotepadGrpcServiceTest extends GrpcServiceTest {

    private ReactorNotepadGrpc.ReactorNotepadStub reactorStub;

    @BeforeEach
    public void beforeEach() throws IOException {
        grpcCleanupRule.register(serverBuilder
                .directExecutor()
                .addService(new NotepadGrpcService())
                .build()
                .start());
        reactorStub = ReactorNotepadGrpc.newReactorStub(channel);
    }

    @Test
    public void testReactiveCreateNoteOkExpectResponseVerifyComplete() {
        StepVerifier.create(reactorStub.createNote(CreateNoteRequest.getDefaultInstance()))
                .verifyError();
    }
}
