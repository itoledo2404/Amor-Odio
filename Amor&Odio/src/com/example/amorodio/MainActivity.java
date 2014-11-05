package com.example.amorodio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


public class MainActivity extends Activity {

	// Instanciamos las clases Inf y Sup para poder añadir los fragmenty gestionar el transpaso de datos
	static final Inf inf = new Inf();
	static final Sup sup = new Sup();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		// Añadimos los fragment
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();

		fragmentTransaction.add(R.id.inf, inf);
		fragmentTransaction.add(R.id.sup, sup);

		fragmentTransaction.commit();

	}

	protected void itemSeleccionado(String item) {
		inf.setItemseleccionado(item);
	}
}