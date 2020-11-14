package app.kitos.appminhaideia.controller;

import android.util.Log;

import app.kitos.appminhaideia.core.AppUtil;

public class ClienteController {

    String versaoApp;


    public ClienteController (){

        this.versaoApp = AppUtil.versaoDoApp();

        Log.i(AppUtil.TAG, "ClienteController - Versão do App: " + versaoApp);
    }
}