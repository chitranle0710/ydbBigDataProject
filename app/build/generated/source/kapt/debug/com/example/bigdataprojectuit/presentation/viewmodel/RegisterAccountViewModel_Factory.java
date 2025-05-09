// Generated by Dagger (https://dagger.dev).
package com.example.bigdataprojectuit.presentation.viewmodel;

import com.example.bigdataprojectuit.domain.usecase.RegisterUserUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RegisterAccountViewModel_Factory implements Factory<RegisterAccountViewModel> {
  private final Provider<RegisterUserUseCase> registerUserUseCaseProvider;

  public RegisterAccountViewModel_Factory(
      Provider<RegisterUserUseCase> registerUserUseCaseProvider) {
    this.registerUserUseCaseProvider = registerUserUseCaseProvider;
  }

  @Override
  public RegisterAccountViewModel get() {
    return newInstance(registerUserUseCaseProvider.get());
  }

  public static RegisterAccountViewModel_Factory create(
      Provider<RegisterUserUseCase> registerUserUseCaseProvider) {
    return new RegisterAccountViewModel_Factory(registerUserUseCaseProvider);
  }

  public static RegisterAccountViewModel newInstance(RegisterUserUseCase registerUserUseCase) {
    return new RegisterAccountViewModel(registerUserUseCase);
  }
}
