package br.com.mateusrovari.testmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mateusrovari.logger.Logger;

public class MainActivity extends AppCompatActivity {

    private Button logButton;
    private EditText messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logButton = findViewById(R.id.log_button);
        messageEditText = findViewById(R.id.edt_log);

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String messageToLog = messageEditText.getText().toString();
                new Logger().error(messageToLog);
            }
        });
    }
}
