package com.example.user.software;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 *  리스트 뷰의 각 아이템에 대한 화면구성을 위한 클래스
 */

public class DiagnosisItemView extends LinearLayout {

    TextView txtName, txtSymptom;
    ImageView imageView;

    public DiagnosisItemView(Context context) {
        super(context);

        init(context);
    }

    public DiagnosisItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.diagnosis_item, this, true);

        txtName = (TextView) findViewById(R.id.txtName);
        txtSymptom = (TextView) findViewById(R.id.txtSymptom);
        imageView = (ImageView) findViewById(R.id.imageView);

    }

    public void setName(String name) {
        txtName.setText(name);
    }

    public void setSymptom(String symptom) {
        txtSymptom.setText(symptom);
    }

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
}
