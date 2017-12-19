package com.example.user.software;

/**
 * Created by user on 2017-11-07.
 * ListViewActivity에서 ListView에 추가할 객체에 대한 정보
 */

public class DiagnosisItem {

    String name;        // 진단 or 병충해 이름
    String symptom;     // 진단의 경우 정확도
    int resId;          // 진단의 사례 사진
    int num;

    public DiagnosisItem(int num, String name, String symptom, int resId) {
        this.num = num;
        this.name = name;           //  생성자
        this.symptom = symptom;
        this.resId = resId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public String toString() {
        return "DiagnosisItem{" + "name='" + name + '\'' + ", symptom='" + symptom + '\'' + '}';

    }   // 객체의 데이터를 스트링화
}
