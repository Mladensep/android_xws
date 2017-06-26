package com.example.mladen.xwsclient.dagger;


import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class App extends Application {
    private MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = createComponent();

        Realm.init(this);

        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();

        Realm.setDefaultConfiguration(config);
    }

    protected MyComponent createComponent() {
        return DaggerMyComponent.create();
    }

    public MyComponent getComponent() {
        return component;
    }
}
