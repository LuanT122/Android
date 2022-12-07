package com.example.register;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText FirstName, LastName,BirthDay,Address,Email,KetQua;
    Button Register;

    RadioButton Male,Female;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);



        assignId(FirstName,R.id.FirstName);
        assignId(LastName,R.id.LastName);
        assignId(KetQua,R.id.KetQua);
        assignId(BirthDay,R.id.TextViewBirthday);
        assignId(Address,R.id.textViewAddress);
        assignId(Email,R.id.TextViewEmail);

        String FName = String.valueOf(FirstName.getText());
        String LName = String.valueOf(LastName.getText());
        String BDay = String.valueOf(BirthDay.getText());
        String AD = String.valueOf(Address.getText());
        String EMail = String.valueOf(Email.getText());




        Register = findViewById(R.id.RegisterButton);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(FName != null && LName != null && BDay != null && AD!=null && EMail != null && Male.isChecked()|| Female.isChecked()){
                    KetQua.setText("Dang ki thanh cong");
                }
                else {
                    KetQua.setText("Hay Dien day du thong tin");
                }
            }
        });

    }

    void assignId(TextView tv,int id){
        tv = findViewById(id);

    }

    @Override
    public void onClick(View v) {

    }
}