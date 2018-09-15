package com.sorte.sorte;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;

import static com.sorte.sorte.Servicos.servico_selecionado;


public class TabCabelo extends Fragment{


    public static int armazenamento_cabelo_duracao;
    public static String armazenamento_corte_cabelo_servico;
    public static CheckBox ckCorte;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_servicos_cabelo, container, false);


        ckCorte = rootView.findViewById(R.id.ckCorte);

        ckCorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckCorte.isChecked()){
                    armazenamento_cabelo_duracao = 45;
                    armazenamento_corte_cabelo_servico = "Corte de Cabelo";
                    servico_selecionado += armazenamento_corte_cabelo_servico;
                }else if (!ckCorte.isChecked()){
                    armazenamento_cabelo_duracao = 0;
                    armazenamento_corte_cabelo_servico = "";
                }
            }
        });




/*
        ckColoracao = rootView.findViewById(R.id.ckColoracao);
        ckProgressiva = rootView.findViewById(R.id.ckProgressiva);
        ckHidratacao = rootView.findViewById(R.id.ckHidratacao);
        ckBotox = rootView.findViewById(R.id.ckBotox);
        ckCabelo = rootView.findViewById(R.id.ckCabelo);
        ckMecha = rootView.findViewById(R.id.ckMecha);

            ckColoracao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ckColoracao.isChecked()){
                        Toast toast = Toast.makeText(getActivity(),"Coloracao Selecionado",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                        toast.show();
                    }
                }
            });

            ckProgressiva.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ckProgressiva.isChecked()){
                        Toast toast = Toast.makeText(getActivity(),"Progressiva Selecionado",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                        toast.show();
                    }
                }
            });

            ckHidratacao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ckHidratacao.isChecked()){
                        Toast toast = Toast.makeText(getActivity(),"Hidratação Selecionado",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                        toast.show();
                    }
                }
            });

            ckBotox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ckBotox.isChecked()){
                        Toast toast = Toast.makeText(getActivity(),"Botox Selecionado",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                        toast.show();
                    }
                }
            });

            ckCabelo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ckCabelo.isChecked()){
                        Toast toast = Toast.makeText(getActivity(),"Cabelo Selecionado",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                        toast.show();
                    }
                }
            });

        ckMecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ckMecha.isChecked()){
                    Toast toast = Toast.makeText(getActivity(),"Mecha Selecionado",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                    toast.show();
                }
            }
        });
*/
        return rootView;
    }
}