// Generated by Dagger (https://dagger.dev).
package com.github.owlruslan.rider.ui.modes.driver.ride;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RideDriverFragment_Factory implements Factory<RideDriverFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<RideDriverContract.Presenter> presenterProvider;

  public RideDriverFragment_Factory(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RideDriverContract.Presenter> presenterProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public RideDriverFragment get() {
    RideDriverFragment instance = newInstance();
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    RideDriverFragment_MembersInjector.injectPresenter(instance, presenterProvider.get());
    return instance;
  }

  public static RideDriverFragment_Factory create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RideDriverContract.Presenter> presenterProvider) {
    return new RideDriverFragment_Factory(androidInjectorProvider, presenterProvider);
  }

  public static RideDriverFragment newInstance() {
    return new RideDriverFragment();
  }
}