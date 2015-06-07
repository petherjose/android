package pethersilva.com.googleanalytics;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class DetailsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Set a toolbar to replace the action bar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.title_toolbar));
        toolbar.setSubtitle(getString(R.string.subtitle_toolbar));
        toolbar.setNavigationIcon(android.R.drawable.btn_minus);
        setSupportActionBar(toolbar);
    }
}