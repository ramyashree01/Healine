package com.master.healine;




import androidx.annotation.Nullable;
        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

        import com.google.android.material.button.MaterialButton;
        import com.google.zxing.integration.android.IntentIntegrator;
        import com.google.zxing.integration.android.IntentResult;

public class ScannerActivity extends AppCompatActivity {

    MaterialButton ScanBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        ScanBtn = findViewById(R.id.scan_Id);

        ScanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                IntentIntegrator intentIntegrator = new IntentIntegrator(ScannerActivity.this);

                intentIntegrator.setPrompt("For flush use volumes up key");

                intentIntegrator.setBeepEnabled(true);

                intentIntegrator.setCaptureActivity(Capture.class);

                intentIntegrator.initiateScan();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        IntentResult intentResult =IntentIntegrator.parseActivityResult(requestCode,resultCode,data);

        if(intentResult.getContents()  != null)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(ScannerActivity.this);

            builder.setTitle("Result");

            builder.setMessage(intentResult.getContents());
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            builder.show();

        }
        else
        {
            Toast.makeText(this,"OOPs",Toast.LENGTH_SHORT).show();
        }
    }
}