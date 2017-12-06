package com.example.meucomputador.helloworld;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

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

        //Adiciona o botão "up navigation"
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
            return true;
        } else if (id == R.id.action_search){
            toast("Clicou no Seach!");
        } else if (id == R.id.action_refresh){
            toast("Clicou no Refresh!");
        } else if(id == R.id.action_settings){
            toast("Clicou no Settings");
        }
        return super.onOptionsItemSelected(item);
    }

    private void toast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        //Infla o menu com os botões da action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
