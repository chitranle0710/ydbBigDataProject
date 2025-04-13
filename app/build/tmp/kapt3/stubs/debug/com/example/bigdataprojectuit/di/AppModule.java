package com.example.bigdataprojectuit.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/bigdataprojectuit/di/AppModule;", "", "()V", "provideApiService", "Lcom/example/bigdataprojectuit/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideGetPostsUseCase", "Lcom/example/bigdataprojectuit/domain/usecase/GetUsersListUseCase;", "repository", "Lcom/example/bigdataprojectuit/data/repository/PostRepository;", "providePostRepository", "apiService", "provideRetrofit", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.bigdataprojectuit.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.bigdataprojectuit.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.bigdataprojectuit.data.repository.PostRepository providePostRepository(@org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.data.remote.ApiService apiService) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.bigdataprojectuit.domain.usecase.GetUsersListUseCase provideGetPostsUseCase(@org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.data.repository.PostRepository repository) {
        return null;
    }
}