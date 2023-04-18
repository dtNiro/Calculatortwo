package com.example.calculator_linear_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calculate(View view){
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);

        Scanner in = new Scanner(textView.getText().toString());
        String str = in.next();

        Double result = null;
        String[] numbers;

        if(str.indexOf( '+' )>0){
            numbers = str.split( "[+]" );
            result = Double.parseDouble( numbers[0] ) + Double.parseDouble( numbers[1] );
        }else if(str.indexOf( '-' )>0){
            numbers = str.split( "[-]" );
            result = Double.parseDouble( numbers[0] ) - Double.parseDouble( numbers[1] );
        }else if(str.indexOf( '/' )>0){
            numbers = str.split( "[/]" );
            result = Double.parseDouble( numbers[0] ) / Double.parseDouble( numbers[1] );
        }else if(str.indexOf( '*' )>0){
            numbers = str.split( "[*]" );
            result = Double.parseDouble( numbers[0] ) * Double.parseDouble( numbers[1] );
        }else{

        }
        textView2.setText(Double.toString(result));
    }
    public void in(View view){
        TextView textView = findViewById(R.id.textView);
        Button button = (Button)view;
        String time = textView.getText().toString();
        textView.setText(time + button.getText().toString() );
    }
    public void C(View view){
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        textView.setText("");
        textView2.setText("");
    }
}