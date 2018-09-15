package com.sorte.sorte;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import static com.sorte.sorte.Home.recebe_data;
import static com.sorte.sorte.Home.recebe_hora;
import static com.sorte.sorte.Servicos.*;

public class Dia extends AppCompatActivity {

    CalendarView mCalendarView;
    public static String aAdata;
    EditText txt_confirmar_data;
    Button btn_confirmar_dias;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia);

        mCalendarView = findViewById(R.id.calendarView);
        txt_confirmar_data = findViewById(R.id.txt_confirmar_data);
        btn_confirmar_dias = findViewById(R.id.btn_confirmar_dias);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                aAdata = dayOfMonth + "/" + (month + 1) + "/" + year;
                txt_confirmar_data.setText(aAdata);
                }
        });

        btn_confirmar_dias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recebe_data = aAdata;

                Intent i = new Intent(Dia.this,Horarios.class);
                startActivity(i);
                finish();

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
}