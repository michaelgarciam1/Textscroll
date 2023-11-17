package com.example.textscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    private Button mEdit;
    private EditText text;
    private boolean editActive=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText) findViewById(R.id.article);
        mEdit=(Button) findViewById(R.id.boton);
        mEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarTexto();
            }
        });
    }

    private void cambiarTexto(){
//        text= (TextView) findViewById(R.id.articleEditable);

        if(!editActive){
            text.setFocusable(true);
            text.setTextIsSelectable(true);
            mEdit.setText("Guardar Seleccion");
            editActive=true;

        }else{
            text.setFocusable(false);
            text.setTextIsSelectable(false);
            mEdit.setText("Add Comment");
            editActive=false;
        }
    }
}