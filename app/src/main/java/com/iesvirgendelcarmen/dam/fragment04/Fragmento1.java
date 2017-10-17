package com.iesvirgendelcarmen.dam.fragment04;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

/**
 * Created by matinal on 11/10/2017.
 */

public class Fragmento1 extends DialogFragment {
    static Fragmento1 nuevaInstancia(String titulo){
         Fragmento1 fragmento = new Fragmento1();
        Bundle args = new Bundle();
        args.putString("titulo", titulo);
        fragmento.setArguments(args);
        return fragmento;

    }

    public void show(FragmentManager supportFragmentManager, String dialogo) {
    }
}
