package pethersilva.com.googleanalytics;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.google.android.gms.analytics.HitBuilders;

public class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyApp.tracker.setScreenName("OnCreate: " + this.getClass().getName());
        MyApp.tracker.send(new HitBuilders.EventBuilder()
                     .setCategory("My Category")
                     .setAction("My Action")
                     .setLabel("My Label")
                     .build());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        MyApp.tracker.setScreenName("OnDestroy: " + this.getClass().getName());
        MyApp.tracker.send(new HitBuilders.EventBuilder()
                .setCategory("My Category")
                .setAction("My Action")
                .setLabel("My Label")
                .build());
    }
}
