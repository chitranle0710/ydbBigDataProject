package com.example.bigdataprojectuit.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/bigdataprojectuit/presentation/viewmodel/RegisterAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "registerUserUseCase", "Lcom/example/bigdataprojectuit/domain/usecase/RegisterUserUseCase;", "(Lcom/example/bigdataprojectuit/domain/usecase/RegisterUserUseCase;)V", "_obsNavigateToLogin", "Landroidx/lifecycle/MutableLiveData;", "", "obsNavigateToLogin", "Landroidx/lifecycle/LiveData;", "getObsNavigateToLogin", "()Landroidx/lifecycle/LiveData;", "registerAccount", "", "name", "", "userName", "password", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RegisterAccountViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.bigdataprojectuit.domain.usecase.RegisterUserUseCase registerUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _obsNavigateToLogin = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> obsNavigateToLogin = null;
    
    @javax.inject.Inject
    public RegisterAccountViewModel(@org.jetbrains.annotations.NotNull
    com.example.bigdataprojectuit.domain.usecase.RegisterUserUseCase registerUserUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getObsNavigateToLogin() {
        return null;
    }
    
    public final void registerAccount(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}