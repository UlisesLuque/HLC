package com.examples.android.xml;

import java.util.List;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.examples.android.xml.Noticia;
import com.examples.android.xml.RssParserSax;

public class MainActivity extends Activity {

	private Button btnCargar;
	private TextView txtResultado;
	
	private List<Noticia> noticias;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnCargar = (Button)findViewById(R.id.btnCargar);
		txtResultado = (TextView)findViewById(R.id.txtResultado);
		
		btnCargar.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				CargarXmlTask tarea = new CargarXmlTask();
		        tarea.execute("http://212.170.237.10/rss/rss.aspx");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private class CargarXmlTask extends AsyncTask<String,Integer,Boolean> {
		 
	    protected Boolean doInBackground(String... params) {
	 
	    	RssParserSax saxparser =
					new RssParserSax(params[0]);
	        
			noticias = saxparser.parse();
	 
	        return true;
	    }
	    
	    protected void onPostExecute(Boolean result) {
	    	

			txtResultado.setText("");
	        for(int i=0; i<noticias.size(); i++)
	        {
	        	txtResultado.setText(
	        		txtResultado.getText().toString() + 
	        			System.getProperty("line.separator") + 
	        			noticias.get(i).getTitulo());
	        }
	    }
	}
}
