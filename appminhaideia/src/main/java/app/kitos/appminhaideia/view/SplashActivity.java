package app.kitos.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import app.kitos.appminhaideia.R;
import app.kitos.appminhaideia.controller.ClienteController;
import app.kitos.appminhaideia.core.AppUtil;
import app.kitos.appminhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    int tempoDeEspera = 1000 * 2;

    TextView txtAppVersion;

    Cliente objCliente;
    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        txtAppVersion = findViewById(R.id.txtAppVersion);
        txtAppVersion.setText(AppUtil.versaoDoApp());

        clienteController = new ClienteController();

        trocarTela();
    }

    private void trocarTela(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                objCliente = new Cliente("Marcus",
                        "marcuslcnog@gmail.com",
                        "99580365",
                        25,
                        false);

                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("nome",objCliente.getNome());
                bundle.putString("email",objCliente.getEmail());
                bundle.putString("telefone", objCliente.getTelefone());
                bundle.putInt("idade", objCliente.getIdade());
                bundle.putBoolean("sexo",objCliente.isSexo());

                trocarDeTela.putExtras(bundle);

                startActivity(trocarDeTela);
                finish();
            }
        },tempoDeEspera);



    }
}