package com.example.my1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin,btnExit ;
    EditText  etPwd, etNum;

    private String number, pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnExit = (Button) findViewById(R.id.btnExit);
        etNum = (EditText) findViewById(R.id.etNum);
        etPwd = (EditText) findViewById(R.id.etPwd);
        TransformationMethod method = PasswordTransformationMethod.getInstance();
        etPwd.setTransformationMethod(method);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ((EditText) findViewById(R.id.etNum)).getText().toString();
                String password = ((EditText) findViewById(R.id.etPwd)).getText().toString();
                if(username.equals("Bruce")&& password.equals("123456")){
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("xxx",username);
                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this,"账号或密码错误，请重新输入",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

