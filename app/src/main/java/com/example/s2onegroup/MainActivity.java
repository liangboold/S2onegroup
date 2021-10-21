package com.example.s2onegroup;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.s2onegroup.fragment.FindFragment;
import com.example.s2onegroup.fragment.MainFragment;
import com.example.s2onegroup.fragment.MyFragment;
import com.example.s2onegroup.fragment.SofaFragment;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg;
    private ImageView fabu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initView();
        sou();
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.sou:
                        sou();
                        break;
                    case R.id.sofa:
                        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.fra,new SofaFragment());
                        fragmentTransaction1.commit();
                        break;
                    case R.id.find:
                        FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.fra,new FindFragment());
                        fragmentTransaction2.commit();
                        break;
                    case R.id.mine:
                        FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.fra,new MyFragment());
                        fragmentTransaction3.commit();
                        break;
                }
            }
        });
        fabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "111", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void sou() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fra,new MainFragment());
        fragmentTransaction.commit();
    }
    private void initView() {
        rg = (RadioGroup) findViewById(R.id.rg);
        fabu = (ImageView) findViewById(R.id.fabu);
    }
}