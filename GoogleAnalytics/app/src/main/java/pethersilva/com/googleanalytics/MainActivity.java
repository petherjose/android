package pethersilva.com.googleanalytics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

/*
    Activity class just to show how the Google Analytics track all behaviour in onCreate and onDestroy methods
 */
public class MainActivity extends BaseActivity {

    private Button btnDetails;
    private Button btnSheduling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDetails = (Button)findViewById(R.id.details_activity);

        btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                startActivity(intent);
            }
        });

        btnSheduling = (Button) findViewById(R.id.scheduling_activity);
        btnSheduling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(intent);
            }
        });

        // Set a toolbar to replace the action bar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.title_toolbar));
        toolbar.setSubtitle(getString(R.string.subtitle_toolbar));
        setSupportActionBar(toolbar);
    }
}