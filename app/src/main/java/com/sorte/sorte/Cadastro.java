package com.sorte.sorte;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.github.rtoshiro.util.format.MaskFormatter;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Cadastro extends AppCompatActivity {

    EditText nome_cad;
    EditText sobrenome_cad;
    EditText aniversario_cad;
    EditText telefone_cad;
    EditText cpf_cad;
    EditText email_cad;
    EditText senha_cad;
    EditText rpt_senha_cad;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome_cad        = findViewById(R.id.cad_nome);
        sobrenome_cad   = findViewById(R.id.cad_sobrenome);
        aniversario_cad = findViewById(R.id.cad_aniversario);
        telefone_cad    = findViewById(R.id.cad_telefone);
        cpf_cad         = findViewById(R.id.cad_cpf);
        email_cad       = findViewById(R.id.cad_email);
        senha_cad       = findViewById(R.id.cad_senha);
        rpt_senha_cad   = findViewById(R.id.cad_rpt_senha);

        //formatando a mascara para data
        SimpleMaskFormatter smf_data = new SimpleMaskFormatter("NN/NN/NNNN");
        //assistindo o texto e inserindo no momento digitado de acordo com a mascara
        final MaskTextWatcher mtw_data = new MaskTextWatcher(aniversario_cad,smf_data);
        aniversario_cad.addTextChangedListener(mtw_data);

        //formatando a mascara para telefone
        SimpleMaskFormatter smf_fone = new SimpleMaskFormatter("(NN) N NNNN-NNNN");
        //assistindo o texto e inserindo no momento digitado de acordo com a mascara
        final MaskTextWatcher mtw_fone = new MaskTextWatcher(telefone_cad,smf_fone);
        telefone_cad.addTextChangedListener(mtw_fone);

        //formatando a máscara para cpf
        SimpleMaskFormatter smf_cpf = new SimpleMaskFormatter("NNN.NNN.NNN-NN");
        //assistindo o texto e inserindo no momento digitado de acordo com a mascara
        final MaskTextWatcher mtw_cpf = new MaskTextWatcher(cpf_cad,smf_cpf);
        cpf_cad.addTextChangedListener(mtw_cpf);
    }



    public void act_btn_cadastrar(View view) {
        String ac_nome = nome_cad.getText().toString().trim();
        String ac_sobrenome = sobrenome_cad.getText().toString().trim();
        String ac_aniversario = aniversario_cad.getText().toString();
        String ac_telefone = telefone_cad.getText().toString().trim();
        String ac_cpf = cpf_cad.getText().toString().trim();
        String ac_email = email_cad.getText().toString().trim();
        String ac_senha = senha_cad.getText().toString().trim();
        String ac_rpt_senha = rpt_senha_cad.getText().toString().trim();

        try{
            if (ac_nome.isEmpty()||ac_nome.length()<3){
                nome_cad.setError("Campo vazio ou inválido!");
                nome_cad.requestFocus();
            } else if (ac_sobrenome.isEmpty()||ac_sobrenome.length()<3){
                sobrenome_cad.setError("Campo vazio ou inválido!");
                sobrenome_cad.requestFocus();
            } else if (ac_aniversario.isEmpty()||ac_aniversario.length()<10){
                aniversario_cad.setError("Campo vazio ou inválido!");
                aniversario_cad.requestFocus();
            } else if (ac_telefone.isEmpty()||ac_telefone.length()<16){
                telefone_cad.setError("Campo vazio ou inválido!");
                telefone_cad.requestFocus();
            } else if (ac_cpf.isEmpty()||ac_cpf.length()<14){
                cpf_cad.setError("Campo vazio ou inválido!");
                cpf_cad.requestFocus();
            } else if (ac_email.isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(ac_email).matches()){
                email_cad.setError("Campo vazio ou inválido!");
                email_cad.requestFocus();
            } else if (ac_senha.isEmpty()||ac_senha.length()<5){
                senha_cad.setError("Senha muito curta! Mínimo 5 dígitos!");
                senha_cad.requestFocus();
            } else if (ac_rpt_senha.isEmpty()||!ac_rpt_senha.equals(ac_senha)){
                rpt_senha_cad.setError("A senha não confere");
                rpt_senha_cad.requestFocus();
            }



            if (    ac_nome.length()>=3                                &&
                    ac_sobrenome.length()>=3                           &&
                    ac_aniversario.length()<=10                        &&
                    ac_telefone.length()==16                           &&
                    ac_cpf.length()==14                                &&
                    Patterns.EMAIL_ADDRESS.matcher(ac_email).matches() &&
                    ac_senha.length()>=5                               &&
                    ac_rpt_senha.equals(ac_senha)
                    )
            {
                String type = "cadastrar";

                BackgroundWorker backgroundWorker = new BackgroundWorker(this);
                backgroundWorker.execute(type, ac_nome, ac_sobrenome, ac_aniversario, ac_telefone, ac_cpf, ac_email, ac_senha);
            }

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
        }

    }
}
