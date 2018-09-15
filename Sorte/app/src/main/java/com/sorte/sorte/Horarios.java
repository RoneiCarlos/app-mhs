package com.sorte.sorte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.sorte.sorte.Home.recebe_data;
import static com.sorte.sorte.Home.recebe_hora;
import static com.sorte.sorte.Servicos.*;

public class Horarios extends AppCompatActivity {


    String hora;
    Button btnConcluido;
    TextView
            txt0800,
            txt0815,
            txt0830,
            txt0845,
            txt0900,
            txt0915,
            txt0930,
            txt0945,
            txt1000,
            txt1015,
            txt1030,
            txt1045,
            txt1100,
            txt1115,
            txt1130,
            txt1145,
            txt1200,
            txt1215,
            txt1230,
            txt1245,
            txt1300,
            txt1315,
            txt1330,
            txt1345,
            txt1400,
            txt1415,
            txt1430,
            txt1445,
            txt1500,
            txt1515,
            txt1530,
            txt1545,
            txt1600,
            txt1615,
            txt1630,
            txt1645,
            txt1700,
            txt1715,
            txt1730,
            txt1745,
            txt1800,
            txt1815,
            txt1830,
            txt1845,
            txt1900,
            txt1915,
            txt1930,
            txt1945;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);
        btnConcluido = findViewById(R.id.btnConcluido);

        txt0800 = findViewById(R.id.txt0800);
        txt0815 = findViewById(R.id.txt0815);
        txt0830 = findViewById(R.id.txt0830);
        txt0845 = findViewById(R.id.txt0845);
        txt0900 = findViewById(R.id.txt0900);
        txt0915 = findViewById(R.id.txt0915);
        txt0930 = findViewById(R.id.txt0930);
        txt0945 = findViewById(R.id.txt0945);
        txt1000 = findViewById(R.id.txt1000);
        txt1015 = findViewById(R.id.txt1015);
        txt1030 = findViewById(R.id.txt1030);
        txt1045 = findViewById(R.id.txt1045);
        txt1100 = findViewById(R.id.txt1100);
        txt1115 = findViewById(R.id.txt1115);
        txt1130 = findViewById(R.id.txt1130);
        txt1145 = findViewById(R.id.txt1145);
        txt1200 = findViewById(R.id.txt1200);
        txt1215 = findViewById(R.id.txt1215);
        txt1230 = findViewById(R.id.txt1230);
        txt1245 = findViewById(R.id.txt1245);
        txt1300 = findViewById(R.id.txt1300);
        txt1315 = findViewById(R.id.txt1315);
        txt1330 = findViewById(R.id.txt1330);
        txt1345 = findViewById(R.id.txt1345);
        txt1400 = findViewById(R.id.txt1400);
        txt1415 = findViewById(R.id.txt1415);
        txt1430 = findViewById(R.id.txt1430);
        txt1445 = findViewById(R.id.txt1445);
        txt1500 = findViewById(R.id.txt1500);
        txt1515 = findViewById(R.id.txt1515);
        txt1530 = findViewById(R.id.txt1530);
        txt1545 = findViewById(R.id.txt1545);
        txt1600 = findViewById(R.id.txt1600);
        txt1615 = findViewById(R.id.txt1615);
        txt1630 = findViewById(R.id.txt1630);
        txt1645 = findViewById(R.id.txt1645);
        txt1700 = findViewById(R.id.txt1700);
        txt1715 = findViewById(R.id.txt1715);
        txt1730 = findViewById(R.id.txt1730);
        txt1745 = findViewById(R.id.txt1745);
        txt1800 = findViewById(R.id.txt1800);
        txt1815 = findViewById(R.id.txt1815);
        txt1830 = findViewById(R.id.txt1830);
        txt1845 = findViewById(R.id.txt1845);
        txt1900 = findViewById(R.id.txt1900);
        txt1915 = findViewById(R.id.txt1915);
        txt1930 = findViewById(R.id.txt1930);
        txt1945 = findViewById(R.id.txt1945);

        txt0800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "08:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
        }
        });
        txt0815.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "08:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt0830.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "08:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt0845.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "08:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt0900.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "09:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt0915.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "09:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt0930.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "09:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt0945.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "09:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "10:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "10:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1030.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "10:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1045.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "10:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "11:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "11:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "11:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "11:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "12:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "12:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1230.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "12:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1245.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "12:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "13:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1315.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "13:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "13:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1345.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "13:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "14:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1415.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "14:5";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1430.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "14:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1445.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "14:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "15:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1515.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "15:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1530.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "15:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1545.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "15:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1600.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "16:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1615.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "16:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1630.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "16:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1645.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "16:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1700.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "17:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1715.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "17:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1730.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "17:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1745.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "17:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "18:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1815.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "18:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1830.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "18:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1845.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "18:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1900.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "19:00";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1915.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "19:15";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1930.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "19:30";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });
        txt1945.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hora = "19:45";
                Toast t = Toast.makeText(Horarios.this, hora, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
                t.show();
            }
        });


        btnConcluido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recebe_hora = hora;

                if (i<servico_armazenado.length){
                    servico_selecionado += " " + recebe_data + " " + recebe_hora;
                    servico_armazenado[i] = servico_selecionado;
                    recebe_data = "";
                    recebe_hora = "";
                    servico_selecionado = "";
                    i++;
                }

            Intent intent = new Intent(Horarios.this, Home.class);
            startActivity(intent);
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
