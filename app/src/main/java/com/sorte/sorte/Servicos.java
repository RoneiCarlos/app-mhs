package com.sorte.sorte;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import static com.sorte.sorte.Home.recebe_data;
import static com.sorte.sorte.Home.recebe_hora;
import static com.sorte.sorte.TabCabelo.armazenamento_cabelo_duracao;
import static com.sorte.sorte.TabDepilacao.armazenamento_depila_perna_duracao;
import static com.sorte.sorte.TabMaoPe.armazenamento_mao;
import static com.sorte.sorte.TabMaoPe.armazenamento_pe;
import static com.sorte.sorte.TabRosto.armazenamento_face_duracao;


public class Servicos extends AppCompatActivity {

    public static int soma_minutos_servicos, i;
    public static String servico_selecionado = "";
    public static String[] servico_armazenado = new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soma_minutos_servicos = armazenamento_cabelo_duracao + armazenamento_face_duracao + armazenamento_mao +armazenamento_pe + armazenamento_depila_perna_duracao;
                if (soma_minutos_servicos == 0){
                    Toast toast = Toast.makeText(Servicos.this, "Selecione ao menos um serviço", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();
                } else if (soma_minutos_servicos >0){


                    if (i<servico_armazenado.length){
                        servico_selecionado += recebe_data + recebe_hora;
                        soma_minutos_servicos = 0;
                    }

                    Intent intent = new Intent(Servicos.this, Dia.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }


    @Override
    public void onBackPressed() {
        recebe_data = "";
        recebe_hora = "";
        servico_selecionado = "";
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_servicos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new TabCabelo();
                case 1:
                    return new TabRosto();
                case 2:
                    return new TabMaoPe();
                case 3:
                    return new TabDepilacao();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }
    }
}
//mãos e pés
//manicure - 0:45h
//pedicure - 0:45h

//cabelo
//mechas - 1:00h
//corte - 0:45h
//coloração - 0:30h
//progressiva - 2:00h a 3:00h (assim que selecionado, exibir um dialog alert perguntando se o
//                  cliente possui muito ou pouco cabelo, caso for pouco, armazenar 2 horas na variável
//                  caso for muito, armazenar 3 horas na variável...)
//
//                  -----fazer uma análize prévia da quantidade de cabelo e armazenar em uma variável
//                  -----se o cliente tem muito, medio ou pouco cabelo.
//hidratação - 1:00h
//botox - 1:00h
//cabelo - 0:30h
//rosto
//Sobrancelha com henna e fio egípcio - 0:30h
//depilação egípcia facial - 0:30h
//buço - 0:15h
//limpeza de pele - 1:15h
//maquiagem - 1:00h

//depilação com cera
//pernas - 1:30h
//meia perna - 1:00h
//virilha - 0:45h
//axila - 0:30h


//cancelar agendamento com até 3 horas de antecedência


//o que a empresa vai ganhar com a implementação do app

