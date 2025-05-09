// Generated by Dagger (https://dagger.dev).
package com.example.bigdataprojectuit.domain.usecase;

import com.example.bigdataprojectuit.data.repository.PostRepository;
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
public final class RegisterUserUseCase_Factory implements Factory<RegisterUserUseCase> {
  private final Provider<PostRepository> repositoryProvider;

  public RegisterUserUseCase_Factory(Provider<PostRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RegisterUserUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static RegisterUserUseCase_Factory create(Provider<PostRepository> repositoryProvider) {
    return new RegisterUserUseCase_Factory(repositoryProvider);
  }

  public static RegisterUserUseCase newInstance(PostRepository repository) {
    return new RegisterUserUseCase(repository);
  }
}
