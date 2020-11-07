package app.kitos.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import app.kitos.appminhaideia.R;
import app.kitos.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente("Marcus",
                "marcuslcnog@gmail.com",
                "99580365",
                25,
                false);
    }
}