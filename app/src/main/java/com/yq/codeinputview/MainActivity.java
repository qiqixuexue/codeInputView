package com.yq.codeinputview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.yq.codeinputview.view.CodeInputView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements CodeInputView.IPayCode{

    @Bind(R.id.code_input)
    CodeInputView codeInputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        ButterKnife.bind(this);
        codeInputView.setListener(this);
    }

    @Override
    public void getPayCode(String value) {
        Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
    }
}
