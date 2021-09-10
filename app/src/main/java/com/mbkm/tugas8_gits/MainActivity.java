package com.mbkm.tugas8_gits;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.dd.processbutton.iml.ActionProcessButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText mNamaLengkap;
    private TextInputEditText mEmail;
    private TextInputEditText mPassword;
    private ActionProcessButton mDeleteAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNamaLengkap = (TextInputEditText) findViewById(R.id.namaLengkap);
        mEmail = (TextInputEditText) findViewById(R.id.email);
        mPassword = (TextInputEditText) findViewById(R.id.password);
        mDeleteAll = (ActionProcessButton) findViewById(R.id.deleteAll);

        Handler handler = new Handler();

        mDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDeleteAll.setMode(ActionProcessButton.Mode.PROGRESS);
                mDeleteAll.setProgress(0);
                mNamaLengkap.setText("");
                mEmail.setText("");
                mPassword.setText("");
                mDeleteAll.setProgress(100);

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mDeleteAll.setProgress(0);
                    }
                }, 2000);
            }
        });
    }
}