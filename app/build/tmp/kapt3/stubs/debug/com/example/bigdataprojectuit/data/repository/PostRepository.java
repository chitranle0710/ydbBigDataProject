package com.example.bigdataprojectuit.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/bigdataprojectuit/data/repository/PostRepository;", "", "addUser", "Lcom/example/bigdataprojectuit/domain/model/User;", "request", "Lcom/example/bigdataprojectuit/data/remote/dto/RegisterUserRequestDto;", "(Lcom/example/bigdataprojectuit/data/remote/dto/RegisterUserRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PostRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUsers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.bigdataprojectuit.domain.model.User>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addUser(@org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.data.remote.dto.RegisterUserRequestDto request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.bigdataprojectuit.domain.model.User> $completion);
}