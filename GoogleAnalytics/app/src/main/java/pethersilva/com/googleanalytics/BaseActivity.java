package pethersilva.com.googleanalytics;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.google.android.gms.analytics.HitBuilders;

/**
 * BaseActivity is responsible to implement all behaviours that all Activities should have.
 * Less code. Less bugs.
 *
 * @author Pether Silva
 */

public class BaseActivity extends ActionBarActivity {

    /*
     * Overriding onCreate method to Google Analylitics track when an Activity was created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Calling tracker method to send information to Google Analytics
        MyApp.tracker.setScreenName("OnCreate: " + this.getClass().getName());
        MyApp.tracker.send(new HitBuilders.EventBuilder()
                .setCategory("My Category")
                .setAction("My Action")
                .setLabel("My Label")
                .build());
    }

    /*
    * Overriding onDestroy method to Google Analylitics track when an Activity was destroyed.
    */
    @Override
    protected void onDestroy() {
        super.onDestroy();

        //Calling tracker method to send information to Google Analytics
        MyApp.tracker.setScreenName("OnDestroy: " + this.getClass().getName());
        MyApp.tracker.send(new HitBuilders.EventBuilder()
                .setCategory("My Category")
                .setAction("My Action")
                .setLabel("My Label")
                .build());
    }
}