package com.example.calculette;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre1;
    private EditText etNombre2;
    private TextView tvResultat;
    private Button btnAddition;
    private Button btnSoustraction;
    private Button btnMultiplication;
    private Button btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des vues
        etNombre1 = findViewById(R.id.et_nombre1);
        etNombre2 = findViewById(R.id.et_nombre2);
        tvResultat = findViewById(R.id.tv_resultat);
        btnAddition = findViewById(R.id.btn_addition);
        btnSoustraction = findViewById(R.id.btn_soustraction);
        btnMultiplication = findViewById(R.id.btn_multiplication);
        btnDivision = findViewById(R.id.btn_division);

        // Configuration des écouteurs
        btnAddition.setOnClickListener(v -> calculerAddition());
        btnSoustraction.setOnClickListener(v -> calculerSoustraction());
        btnMultiplication.setOnClickListener(v -> calculerMultiplication());
        btnDivision.setOnClickListener(v -> calculerDivision());
    }

    // Méthode pour récupérer les nombres depuis les champs de saisie
    private double[] getNombres() {
        double[] nombres = new double[2];
        try {
            String text1 = etNombre1.getText().toString().trim();
            String text2 = etNombre2.getText().toString().trim();

            if (text1.isEmpty() || text2.isEmpty()) {
                Toast.makeText(this, "Veuillez entrer les deux nombres", Toast.LENGTH_SHORT).show();
                return null;
            }

            nombres[0] = Double.parseDouble(text1);
            nombres[1] = Double.parseDouble(text2);
            return nombres;
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Veuillez entrer des nombres valides", Toast.LENGTH_SHORT).show();
            return null;
        }
    }

    private void calculerAddition() {
        double[] nombres = getNombres();
        if (nombres != null) {
            double resultat = nombres[0] + nombres[1];
            afficherResultat(resultat);
        }
    }

    private void calculerSoustraction() {
        double[] nombres = getNombres();
        if (nombres != null) {
            double resultat = nombres[0] - nombres[1];
            afficherResultat(resultat);
        }
    }

    private void calculerMultiplication() {
        double[] nombres = getNombres();
        if (nombres != null) {
            double resultat = nombres[0] * nombres[1];
            afficherResultat(resultat);
        }
    }

    private void calculerDivision() {
        double[] nombres = getNombres();
        if (nombres != null) {
            if (nombres[1] == 0) {
                Toast.makeText(this, "Erreur : Division par zéro impossible!", Toast.LENGTH_LONG).show();
            } else {
                double resultat = nombres[0] / nombres[1];
                afficherResultat(resultat);
            }
        }
    }

    // Affiche le résultat formaté
    private void afficherResultat(double resultat) {
        // Vérifier si le résultat est un entier
        if (resultat == (long) resultat) {
            tvResultat.setText(String.format("%d", (long) resultat));
        } else {
            tvResultat.setText(String.format("%.2f", resultat));
        }
    }
}