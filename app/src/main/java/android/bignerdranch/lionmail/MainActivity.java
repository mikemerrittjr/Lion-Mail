package android.bignerdranch.lionmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.idName);
        Password = (EditText)findViewById(R.id.idPassword);
        Login = (Button)findViewById(R.id.btnLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLocationPage();
            }
        });
        Register = (Button)findViewById(R.id.btnRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterPage();
            }
        });
    }

    public void openRegisterPage() {
        Intent intent = new Intent(this, RegisterPage.class);
        startActivity(intent);
    }

    public void openLocationPage(){
        Intent intent = new Intent(this, LocationPage.class);
        startActivity(intent);
    }
}
