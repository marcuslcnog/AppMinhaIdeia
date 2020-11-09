package app.kitos.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import app.kitos.appminhaideia.R;
import app.kitos.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bundle bundle = getIntent().getExtras();

        Log.d("kitestes","Main carregada");
        Log.d("kitestes","Nome = " + bundle.getString("nome"));
        Log.d("kitestes","Email = " + bundle.getString("email"));
        Log.d("kitestes","Telefone = " + bundle.getString("telefone"));
        Log.d("kitestes","Idade = " + bundle.getInt("idade"));
        Log.d("kitestes","Sexo = " + bundle.getBoolean("sexo"));

        txtNome = findViewById(R.id.txtNome);
        txtNome.setText(bundle.getString("nome"));
    }
}