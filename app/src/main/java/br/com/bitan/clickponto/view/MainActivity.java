package br.com.bitan.clickponto.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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

    Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ponto = new Ponto();
        ponto.setEntrada1(LocalTime.parse("08:32"));
        ponto.setSaida1(LocalTime.parse("13:06"));
        ponto.setEntrada2(LocalTime.parse("14:12"));
        ponto.setSaida2(ponto.getEntrada2().plusMinutes(480-ponto.getEntrada1().until(ponto.getSaida1(), ChronoUnit.MINUTES)));

        editTimeEntrada1 = findViewById(R.id.editTimeEntrada1);
        editTimeEntrada1 = findViewById(R.id.editTimeSaida1);
        editTimeEntrada1 = findViewById(R.id.editTimeEntrada2);
        editTimeEntrada1 = findViewById(R.id.editTimeSaida2);

        btnLimpar = findViewById(R.id.btnLimpar);

        editTimeEntrada1.setText(ponto.getEntrada1());
        editTimeEntrada1.setText(ponto.getSaida1());
        editTimeEntrada1.setText(ponto.getEntrada2());
        editTimeEntrada1.setText(ponto.getSaida2());

    }
}