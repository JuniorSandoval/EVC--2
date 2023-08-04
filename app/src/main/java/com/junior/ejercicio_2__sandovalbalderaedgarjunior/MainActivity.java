package com.junior.ejercicio_2__sandovalbalderaedgarjunior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText usuario;
    private EditText contraseña;
    private TextView oportunidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=findViewById(R.id.txt_usuario);
        contraseña=findViewById(R.id.txt_usuario);
        oportunidades=findViewById(R.id.lbl_numerodeoportunidad);

    }
    public void siguiente(View view) {
        Intent i = new Intent(this, MainActivity2.class );
        startActivity(i);

        Toast toast = Toast.makeText(this, "BIENVENIDO USUARIO", Toast.LENGTH_SHORT);
        toast.show();
    }
}