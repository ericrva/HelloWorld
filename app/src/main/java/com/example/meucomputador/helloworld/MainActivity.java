package com.example.meucomputador.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button)findViewById(R.id.btLogin);
        btLogin.setOnClickListener(onClickLogin());
    }

    private View.OnClickListener onClickLogin() {
        return new View.OnClickListener(){
            public void onClick(View v){
                TextView tLogin = (TextView)findViewById(R.id.tLogin);
                TextView tPass = (TextView)findViewById(R.id.tPass);
                String login = tLogin.getText().toString();
                String pass = tPass.getText().toString();

                if (login.equals("Eric") && (pass.equals("123"))){
                    //Navega para a próxima tela
                    Intent intent = new Intent(getContext(), BemVindoActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nome", "Eric Almeida");
                    intent.putExtras(params);
                    startActivity(intent);
                } else {
                    alert("Login e/ou senha incorretos");
                }
            }
        };
    }

    private Context getContext() {
        return this;
    }

    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
