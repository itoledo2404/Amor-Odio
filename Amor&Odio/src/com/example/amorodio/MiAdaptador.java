package com.example.amorodio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MiAdaptador extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	
	// Constructor de nuestro adapter para el ListView
	public MiAdaptador(Context context, int resource, int textViewResourceId,
			String[] objects) {
		super(context, resource, textViewResourceId, objects);
		this.context = context;
		this.values = objects;
	}

	/* Cuendo cargamos cada uno de los items del listview llamamos a este metodo y 
	   podemos darle los parametros del aspecto*/
	
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView;
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			//Con este evento le indicamos que use el layout listemview_custom
			rowView = inflater.inflate(R.layout.listview_custom, parent, false);
		} else {
			rowView = convertView;
		}

		TextView textView = (TextView) rowView.findViewById(R.id.txtViewlbl);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(values[position]);
		//Recojo la posicion y con el case diferencio las imagenes y los elementos
		switch (position){
		
			case 0: imageView.setImageResource(R.drawable.barcode);
	        break;
			case 1: imageView.setImageResource(R.drawable.battery);
	        break;
			case 2: imageView.setImageResource(R.drawable.cpu);
	        break;
			case 3: imageView.setImageResource(R.drawable.memory);
	        break;
			case 4: imageView.setImageResource(R.drawable.pci);
	        break;
			case 5: imageView.setImageResource(R.drawable.processor);
	        break;
	        
		}
		
		
		return rowView;
	}
}
