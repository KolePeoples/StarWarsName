package com.zybooks.starwarsname;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables for widgets
    private TextView appHeaderTextView;
    private TextView firstNamePromptTextView;
    private TextView lastNamePromptTextView;
    private TextView maidenNamePromptTextView;
    private TextView cityNamePromptTextView;
    private ImageView starWarsImageView;
    private TextView finalOutputTextView;
    private EditText firstNameInput;
    private EditText lastNameInput;
    private EditText maidenNameInput;
    private EditText cityNameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning widgets to fields
        firstNamePromptTextView = findViewById(R.id.first_name_prompt_text_view);
        lastNamePromptTextView = findViewById(R.id.last_name_prompt_text_view);
        maidenNamePromptTextView = findViewById(R.id.maiden_name_prompt_text_view);
        cityNamePromptTextView = findViewById(R.id.city_name_prompt_text_view);
        finalOutputTextView = findViewById(R.id.name_output);
        starWarsImageView = findViewById(R.id.starWarsImageView);
        firstNameInput = findViewById(R.id.first_name_input);
        lastNameInput = findViewById(R.id.last_name_input);
        maidenNameInput = findViewById(R.id.maiden_name_input);
        cityNameInput = findViewById(R.id.city_name_input);
    }

    //Generates star wars name by pulling characters from inputs
    public void generateName(View view) {
        String getFirstNameChar = firstNameInput.getText().toString();
        String getLastNameChar = lastNameInput.getText().toString();
        String getMaidenChar = maidenNameInput.getText().toString();
        String getCityChar = cityNameInput.getText().toString();
        String starWarsFirstName = "";
        String starWarsLastName = "";
        String starWarsName;
        starWarsFirstName += getLastNameChar.charAt(0);
        starWarsFirstName += getLastNameChar.charAt(1);
        starWarsFirstName += getLastNameChar.charAt(2);
        starWarsFirstName += getFirstNameChar.charAt(0);
        starWarsFirstName += getFirstNameChar.charAt(1);

        starWarsLastName += getMaidenChar.charAt(0);
        starWarsLastName += getMaidenChar.charAt(1);
        starWarsLastName += getCityChar.charAt(0);
        starWarsLastName += getCityChar.charAt(1);
        starWarsLastName += getCityChar.charAt(2);

        finalOutputTextView.setText("May the force be with you " + starWarsFirstName + " " + starWarsLastName + "!");
    }
}