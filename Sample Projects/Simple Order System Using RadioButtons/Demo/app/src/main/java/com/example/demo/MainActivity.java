package com.example.demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnOrder;

    RadioButton rbBeef, rbChicken, rbPork;

    CheckBox cbCheese, cbOnion, cbSalad;

    TextView tvOrder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnOrder = findViewById(R.id.btnOrder);
        rbBeef = findViewById(R.id.rbBeef);
        rbChicken = findViewById(R.id.rbChicken);
        rbPork = findViewById(R.id.rbPork);
        tvOrder = findViewById(R.id.tvOrder);

        cbCheese = findViewById(R.id.cbCheese);
        cbOnion= findViewById(R.id.cbOnion);
        cbSalad = findViewById(R.id.cbSalad);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String order = "You ordered a burger with";

                if (rbBeef.isChecked()) {
                    order = order.concat(" \n- Beef");
                } else if (rbChicken.isChecked()) {
                    order = order.concat(" \n- Chicken");
                } else if (rbPork.isChecked()) {
                    order = order.concat(" \n- Pork");
                }

                if (cbCheese.isChecked()) {
                    order = order.concat(" \n- Cheese");
                }

                if (cbOnion.isChecked()) {
                    order = order.concat(" \n- Onion");
                }

                if (cbSalad.isChecked()) {
                    order = order.concat(" \n- Salad");
                }

                tvOrder.setText(order);
            }
        });
    }
}