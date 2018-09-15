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
import static com.sorte.sorte.TabRosto.armazenamento_limpezapele_servico;

public class TabMaoPe extends Fragment {

    public static int armazenamento_pe;
    public static int armazenamento_mao;
    public static String armazenamento_mao_servico = "",armazenamento_pe_servico = "";
    public static CheckBox ckManicure, ckPedicure;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_servicos_mao_e_pe, container, false);

        ckManicure = rootView.findViewById(R.id.ckManicure);
        ckPedicure = rootView.findViewById(R.id.ckPedicure);

        ckManicure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckManicure.isChecked()){
                    armazenamento_mao = 45;
                    armazenamento_mao_servico = "Manicure";
                    servico_selecionado+=armazenamento_mao_servico;
                }else if (!ckManicure.isChecked()){
                    armazenamento_mao = 0;
                    armazenamento_mao_servico = "";
                }
            }
        });

        ckPedicure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ckPedicure.isChecked()){
                    armazenamento_pe = 45;
                    armazenamento_pe_servico = "Pedicure";
                    servico_selecionado+=armazenamento_pe_servico;
                }else if (!ckPedicure.isChecked()){
                    armazenamento_pe = 0;
                    armazenamento_pe_servico = "";
                }
            }
        });
        return rootView;
    }
}