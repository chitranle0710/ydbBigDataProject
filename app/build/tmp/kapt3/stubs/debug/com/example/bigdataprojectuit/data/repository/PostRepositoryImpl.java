package com.example.bigdataprojectuit.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/bigdataprojectuit/data/repository/PostRepositoryImpl;", "Lcom/example/bigdataprojectuit/data/repository/PostRepository;", "apiService", "Lcom/example/bigdataprojectuit/data/remote/ApiService;", "(Lcom/example/bigdataprojectuit/data/remote/ApiService;)V", "addUser", "Lcom/example/bigdataprojectuit/domain/model/User;", "request", "Lcom/example/bigdataprojectuit/data/remote/dto/RegisterUserRequestDto;", "(Lcom/example/bigdataprojectuit/data/remote/dto/RegisterUserRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUser", "Lcom/example/bigdataprojectuit/data/remote/dto/LoginRequest;", "(Lcom/example/bigdataprojectuit/data/remote/dto/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PostRepositoryImpl implements com.example.bigdataprojectuit.data.repository.PostRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.bigdataprojectuit.data.remote.ApiService apiService = null;
    
    public PostRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.data.remote.ApiService apiService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUsers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.bigdataprojectuit.domain.model.User>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addUser(@org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.data.remote.dto.RegisterUserRequestDto request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.bigdataprojectuit.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object loginUser(@org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.data.remote.dto.LoginRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.bigdataprojectuit.domain.model.User> $completion) {
        return null;
    }
}