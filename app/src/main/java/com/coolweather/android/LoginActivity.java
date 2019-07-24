package com.coolweather.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Window;

public class LoginActivity extends AppCompatActivity {

    private EditText Username, Password;

    private Button Login;

    private String UsernameValue, PasswordValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

//去除标题  
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

//获得实例对象  

        Username = (EditText) findViewById(R.id.et_zh);
        Password = (EditText) findViewById(R.id.et_mima);
        Login = (Button) findViewById(R.id.btn_login);




        //super.onCreate(savedInstanceState);
       //setContentView(R.layout.activity_login);

        /*Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }

        });*/

// 登录监听事件  现在默认为用户名为：wang 密码：123  
        Login.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                UsernameValue = Username.getText().toString();
                PasswordValue = Password.getText().toString();

                if (UsernameValue.equals("wang") && PasswordValue.equals("123")) {
                    Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();

//跳转界面  
                    Intent intent = new Intent(LoginActivity.this, WeatherActivity.class);
                    LoginActivity.this.startActivity(intent);
//finish();  

                } else {

                    Toast.makeText(LoginActivity.this, "The username or password is incorrect, please login again", Toast.LENGTH_LONG).show();
                }

            }

        });


    }
}

