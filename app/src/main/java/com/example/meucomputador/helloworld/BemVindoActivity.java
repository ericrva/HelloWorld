package com.example.meucomputador.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BemVindoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        //Recebe o nome enviado por parâmetro
        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");

        //Atualiza o texto do TextView com uma mensagem de bem-vindo
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(nome + " seja bem-vindo");
    }
}
