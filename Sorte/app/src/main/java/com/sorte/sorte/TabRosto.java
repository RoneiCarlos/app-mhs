package com.sorte.sorte;

import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import static com.sorte.sorte.Servicos.servico_selecionado;

public class TabRosto extends Fragment{

    /*
    CheckBox ckSobrancelhaHenna;
    CheckBox ckDepilacaoFacial;
    CheckBox ckBuco;
    CheckBox ckMaquiagem;
    */

    public static int armazenamento_face_duracao;
    public static String armazenamento_limpezapele_servico = "";
    public static CheckBox ckLimpezaPele;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_servicos_rosto, container, false);

        ckLimpezaPele = rootView.findViewById(R.id.ckLimpezaPele);

        ckLimpezaPele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckLimpezaPele.isChecked()){
                    armazenamento_face_duracao = 75;
                    armazenamento_limpezapele_servico = "Limpeza de Pele";
                    servico_selecionado+=armazenamento_limpezapele_servico;
                }else if (!ckLimpezaPele.isChecked()){
                    armazenamento_face_duracao = 0;
                    armazenamento_limpezapele_servico = "";
                }
            }
        });


        /*
        ckSobrancelhaHenna = rootView.findViewById(R.id.ckSobrancelhaHenna);
        ckDepilacaoFacial = rootView.findViewById(R.id.ckDepilacaoFacial);
        ckBuco = rootView.findViewById(R.id.ckBuco);
        ckMaquiagem = rootView.findViewById(R.id.ckMaquiagem);

        ckSobrancelhaHenna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckSobrancelhaHenna.isChecked()){
                    Toast toast = Toast.makeText(getActivity(),"Sobrancelha com Henna e Fio Egípcio Selecionado",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                    toast.show();
                }
            }
        });

        ckDepilacaoFacial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckDepilacaoFacial.isChecked()){
                    Toast toast = Toast.makeText(getActivity(),"Depilação Egípcia Facial Selecionado",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                    toast.show();
                }
            }
        });

        ckBuco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckBuco.isChecked()){
                    Toast toast = Toast.makeText(getActivity(),"Buço Selecionado",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                    toast.show();
                }
            }
        });


        ckMaquiagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckMaquiagem.isChecked()){
                    Toast toast = Toast.makeText(getActivity(),"Maquiagem Selecionado",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                    toast.show();
                }
            }
        });

        */


        return rootView;
    }
}