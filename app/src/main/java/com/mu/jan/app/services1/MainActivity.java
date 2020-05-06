package com.mu.jan.app.services1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mu.jan.app.services1.Models.MyLocalServices;

public class MainActivity extends AppCompatActivity {

    /**
     * Basically, Services are used for background tasks and foreground tasks in activities.
     * Services used in activities for reduce extra time and code.
     *
    */


    private Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button)findViewById(R.id.start_btn);
        stop = (Button)findViewById(R.id.stop_btn);

        /**
         * There are two way to start services
         * 1. call startServices() method to activity.
         * In this case, service started by you and stop iteself. Don't need to stop service , it stop automatically.
         * 2. call bindServices() to start services and call unBindServices() to stop service.
         * In this case, services are not automatically stopped.
         */


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //service started on foreground
                startService(new Intent(MainActivity.this,MyLocalServices.class));
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //service stopped on foreground
                stopService(new Intent(MainActivity.this,MyLocalServices.class));
            }
        });


    }
}
