package com.examples.android.xml;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;

public class CargarXmlTask extends AsyncTask<String,Integer,Boolean> {

	protected Boolean doInBackground(String... params) {

		RssParserSax saxparser =
				new RssParserSax(params[0]);

		MainActivity.noticia = saxparser.parse();

		return true;
	}

	protected void onPostExecute(Boolean result) {

		MainActivity.tvCiudad.setText(MainActivity.noticia.getCityName());
		MainActivity.tvGrados.setText(MainActivity.noticia.getTemperatureValue() + "º");
		MainActivity.tvWeatherValue.setText(MainActivity.noticia.getWeatherValue());
		MainActivity.tvHumidity.setText(MainActivity.noticia.getHumidityValue()+ MainActivity.noticia.getHumidityUnite());
		MainActivity.tvTemperaturaMin.setText(MainActivity.noticia.getTemperatureMin() + "º");
		MainActivity.tvTemperaturaMax.setText(MainActivity.noticia.getTemperatureMax() + "º");
		MainActivity.tvViento.setText(MainActivity.noticia.getWindSpeedValue() + " m/s");
		MainActivity.tvCoordLon.setText(MainActivity.noticia.getCoordLon() + "º");
		MainActivity.tvCoordLat.setText(MainActivity.noticia.getCoordLat() + "º");
		MainActivity.tvPais.setText(MainActivity.noticia.getCountry());
		MainActivity.tvSunRise.setText(MainActivity.noticia.getSunRise());
		MainActivity.tvSunSet.setText(MainActivity.noticia.getSunSet());
		MainActivity.tvTempValue.setText(MainActivity.noticia.getTemperatureValue() + " ºC");
		MainActivity.tvTempMin.setText(MainActivity.noticia.getTemperatureMin() + " ºC");
		MainActivity.tvTempMax.setText(MainActivity.noticia.getTemperatureMax() + " ºC");
		MainActivity.tvHum.setText(MainActivity.noticia.getHumidityValue() + MainActivity.noticia.getHumidityUnite());
		MainActivity.tvPressure.setText(MainActivity.noticia.getPressureValue() + MainActivity.noticia.getPressureUnit());
		MainActivity.tvWindSpeed.setText(MainActivity.noticia.getWindSpeedValue() + "Km/s");
		MainActivity.tvWindDirecction.setText(MainActivity.noticia.getWindDirectionValue() + ", " + MainActivity.noticia.getWindDirectionName());
		MainActivity.tvClouds.setText(MainActivity.noticia.getCloudsValue() + ", " + MainActivity.noticia.getCloudsName());
		MainActivity.tvPrecipitation.setText(MainActivity.noticia.getPrecipitation());
        String icon = MainActivity.noticia.getWeatherIcon();

		Log.d("icon", MainActivity.noticia.getWeatherIcon());
		if(icon.equals("01d")){
			MainActivity.layoutPrincipal.setBackgroundResource(R.drawable.soleado);
		} else if (icon.equals("10d") || icon.equals("10n")){
			MainActivity.layoutPrincipal.setBackgroundResource(R.drawable.lluvia);
		} else if (icon.equals("04n") || icon.equals("02d")){
			MainActivity.layoutPrincipal.setBackgroundResource(R.drawable.nublado);
		} else {
			//MainActivity.layoutPrincipal.setBackgroundResource(R.drawable.soleado);
		}



	}
}
