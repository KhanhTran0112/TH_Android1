package khanhtv.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button Order, Clear;
    EditText nameDrink;
    TextView yourDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Order = findViewById(R.id.btnOrder);
        Clear = findViewById(R.id.btnClear);
        nameDrink = findViewById(R.id.txtName);
        yourDrink = findViewById(R.id.yourDrink);

        if(nameDrink.getText().toString() == ""){
            Order.setEnabled(false);
        }else{
            Order.setEnabled(true);
        }

        if (yourDrink.getText() ==""){
            Clear.setEnabled(false);
        }else{
            Clear.setEnabled(true);
        }
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yourDrink.setText("Bạn đã đặt món: "+nameDrink.getText());
                nameDrink.setText("");
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yourDrink.setText("");
            }
        });
    }
}
