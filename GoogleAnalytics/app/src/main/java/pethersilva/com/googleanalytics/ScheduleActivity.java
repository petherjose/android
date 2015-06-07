package pethersilva.com.googleanalytics;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ScheduleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setSubtitle(getString(R.string.subtitle_toolbar));
        toolbar.setTitle(getString(R.string.title_toolbar));
        toolbar.setNavigationIcon(android.R.drawable.ic_media_previous);
        setSupportActionBar(toolbar);
    }
}
