
/* Copyright (c) 2023 Rodrigo Bento */

package rbento.starter.server.grpc;

import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import rbento.api.v1.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@GRpcService
public class NotepadGrpcService extends ReactorNotepadGrpc.NotepadImplBase {

    @Override
    public Mono<Note> createNote(Mono<CreateNoteRequest> request) {
        return super.createNote(request);
    }

    @Override
    public Mono<Note> readNote(Mono<ReadNoteRequest> request) {
        return super.readNote(request);
    }

    @Override
    public Mono<Note> updateNote(Mono<UpdateNoteRequest> request) {
        return super.updateNote(request);
    }

    @Override
    public Mono<Note> deleteNote(Mono<DeleteNoteRequest> request) {
        return super.deleteNote(request);
    }

    @Override
    public Flux<Note> listNotes(Mono<ListNoteRequest> request) {
        return super.listNotes(request);
    }
}
