package com.sorte.sorte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Login extends AppCompatActivity {

    EditText email_login, senha_login;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img = findViewById(R.id.idLogo);
        email_login = findViewById(R.id.edt_email_login);
        senha_login = findViewById(R.id.edt_senha_login);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Home.class);
                startActivity(i);
                finish();
            }
        });

    }

    public void intentCadastro(View view) {
        Intent i = new Intent(getApplicationContext(), Cadastro.class);
        startActivity(i);
    }

    public void act_btn_acessar(View view) {
        String aa_email = email_login.getText().toString();
        String aa_senha = senha_login.getText().toString();

        String type = "login";

        if (aa_email.isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(aa_email).matches()){
            email_login.setError("Campo vazio ou inválido!");
            email_login.requestFocus();
        } else if (aa_senha.isEmpty()||aa_senha.length()<5){
            senha_login.setError("Campo vazio ou inválido!");
            senha_login.requestFocus();
        }



        if (    Patterns.EMAIL_ADDRESS.matcher(aa_email).matches() &&
                aa_senha.length()>=5){
            BackgroundWorker backgroundWorker = new BackgroundWorker(this);
            backgroundWorker.execute(type, aa_email, aa_senha);
        }
    }
}