package br.com.bitan.clickponto.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import br.com.bitan.clickponto.R;
import br.com.bitan.clickponto.model.Ponto;

public class MainActivity extends AppCompatActivity {

    Ponto ponto;

    EditText editTimeEntrada1;
    EditText editTimeSaida1;
    EditText editTimeEntrada2;
    EditText editTimeSaida2;

    Button btnCalcular;
    Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ponto = new Ponto();

        editTimeEntrada1 = findViewById(R.id.editTimeEntrada1);
        editTimeSaida1 = findViewById(R.id.editTimeSaida1);
        editTimeEntrada2 = findViewById(R.id.editTimeEntrada2);
        editTimeSaida2 = findViewById(R.id.editTimeSaida2);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpar = findViewById(R.id.btnLimpar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean dadosOk = true;

                if (TextUtils.isEmpty(editTimeEntrada1.getText())) {
                    editTimeEntrada1.setError("* Obrigatório");
                    editTimeEntrada1.requestFocus();
                    dadosOk = false;
                }
                if (TextUtils.isEmpty(editTimeSaida1.getText())) {
                    editTimeSaida1.setError("* Obrigatório");
                    editTimeEntrada1.requestFocus();
                    dadosOk = false;
                }
                if (TextUtils.isEmpty(editTimeEntrada2.getText())) {
                    editTimeEntrada2.setError("* Obrigatório");
                    editTimeEntrada1.requestFocus();
                    dadosOk = false;
                }
                if (dadosOk) {
                    ponto.setEntrada1(LocalTime.parse(editTimeEntrada1.getText().toString()));
                    ponto.setSaida1(LocalTime.parse(editTimeSaida1.getText().toString()));
                    ponto.setEntrada2(LocalTime.parse(editTimeEntrada2.getText().toString()));
                    ponto.setSaida2(ponto.getEntrada2().plusMinutes(ponto.getJornada() - ponto.getEntrada1().until(ponto.getSaida1(), ChronoUnit.MINUTES)));
                    editTimeSaida2.setEnabled(true);
                    editTimeSaida2.setText(ponto.getSaida2().toString());
                    editTimeEntrada1.requestFocus();
                } else {
                    Toast.makeText(MainActivity.this, "Digite os dados obrigatórios", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTimeEntrada1.setText("");
                editTimeSaida1.setText("");
                editTimeEntrada2.setText("");
                editTimeSaida2.setText("");
                editTimeSaida2.setEnabled(false);
                editTimeEntrada1.requestFocus();
            }
        });
    }
}