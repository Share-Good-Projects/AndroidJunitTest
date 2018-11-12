package com.hrbing.test.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.hrbing.test.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage();
    }

    public void showMessage() {
        Toast.makeText(this,"MainActivity seccussful",Toast.LENGTH_SHORT).show();
        Log.d("ddd", "-----------------------test mainActivyt seccussful-------------------------------");
    }
}
