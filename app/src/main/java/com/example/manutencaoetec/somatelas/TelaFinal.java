package com.example.manutencaoetec.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class TelaFinal extends AppCompatActivity {
    TextView lblResultado;
    Button btnVoltar;
    double num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);
        Intent intent = getIntent();
        num1 = Double.valueOf(intent.getStringExtra("Num1"));
        num2 = Double.valueOf(intent.getStringExtra("Num2"));
        lblResultado = (TextView)findViewById(R.id.lblResultado);
        lblResultado.setText(new Util().Teste(num1 + num2));
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(clickListener);
    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(TelaFinal.this, Tela1.class);
            startActivity(intent);
        }
    };


}
