package com.sorte.sorte;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundWorker extends AsyncTask<String, Void, String> {

    @SuppressLint("StaticFieldLeak")

    public Context context;

    AlertDialog alertDialog;

    BackgroundWorker(Context ctx){
        context = ctx;
    }

    @Override
    protected String doInBackground(String... string) {
/*
        String data = null;
        String dataParsed = "";
        String singleParse = "";
        //exibir os serviços agendados
        try{
            URL url = new URL("http://msh.uniquelyyou.site/api_results.php");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";

            while(line!=null){
                line=bufferedReader.readLine();
                data +=line;
            }

            JSONArray ja = new JSONArray(data);
            for(int i=0;i<ja.length();i++){
                JSONObject jo = (JSONObject) ja.get(i);
                singleParse = "Serviço " + jo.get("title") + "\n"+
                        "Data inicial " + jo.get("start") + "\n"+
                        "Data final " + jo.get("finish") + "\n";
            }


        }catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

*/
        //cadastro e login
        String type = string[0];
        String logar_url = "http://192.168.0.104/app_teste/logar.php";
        String cadastrar_url = "http://192.168.0.104/app_teste/cadastrar.php";

        if (type.equals("login")) {
            try {

                String email = string[1];
                String senha = string[2];

                URL url = new URL(logar_url);

                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();

                BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("aa_email", "UTF-8")+"="+URLEncoder.encode(email, "UTF-8")+"&"
                        +URLEncoder.encode("aa_senha", "UTF-8")+"="+URLEncoder.encode(senha, "UTF-8");

                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();

                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));

                String result = "";
                String line;

                while((line = bufferedReader.readLine())!=null){
                    result += line;
                }

                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();

                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (type.equals("cadastrar")){
            try {

                String nome = string[1];
                String sobrenome = string[2];
                String nascimento = string[3];
                String telefone = string[4];
                String cpf = string[5];
                String email = string[6];
                String senha = string[7];

                URL url = new URL(cadastrar_url);

                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();

                BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("ac_nome", "UTF-8")+"="+URLEncoder.encode(nome, "UTF-8")+"&"
                        +URLEncoder.encode("ac_sobrenome", "UTF-8")+"="+URLEncoder.encode(sobrenome, "UTF-8")+"&"
                        +URLEncoder.encode("ac_nascimento", "UTF-8")+"="+URLEncoder.encode(nascimento, "UTF-8")+"&"
                        +URLEncoder.encode("ac_telefone", "UTF-8")+"="+URLEncoder.encode(telefone, "UTF-8")+"&"
                        +URLEncoder.encode("ac_cpf", "UTF-8")+"="+URLEncoder.encode(cpf, "UTF-8")+"&"
                        +URLEncoder.encode("ac_email", "UTF-8")+"="+URLEncoder.encode(email, "UTF-8")+"&"
                        +URLEncoder.encode("ac_senha", "UTF-8")+"="+URLEncoder.encode(senha, "UTF-8");

                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();

                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));

                String result = "";
                String line;

                while((line = bufferedReader.readLine())!=null){
                    result += line;
                }

                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();

                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Status do login");
    }

    @Override
    protected void onPostExecute(String aString) {
        alertDialog.setMessage(aString);
        alertDialog.show();

    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
