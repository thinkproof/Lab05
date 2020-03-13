package com.lingevan.lab05;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView createlife;
    TextView createcur;
    TextView restartlife;
    TextView restartcur;
    TextView startlife;
    TextView startcur;
    TextView destroylife;
    TextView destroycur;
    TextView resumelife;
    TextView resumecur;
    TextView pauselife;
    TextView pausecur;
    TextView stoplife;
    TextView stopcur;

    SharedPreferences mPreferences;
    SharedPreferences.Editor Editor;

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;

    int acur;
    int bcur;
    int ccur;
    int dcur;
    int ecur;
    int fcur;
    int gcur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createlife = findViewById(R.id.textLabel2);
        createcur = findViewById(R.id.textLabel2a);
        startlife = findViewById(R.id.textLabel3);
        startcur = findViewById(R.id.textLabel3a);
        resumelife = findViewById(R.id.textLabel4);
        resumecur = findViewById(R.id.textLabel4a);
        pauselife = findViewById(R.id.textLabel5);
        pausecur = findViewById(R.id.textLabel5a);
        stoplife = findViewById(R.id.textLabel6);
        stopcur = findViewById(R.id.textLabel6a);
        restartlife = findViewById(R.id.textLabel7);
        restartcur = findViewById(R.id.textLabel7a);
        destroylife = findViewById(R.id.textLabel8);
        destroycur = findViewById(R.id.textLabel8a);

        mPreferences = getSharedPreferences("com.lingevan.lab05.sharedprefs",MODE_PRIVATE);

        a = mPreferences.getInt("createlife", 0);
        b = mPreferences.getInt("restartlife", 0);
        c = mPreferences.getInt("startlife", 0);
        d = mPreferences.getInt("destroylife", 0);
        e = mPreferences.getInt("resumelife", 0);
        f = mPreferences.getInt("pauselife", 0);
        g = mPreferences.getInt("stoplife", 0);

        Editor = mPreferences.edit();

        restartlife.setText("onRestart(): " + b);
        startlife.setText("onStart(): " + c);
        destroylife.setText("onDestroy(): " + d);
        resumelife.setText("onResume(): " + e);
        pauselife.setText("onPause(): " + f);
        stoplife.setText("onStop(): " + g);

        a++;
        acur++;
        Editor.putInt("createlife", a);
        Editor.apply();
        createlife.setText("onCreate(): " + a);
        createcur.setText("onCreate(): " + acur);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        b++;
        bcur++;
        Editor.putInt("restartlife", b);
        Editor.apply();
        restartlife.setText("onRestart(): " + b);
        restartcur.setText("onRestart(): " + bcur);
    }
    @Override
    protected void onStart() {
        super.onStart();
        c++;
        ccur++;
        Editor.putInt("startlife", c);
        Editor.apply();
        startlife.setText("onStart(): " + c);
        startcur.setText("onStart(): " + ccur);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        d++;
        dcur++;
        Editor.putInt("destroylife", d);
        Editor.apply();
        destroylife.setText("onDestroy(): " + d);

        destroycur.setText("onDestroy(): " + dcur);
    }
    @Override
    protected void onResume() {
        super.onResume();
        e++;
        ecur++;
        Editor.putInt("resumelife", e);
        Editor.apply();
        resumelife.setText("onResume(): " + e);
        resumecur.setText("onResume(): " + ecur);
    }
    @Override
    protected void onPause() {
        super.onPause();
        f++;
        fcur++;
        Editor.putInt("pauselife", f);
        Editor.apply();
        pauselife.setText("onPause(): " + f);
        pausecur.setText("onPause(): " + fcur);
    }
    @Override
    protected void onStop() {
        super.onStop();
        g++;
        gcur++;
        Editor.putInt("stoplife", g);
        Editor.apply();
        stoplife.setText("onStop(): " + g);
        stopcur.setText("onStop(): " + gcur);
    }
}