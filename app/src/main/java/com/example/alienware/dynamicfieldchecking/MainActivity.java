package com.example.alienware.dynamicfieldchecking;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    EditText password, confirm_password;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = (EditText)findViewById(R.id.password);
        confirm_password = (EditText)findViewById(R.id.confirm_password);
        relativeLayout = (RelativeLayout)findViewById(R.id.activity_main);

        confirm_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(confirm_password.getText().toString().equals(""))
                    relativeLayout.setBackgroundColor(getResources().getColor(R.color.unknown));



                if(password.getText().toString().equals(confirm_password.getText().toString()))
                    relativeLayout.setBackgroundColor(getResources().getColor(R.color.correct));
                else relativeLayout.setBackgroundColor(getResources().getColor(R.color.incorrect));

            }
        });


    }

    void setBG(int color){
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);

    }
}
