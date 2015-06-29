package pethersilva.com.googleanalytics;

import android.app.Application;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * MyApp is responsible to implement some Application behaviours.
 *
 * @author Pether Silva
 */

public class MyApp extends Application {

    /**
     * GoogleAnalytics is a singleton. This class encapsule methods to create Trackers objects.
     * See {@linktourl https://developers.google.com/android/reference/com/google/android/gms/analytics/GoogleAnalytics}
     */
    public static GoogleAnalytics analytics;

    /**
     * Keep and send information to Google Analytics servers.
     * See {@linktourl https://developers.google.com/android/reference/com/google/android/gms/analytics/Tracker}
     */
    public static Tracker tracker;

    @Override
    public void onCreate() {
        super.onCreate();
        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(1800); //Time (in seconds) to application send automatically information to Google Analytics

        tracker = analytics.newTracker("UA-63802374-1"); //Add your Google Analytics here.
        tracker.enableExceptionReporting(true); //If is true. Only the uncaught exceptions will be reported.
        tracker.enableAdvertisingIdCollection(true);//Enable that advertising id and targeting preference should be collected.
        tracker.enableAutoActivityTracking(true);//Specify whether Activity starts should automatically generate screen views from this Tracker.
    }
}