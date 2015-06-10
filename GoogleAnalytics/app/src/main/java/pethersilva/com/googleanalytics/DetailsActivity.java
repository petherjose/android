package pethersilva.com.googleanalytics;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/*
    Activity class just to show how the Google Analytics track all behaviour in onCreate and onDestroy methods
 */
public class DetailsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Set a toolbar to replace the action bar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.title_toolbar));
        toolbar.setSubtitle(getString(R.string.subtitle_toolbar));
        toolbar.setNavigationIcon(android.R.drawable.ic_media_previous);
        setSupportActionBar(toolbar);
    }
}