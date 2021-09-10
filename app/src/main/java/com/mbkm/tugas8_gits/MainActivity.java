package com.mbkm.tugas8_gits;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText mNamaLengkap;
    private TextInputEditText mEmail;
    private TextInputEditText mPassword;
    private Button mDeleteAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNamaLengkap = (TextInputEditText) findViewById(R.id.namaLengkap);
        mEmail = (TextInputEditText) findViewById(R.id.email);
        mPassword = (TextInputEditText) findViewById(R.id.password);
        mDeleteAll = (Button) findViewById(R.id.deleteAll);

        mDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNamaLengkap.setText("");
                mEmail.setText("");
                mPassword.setText("");
            }
        });
    }
}