package com.example.myapplication324;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private TextView mTextView;
    private TextView selection;
    private TextView mInfoTextView;
    private EditText editTextAge;
    private EditText editTextPIB;
    private int myPoint = 0;
    private CheckBox check_experience;
    private CheckBox check_team_skills;
    private CheckBox check_trips;
    int box1 = 0;
    int box2 = 0;
    int box3 = 0;
    int rad1 = 0;
    int rad2 = 0;
    int rad3 = 0;
    int rad4 = 0;
    int rad5 = 0;

    int agee;



    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SeekBar seekBar = findViewById(R.id.seekBar);
        final CheckBox check_experience = findViewById(R.id.check_experience);
        final CheckBox check_team_skills = findViewById(R.id.check_team_skills);
        final CheckBox check_trips = findViewById(R.id.check_trips);
        final RadioGroup group_zero = findViewById(R.id.group_zero);
        final RadioGroup group_one = findViewById(R.id.group_one);
        final RadioGroup group_two = findViewById(R.id.group_two);
        final RadioGroup group_tree = findViewById(R.id.group_tree);
        final RadioGroup group_four = findViewById(R.id.group_four);
        final TextView name_view = findViewById(R.id.name_view);
        final EditText  age = findViewById(R.id.age);
        seekBar.setOnSeekBarChangeListener(this);
        mTextView = findViewById(R.id.textView22);
        mTextView.setText("Ur desired salary in dollar: 0");

        group_four.clearCheck();
        group_zero.clearCheck();
        group_one.clearCheck();
        group_tree.clearCheck();
        group_two.clearCheck();
        Button mCrowsCounterButton = findViewById(R.id.buttonCounter);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check_experience.isChecked()){
                    box1=2;
                }
                if(check_team_skills.isChecked()){
                    box2=1;
                }
                if(check_trips.isChecked()){
                    box3=1;
                }



                group_four.setOnCheckedChangeListener((group, checkedId) -> {
                    if (checkedId == R.id.group_four_01) {
                        rad1 = 2;
                    }
                });
                group_tree.setOnCheckedChangeListener((group, checkedId) -> {
                    if (checkedId == R.id.group_tree_01) {
                        rad2 = 2;
                    }
                });
                group_two.setOnCheckedChangeListener((group, checkedId) -> {
                    if (checkedId == R.id.group_two_01) {
                        rad3 = 2;
                    }
                });
                group_one.setOnCheckedChangeListener((group, checkedId) -> {
                    if (checkedId == R.id.group_one_01) {
                        rad4 = 2;
                    }
                });
                group_zero.setOnCheckedChangeListener((group, checkedId) -> {
                    if (checkedId == R.id.group_zero_02) {
                        rad5 = 2;
                    }
                });
                Toast toast = Toast.makeText(MainActivity.this,"Sorry, you didn't pass", Toast.LENGTH_LONG);
                toast.show();
                myPoint= box1+box2+box3+rad1+rad2+rad3+rad4+rad5;
//                age = 30;
                agee = Integer.parseInt((age.getText()).toString());
//                if(myPoint>9&&seekBar.getProgress()<1600&&agee>21&&agee<40&&seekBar.getProgress()>800){
//                    Toast toast = Toast.makeText(MainActivity.this,"Grac, u passed", Toast.LENGTH_LONG);
//                    toast.show();
//                } else{
//                    Toast toast = Toast.makeText(MainActivity.this,"Sorry, you didn't pass", Toast.LENGTH_LONG);
//                    toast.show();
//                }
            }
        });
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        mTextView.setText("Salary: " +seekBar.getProgress()+"$");

    }
}
