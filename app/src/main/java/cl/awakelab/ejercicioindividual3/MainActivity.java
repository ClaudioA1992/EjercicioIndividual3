package cl.awakelab.ejercicioindividual3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sumar = findViewById(R.id.button);
        Button restar = findViewById(R.id.button2);
        Button dividir = findViewById(R.id.button3);
        Button multiplicar = findViewById(R.id.button4);

        EditText numero1 = findViewById(R.id.editTextNumber);
        EditText numero2 = findViewById(R.id.editTextNumber2);


//        boton2.setOnHoverListener((v, event) -> {
//            v.setBackgroundColor(3);
//        });

        sumar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                validacion(numero1, numero2);

                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());

                Toast.makeText(getBaseContext(), "Sumaste " + (n1 + n2), Toast.LENGTH_LONG).show();
            }

        });

        restar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                validacion(numero1, numero2);

                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());

                Toast.makeText(getBaseContext(), "Restaste " + (n1 - n2), Toast.LENGTH_LONG).show();
            }

        });

        dividir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                validacion(numero1, numero2);

                if(Integer.parseInt(numero2.getText().toString()) == 0) {
                    Toast.makeText(getBaseContext(), "Número divisor inválido", Toast.LENGTH_LONG).show();
                    return;
                }

                double n1 = Integer.parseInt(numero1.getText().toString());
                double n2 = Integer.parseInt(numero2.getText().toString());

                Toast.makeText(getBaseContext(), "Dividiste " + (n1 / n2), Toast.LENGTH_LONG).show();
            }

        });

        multiplicar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                validacion(numero1, numero2);

                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());

                Toast.makeText(getBaseContext(), "Multiplicaste " + (n1 * n2), Toast.LENGTH_LONG).show();
            }

        });

        Toast.makeText(this, "Soy un toast", Toast.LENGTH_LONG).show();

    }

    private void validacion(EditText numero1, EditText numero2) {
        if(numero1.getText().toString().trim().isEmpty() || numero1.getText().toString().trim().isEmpty()) {
            Toast.makeText(getBaseContext(), "Faltan números a ingresar", Toast.LENGTH_LONG).show();
            return;
        }
    }

    private void showToast() {
        Toast.makeText(getBaseContext(), "Apretaste un botón",
                Toast.LENGTH_LONG).show();
    };

}