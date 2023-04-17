package com.example.water;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtWaterConsumption;
    private Button btnCalculate;
    private TextView tvTotalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWaterConsumption = findViewById(R.id.edt_water_consumption);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvTotalCost = findViewById(R.id.tv_total_cost);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị được nhập từ trường edtWaterConsumption
                String strWaterConsumption = edtWaterConsumption.getText().toString();

                // Chuyển đổi giá trị được nhập từ chuỗi sang số
                int waterConsumption = Integer.parseInt(strWaterConsumption);

                // Tính số tiền phải trả dựa trên giá tiền của mỗi khối nước là 5000đ
                int totalCost = waterConsumption * 5000;

                // Hiển thị số tiền phải trả cho người dùng
                tvTotalCost.setText(String.valueOf(totalCost) + " đồng");
            }
        });
    }
}
