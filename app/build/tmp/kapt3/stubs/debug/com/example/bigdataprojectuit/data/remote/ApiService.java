package com.example.bigdataprojectuit.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/bigdataprojectuit/data/remote/ApiService;", "", "addUsers", "Lcom/example/bigdataprojectuit/data/remote/dto/RegisterResponseDto;", "register", "Lcom/example/bigdataprojectuit/data/remote/dto/RegisterUserRequestDto;", "(Lcom/example/bigdataprojectuit/data/remote/dto/RegisterUserRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "", "Lcom/example/bigdataprojectuit/data/remote/dto/UserDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "requestLogin", "Lcom/example/bigdataprojectuit/data/remote/dto/LoginRequest;", "(Lcom/example/bigdataprojectuit/data/remote/dto/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "users")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUsers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.bigdataprojectuit.data.remote.dto.UserDto>> $completion);
    
    @retrofit2.http.POST(value = "adduser")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addUsers(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.data.remote.dto.RegisterUserRequestDto register, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.bigdataprojectuit.data.remote.dto.RegisterResponseDto> $completion);
    
    @retrofit2.http.POST(value = "login")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object login(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.data.remote.dto.LoginRequest requestLogin, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.bigdataprojectuit.data.remote.dto.RegisterResponseDto> $completion);
}