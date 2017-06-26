package com.example.mladen.xwsclient.dagger;

import com.example.mladen.xwsclient.activity.SpisakOdabranihProizvoda;
import com.example.mladen.xwsclient.activity.UplatnicaActivity;
import com.example.mladen.xwsclient.activity.article1.ActivityFrizider1;
import com.example.mladen.xwsclient.activity.article1.ActivityFrizider2;
import com.example.mladen.xwsclient.activity.article1.ActivityFrizider3;
import com.example.mladen.xwsclient.activity.article1.ActivitySporet1;
import com.example.mladen.xwsclient.activity.article1.ActivitySporet2;
import com.example.mladen.xwsclient.activity.article1.ActivitySporet3;
import com.example.mladen.xwsclient.activity.article1.ActivityVMasina1;
import com.example.mladen.xwsclient.activity.article1.ActivityVMasina2;
import com.example.mladen.xwsclient.activity.article1.ActivityVMasina3;
import com.example.mladen.xwsclient.activity.article1.ActivityVMasina4;
import com.example.mladen.xwsclient.activity.article1.ActivityZamrzivac1;
import com.example.mladen.xwsclient.activity.article1.ActivityZamrzivac2;
import com.example.mladen.xwsclient.activity.article1.ActivityZamrzivac3;
import com.example.mladen.xwsclient.activity.article2_it.ActivityLaptop1;
import com.example.mladen.xwsclient.activity.article2_it.ActivityLaptop2;
import com.example.mladen.xwsclient.activity.article2_it.ActivityLaptop3;
import com.example.mladen.xwsclient.activity.article2_it.ActivityMobilni1;
import com.example.mladen.xwsclient.activity.article2_it.ActivityMobilni2;
import com.example.mladen.xwsclient.activity.article2_it.ActivityMobilni3;
import com.example.mladen.xwsclient.activity.article2_it.ActivityMobilni4;
import com.example.mladen.xwsclient.activity.article2_it.ActivityTablet1;
import com.example.mladen.xwsclient.activity.article2_it.ActivityTablet2;
import com.example.mladen.xwsclient.activity.article3_foto.Fotoaparat1;
import com.example.mladen.xwsclient.activity.article3_foto.Fotoaparat2;
import com.example.mladen.xwsclient.activity.article3_foto.Fotoaparat3;
import com.example.mladen.xwsclient.activity.article3_foto.Kamera1;
import com.example.mladen.xwsclient.activity.article3_foto.Kamera2;
import com.example.mladen.xwsclient.activity.article3_foto.Kamera3;
import com.example.mladen.xwsclient.activity.article4_tv.DO1;
import com.example.mladen.xwsclient.activity.article4_tv.DO2;
import com.example.mladen.xwsclient.activity.article4_tv.DO3;
import com.example.mladen.xwsclient.activity.article4_tv.TV1;
import com.example.mladen.xwsclient.activity.article4_tv.TV2;
import com.example.mladen.xwsclient.activity.article4_tv.TV3;
import com.example.mladen.xwsclient.activity.article5_kua.Lampa1;
import com.example.mladen.xwsclient.activity.article5_kua.Lampa2;
import com.example.mladen.xwsclient.activity.article5_kua.Pegla1;
import com.example.mladen.xwsclient.activity.article5_kua.Pegla2;
import com.example.mladen.xwsclient.activity.article5_kua.US1;
import com.example.mladen.xwsclient.activity.article5_kua.US2;
import com.example.mladen.xwsclient.activity.article6_tr.Grejalica1;
import com.example.mladen.xwsclient.activity.article6_tr.Grejalica2;
import com.example.mladen.xwsclient.activity.article6_tr.Grejalica3;
import com.example.mladen.xwsclient.activity.article6_tr.Klima1;
import com.example.mladen.xwsclient.activity.article6_tr.Klima2;
import com.example.mladen.xwsclient.activity.article6_tr.Klima3;
import com.example.mladen.xwsclient.activity.article7_do.Sat1;
import com.example.mladen.xwsclient.activity.article7_do.Sat2;
import com.example.mladen.xwsclient.activity.article7_do.Slusalice1;
import com.example.mladen.xwsclient.activity.article7_do.Slusalice2;
import com.example.mladen.xwsclient.activity.article7_do.Stampac1;
import com.example.mladen.xwsclient.activity.article7_do.Stampac2;
import com.example.mladen.xwsclient.activity.article7_do.USB1;
import com.example.mladen.xwsclient.activity.article7_do.USB2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(ActivityFrizider1 activityFrizider1);

    void inject(ActivityFrizider2 activityFrizider2);

    void inject(ActivityFrizider3 activityFrizider3);

    void inject(ActivityVMasina1 activityVMasina1);

    void inject(ActivityVMasina2 activityVMasina2);

    void inject(ActivityVMasina3 activityVMasina3);

    void inject(ActivityVMasina4 activityVMasina4);

    void inject(ActivitySporet1 activitySporet1);

    void inject(ActivitySporet2 activitySporet2);

    void inject(ActivitySporet3 activitySporet3);

    void inject(ActivityZamrzivac1 activityZamrzivac1);

    void inject(ActivityZamrzivac2 activityZamrzivac2);

    void inject(ActivityZamrzivac3 activityZamrzivac3);

    void inject(SpisakOdabranihProizvoda spisakOdabranihProizvoda);

    void inject(ActivityLaptop1 activityLaptop1);

    void inject(ActivityLaptop2 activityLaptop2);

    void inject(ActivityLaptop3 activityLaptop3);

    void inject(ActivityMobilni1 activityMobilni1);

    void inject(ActivityMobilni2 activityMobilni2);

    void inject(ActivityMobilni3 activityMobilni3);

    void inject(ActivityMobilni4 activityMobilni4);

    void inject(ActivityTablet1 activityTablet1);

    void inject(ActivityTablet2 activityTablet2);

    void inject(Fotoaparat1 fotoaparat1);

    void inject(Fotoaparat2 fotoaparat2);

    void inject(Fotoaparat3 fotoaparat3);

    void inject(Kamera1 kamera1);

    void inject(Kamera2 kamera2);

    void inject(Kamera3 kamera3);

    void inject(DO1 do1);

    void inject(DO2 do2);

    void inject(DO3 do3);

    void inject(TV1 tv1);

    void inject(TV2 tv2);

    void inject(TV3 tv3);

    void inject(Lampa1 lampa1);

    void inject(Lampa2 lampa2);

    void  inject(Pegla1 pegla1);

    void inject(Pegla2 pegla2);

    void inject(US1 us1);

    void inject(US2 us2);

    void inject(Grejalica1 grejalica1);

    void inject(Grejalica2 grejalica2);

    void inject(Grejalica3 grejalica3);

    void inject(Klima1 klima1);

    void inject(Klima2 klima2);

    void inject(Klima3 klima3);

    void inject(Sat1 sat1);

    void inject(Sat2 sat2);

    void inject(Slusalice1 slusalice1);

    void inject(Slusalice2 slusalice2);

    void inject(Stampac1 stampac1);

    void inject(Stampac2 stampac2);

    void inject(USB1 usb1);

    void inject(USB2 usb2);

    void inject(UplatnicaActivity uplatnicaActivity);
}
