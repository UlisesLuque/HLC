package com.examples.android.xml;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

	static Noticia noticia;

	static TextView tvCiudad;
	static TextView tvGrados;
	static TextView tvWeatherValue;
	static TextView tvHumidity;
	static TextView tvTemperaturaMin;
	static TextView tvTemperaturaMax;
	static TextView tvViento;
	static TextView tvCoordLon;
	static TextView tvCoordLat;
	static TextView tvPais;
	static TextView tvSunRise;
	static TextView tvSunSet;
	static TextView tvTempMin;
	static TextView tvTempMax;
	static TextView tvTempValue;
	static TextView tvHum;
	static TextView tvPressure;
	static TextView tvWindSpeed;
	static TextView tvWindDirecction;
	static TextView tvClouds;
	static TextView tvPrecipitation;
    static View layoutPrincipal;

	static String ciudad = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvCiudad = (TextView) findViewById(R.id.tvCiudad);
		tvGrados = (TextView) findViewById(R.id.tvGrados);
		tvWeatherValue = (TextView) findViewById(R.id.tvWeatherValue);
		tvHumidity = (TextView) findViewById(R.id.tvHumidity);
		tvTemperaturaMin = (TextView) findViewById(R.id.tvTemperaturaMin);
		tvTemperaturaMax = (TextView) findViewById(R.id.tvTemperaturaMax);
		tvViento = (TextView) findViewById(R.id.tvViento);
		tvCoordLon = (TextView) findViewById(R.id.tvCoordLon);
		tvCoordLat = (TextView) findViewById(R.id.tvCoordLat);
		tvPais = (TextView) findViewById(R.id.tvPais);
		tvSunRise = (TextView) findViewById(R.id.tvSunrise);
		tvSunSet = (TextView) findViewById(R.id.tvSunSet);
		tvTempValue = (TextView) findViewById(R.id.tvTempertureValue);
		tvTempMin = (TextView) findViewById(R.id.tvTemperatureMin);
		tvTempMax = (TextView) findViewById(R.id.tvTemperatureMax);
		tvHum = (TextView) findViewById(R.id.tvHumidityValue);
		tvPressure = (TextView) findViewById(R.id.tvPressure);
		tvWindSpeed = (TextView) findViewById(R.id.tvWindSpeed);
		tvWindDirecction = (TextView) findViewById(R.id.tvWindDirecction);
		tvClouds = (TextView) findViewById(R.id.tvClouds);
		tvPrecipitation = (TextView) findViewById(R.id.tvPrecipitation);
        layoutPrincipal = findViewById(R.id.layoutPrincipal);


		if (!ciudad.equals("")) {
			CargarXmlTask tarea = new CargarXmlTask();
			String url = "http://api.openweathermap.org/data/2.5/weather?q=" + ciudad + "&lang=es&units=metric&mode=xml&appid=7c35b4150638f67554e2148011b5d934";
			tarea.execute(url);
		}
		CargarXmlTask tarea = new CargarXmlTask();
		tarea.execute("http://api.openweathermap.org/data/2.5/weather?q=Madrid&lang=es&units=metric&mode=xml&appid=7c35b4150638f67554e2148011b5d934");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		//noinspection SimplifiableIfStatement

		switch (id){
			case R.id.otraCiudad:
				DialogFragment dialog = new DialogoBuscar();
				dialog.show(getFragmentManager(), "Buscar");
				break;
		}

		return super.onOptionsItemSelected(item);
	}


}

