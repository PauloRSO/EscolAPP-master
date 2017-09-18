package br.com.italoqueiroz.escolapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ir para tela de cadastro
    public void executarAcessar(View view){
        Intent intentl = new Intent(getApplicationContext(), Mapas.class);
        startActivity(intentl);
    }




}
