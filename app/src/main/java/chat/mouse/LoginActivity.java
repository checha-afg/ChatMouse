package chat.mouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText numero,codigo;
    private Button enviar_numero,enviar_codigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        numero=(EditText)findViewById(R.id.numero);
        codigo=(EditText)findViewById(R.id.codigo);

        enviar_numero=(Button)findViewById(R.id.enviar_numero);
        enviar_codigo=(Button)findViewById(R.id.enviar_codigo);
    }
}