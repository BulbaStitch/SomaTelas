package com.example.manutencaoetec.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {
    EditText txtNum1;
    Button btnEnviar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        btnEnviar1 = (Button) findViewById(R.id.btnEnviar1);
        btnEnviar1.setOnClickListener(clickListener);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!TextUtils.isEmpty(txtNum1.getText())){
                if(txtNum1.getText().toString().startsWith(".")) txtNum1.setText(txtNum1.getText().insert(0, "0"));
                if(txtNum1.getText().toString().endsWith(".")) txtNum1.setText(txtNum1.getText().insert(txtNum1.getText().length(), "0"));
                Intent intent = new Intent(Tela1.this, Tela2.class);
                intent.putExtra("Num1", txtNum1.getText().toString());
                startActivity(intent);
            }else {
                txtNum1.setError("Digite algum número para continuar");
            }
        }
    };
}
