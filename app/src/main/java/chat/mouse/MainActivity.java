package chat.mouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsername,edtPassword,edtEmail;
    private Button btnSubmit;
    private TextView txtLoginInfo;

    private boolean isSigningUp=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail=findViewById(R.id.edtEmail);
        edtPassword=findViewById(R.id.edtPassword);
        edtUsername=findViewById(R.id.edtUsername);

        btnSubmit=findViewById(R.id.btnSubmit);

        txtLoginInfo=findViewById(R.id.txtLoginInfo);


        txtLoginInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSigningUp){
                    isSigningUp=false;
                    edtUsername.setVisibility(View.GONE);
                    btnSubmit.setText("Iniciar Sesion");
                    txtLoginInfo.setText("No tienes una cuenta? Registrate");
                }else{
                    isSigningUp=true;
                    edtUsername.setVisibility(View.VISIBLE);
                    btnSubmit.setText("Registrarse");
                    txtLoginInfo.setText("Ya tienes una cuenta? Inicia sesion");
                }
            }
        });
    }
}