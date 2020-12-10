package android.bignerdranch.lionmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterPage extends AppCompatActivity {
    private TextView SignUp;
    private EditText FullName;
    private EditText UserName;
    private EditText Email;
    private EditText Password;
    private Button Finish; 


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        SignUp = (TextView)findViewById(R.id.tvSignUp);
        FullName = (EditText)findViewById(R.id.hntFullName);
        UserName = (EditText)findViewById(R.id.hntFullName);
        Email = (EditText)findViewById(R.id.hntEmail);
        Password = (EditText)findViewById(R.id.hntPassword);
        Finish = (Button)findViewById(R.id.btnFinish);
        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLocationPage();
            }
        });
    }

    public void openLocationPage() {
        Intent intent = new Intent(this, LocationPage.class);
        startActivity(intent);
    }
}
