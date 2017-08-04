package com.ytx.push;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et_input;
    private EditText et_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input = (EditText) this.findViewById(R.id.et_input);
        et_output = (EditText) this.findViewById(R.id.et_output);
    }

    public void mStart(View btn) {
        final String inputUrl = Environment.getExternalStorageDirectory().getPath() + "/" + et_input.getText().toString();
        final String outputUrl = et_output.getText().toString();
        new Thread(new Runnable() {
            @Override
            public void run() {
                FFmpegUtils.push(inputUrl, outputUrl);
            }
        }).start();

    }

}
