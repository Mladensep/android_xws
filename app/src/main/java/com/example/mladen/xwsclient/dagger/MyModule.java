package com.example.mladen.xwsclient.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

@Module
public class MyModule {

    @Provides
    @Singleton
    public Realm provideMyDatabeseInstance() {
        return Realm.getDefaultInstance();
    }
}
