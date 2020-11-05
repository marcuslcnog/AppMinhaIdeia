package app.kitos.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    int tempoDeEspera = 1000 * 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        trocarTela();
    }

    private void trocarTela(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(trocarDeTela);
                finish();
            }
        },tempoDeEspera);



    }
}