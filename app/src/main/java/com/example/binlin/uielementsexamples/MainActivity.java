package com.example.binlin.uielementsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;
    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        aSwitch = findViewById(R.id.switch2);

        textView.setText("This Is Just A Test");
        setListeners();


    }

    private void setListeners() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // take input from editText and set as value for textView
                textView.setText(editText.getText());
            }
        });
        aSwitch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(aSwitch.isChecked()){
                    Toast.makeText(MainActivity.this, "IsOn", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "IsOff", Toast.LENGTH_LONG).show();
                }
            }
        });
}

}