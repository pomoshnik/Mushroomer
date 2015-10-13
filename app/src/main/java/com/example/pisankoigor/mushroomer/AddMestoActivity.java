package com.example.pisankoigor.mushroomer;

import android.os.Bundle;
import android.app.Activity;

public class AddMestoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mesto);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
