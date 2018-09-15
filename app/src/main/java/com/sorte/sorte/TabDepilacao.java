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

public class TabDepilacao extends Fragment{

    /*
    CheckBox ckMeiaPerna;
    CheckBox ckAxila;
    CheckBox ckVirilha;
    */

    public static int armazenamento_depila_perna_duracao;
    public static String armazenamento_depilaperna_servico = "";
    public static CheckBox ckPernas;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_servicos_depilacao, container, false);

        ckPernas = rootView.findViewById(R.id.ckPernas);

        ckPernas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckPernas.isChecked()){
                    armazenamento_depila_perna_duracao = 90;
                    armazenamento_depilaperna_servico = "Depilação de Perna";
                    servico_selecionado+=armazenamento_depilaperna_servico;
                }else if (!ckPernas.isChecked()){
                    armazenamento_depila_perna_duracao = 0;
                    armazenamento_depilaperna_servico = "";
                }
            }
        });


        /*
        ckMeiaPerna = rootView.findViewById(R.id.ckMeiaPerna);
        ckxila = rootView.findViewById(R.id.ckAxila);
        ckVirilha = rootView.findViewById(R.id.ckVirilha);

         ckMeiaPerna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckMeiaPerna.isChecked()){
                    Toast toast = Toast.makeText(getActivity(),"Depilação de Meia Perna Selecionado",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                    toast.show();
                }
            }
        });

        ckAxila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckAxila.isChecked()){
                    Toast toast = Toast.makeText(getActivity(),"Depilação de Axila Selecionado",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                    toast.show();
                }
            }
        });

        ckVirilha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckVirilha.isChecked()){
                    Toast toast = Toast.makeText(getActivity(),"Depilação de Virilha Selecionado",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                    toast.show();
                }
            }
        });
         */


        return rootView;
    }
}