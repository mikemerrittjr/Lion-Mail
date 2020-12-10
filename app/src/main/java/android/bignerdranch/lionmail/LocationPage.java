package android.bignerdranch.lionmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LocationPage extends AppCompatActivity {

    private TextView BuildingLocation;
    private Button Young;
    private Button Commons;
    private Button Centennial;
    private Button Scholars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_page);

        BuildingLocation = (TextView)findViewById(R.id.tvBuildingLocation);
        Young = (Button)findViewById(R.id.btnYoung);
        Young.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYoungPage();
            }
        });
        Commons = (Button)findViewById(R.id.btnCommons);
        Commons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCommonsPage();
            }
        });
        Centennial = (Button)findViewById(R.id.btnCentennial);
        Centennial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCentennialPage();
            }
        });
        Scholars = (Button)findViewById(R.id.btnScholars);
        Scholars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScholarsPage();
            }
        });
    }

    public void openYoungPage(){
        Intent intent = new Intent(this, YoungPage.class);
        startActivity(intent);
    }

    public void openCommonsPage(){
        Intent intent = new Intent(this, CommonsPage.class);
        startActivity(intent);
    }

    public void openCentennialPage(){
        Intent intent = new Intent(this, CentennialPage.class);
        startActivity(intent);
    }
    public void openScholarsPage(){
        Intent intent = new Intent(this, ScholarsPage.class);
        startActivity(intent);
    }


}
