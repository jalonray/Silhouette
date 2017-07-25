package com.silhouette.jalon.silhouette;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.silhouette.jalon.monitor.logcat.LogCat;
import com.silhouette.jalon.monitor.logcat.LogcatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.toLogCat)
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toLogCat:
                Intent intent = new Intent(this, LogcatActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
