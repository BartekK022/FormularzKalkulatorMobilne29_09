package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button buttonOblicz;
    Spinner spinner;
    TextView textViewWynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        spinner = findViewById(R.id.spinner);
        textViewWynik = findViewById(R.id.textView);

        buttonOblicz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String liczba1tekstowo = editText1.getText().toString();
                        int liczba1 = Integer.parseInt(liczba1tekstowo);
                        String liczba2tekstowo = editText2.getText().toString();
                        int liczba2 = Integer.parseInt(liczba2tekstowo);
                        int wynik;
                        int dzialanie = spinner.getSelectedItemPosition();
                        switch (dzialanie) {
                            case 0:
                                wynik = liczba1 + liczba2;
                                break;
                            case 1:
                                wynik = liczba1 - liczba2;
                                break;
                            case 3:
                                if(liczba2 != 0) {
                                    wynik = liczba1 / liczba2;
                                } else {
                                    wynik = 999999999;
                                }
                                break;
                            default:
                                wynik = 0;
                        }



















        );

    }
}