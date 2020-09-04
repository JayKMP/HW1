package th.ac.su.cp.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckID extends AppCompatActivity {
    String n = "1111111111111";
    String m = "2222222222222";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_i_d);
        Button button2 =findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numberEditText = findViewById(R.id.Number);
                String numTaxe = numberEditText.getText().toString();
                if(numTaxe.length()==13){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(CheckID.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิ์อีกครั้ง");
                    dialog.setPositiveButton("OK",null);
                    if(numTaxe.equals(n)||numTaxe.equals(m)){
                        dialog.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง");
                    }
                    else{
                        dialog.setMessage("คุณไม่่มีสิทธิ์เลือกตั้ง");
                    }
                    dialog.show();
                }
                else{
                    Toast toast = Toast.makeText(
                            CheckID.this,
                            "กรุณากรอกหมายเลชบัตรประชาชน 13 หลัก",
                            Toast.LENGTH_LONG
                    );
                    toast.show();
                }
            }
        });
    }
}
