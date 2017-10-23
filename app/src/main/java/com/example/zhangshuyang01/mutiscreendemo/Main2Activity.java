package com.example.zhangshuyang01.mutiscreendemo;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends LoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        View multiDisabledMessage = findViewById(R.id.warning_multiwindow_disabled);
        // Display an additional message if the app is not in multiwindow mode.
//        if (!isInMultiWindowMode()) {
//            multiDisabledMessage.setVisibility(View.VISIBLE);
//        } else {
//            multiDisabledMessage.setVisibility(View.GONE);
//        }
    }

//    public void onStartUnresizableClick(View view) {
//        Log.d(mLogTag, "** starting UnresizableActivity");
//    }
//
//    public void onStartUnresizableClick(View view) {
//        Log.d(mLogTag, "** starting UnresizableActivity");
//
//        /*
//         * This activity is marked as 'unresizable' in the AndroidManifest. We need to specify the
//         * FLAG_ACTIVITY_NEW_TASK flag here to launch it into a new task stack, otherwise the
//         * properties from the root activity would have been inherited (which was here marked as
//         * resizable by default).
//        */
//        Intent intent = new Intent(this, UnresizableActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(intent);
//    }

    public void onStartMinimumSizeActivity(View view) {
        Log.d(mLogTag, "** starting MinimumSizeActivity");

        startActivity(new Intent(this, MinimumSizeActivity.class));
    }

    public void onStartAdjacentActivity(View view) {
        Log.d(mLogTag, "** starting AdjacentActivity");

        /*
         * Start this activity adjacent to the focused activity (ie. this activity) if possible.
         * Note that this flag is just a hint to the system and may be ignored. For example,
         * if the activity is launched within the same task, it will be launched on top of the
         * previous activity that started the Intent. That's why the Intent.FLAG_ACTIVITY_NEW_TASK
         * flag is specified here in the intent - this will start the activity in a new task.
         */
        Intent intent = new Intent(this, AdjacentActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void onStartLaunchBoundsActivity(View view) {
        Log.d(mLogTag, "** starting LaunchBoundsActivity");

        // Define the bounds in which the Activity will be launched into.
        Rect bounds = new Rect(500, 300, 100, 0);

        // Set the bounds as an activity option.
//        ActivityOptions options = ActivityOptions.makeBasic();
//        options.setLaunchBounds(bounds);

        // Start the LaunchBoundsActivity with the specified options
//        Intent intent = new Intent(this, LaunchBoundsActivity.class);
//        startActivity(intent, options.toBundle());

    }

    public void onStartBasicActivity(View view) {
        Log.d(mLogTag, "** starting BasicActivity");

        // Start an Activity with the default options in the 'singleTask' launch mode as defined in
        // the AndroidManifest.xml.
        startActivity(new Intent(this, BasicActivity.class));

    }

    public void onStartCustomConfigurationActivity(View view) {
        Log.d(mLogTag, "** starting CustomConfigurationChangeActivity");

        // Start an Activity that handles all configuration changes itself.
        startActivity(new Intent(this, CustomConfigurationChangeActivity.class));

    }
}
