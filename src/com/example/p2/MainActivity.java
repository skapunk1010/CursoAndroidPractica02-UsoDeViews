package com.example.p2;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {
	private EditText nombre;
	private RadioGroup carreras;
	private RadioButton carreraSeleccionada;
	private Button btnAceptar;
	private TextView txtResultado;
	private CheckBox checkC;
	private CheckBox checkJava;
	private CheckBox checkCSharp;
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.carreras = (RadioGroup) findViewById(R.id.radioGroupCarreras);
		nombre = (EditText)findViewById(R.id.editText1);
		btnAceptar = (Button)findViewById(R.id.buttonAceptar);
		txtResultado = (TextView)findViewById(R.id.txtResultado);
		checkC = (CheckBox)findViewById(R.id.checkBoxC);
		checkJava = (CheckBox)findViewById(R.id.checkBoxJava);
		checkCSharp = (CheckBox)findViewById(R.id.CheckBoxCSharp);
		
		btnAceptar.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view) {
				String usuario = nombre.getText().toString();
				
				int seleccionada = carreras.getCheckedRadioButtonId();
				carreraSeleccionada = (RadioButton)findViewById(seleccionada);
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
