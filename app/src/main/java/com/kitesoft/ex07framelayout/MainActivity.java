package com.kitesoft.ex07framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutKorea;
    LinearLayout layoutJapan;
    LinearLayout layoutChina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FrmaeLayout안에 있는 자식뷰들 3개를 참조해오기
        layoutKorea= findViewById(R.id.layout_korea);
        layoutJapan= findViewById(R.id.layout_japan);
        layoutChina= findViewById(R.id.layout_china);
    }

    // 버튼들 중 하나를 클릭하였을 때 자동으로 실행되는 콜백메소드 ( 버튼들에 onclick속성으로 지정된 메소드 )
    public void clickBtn(View v){

        // 우선 3개의 자식뷰들을 모두 보이지 않도록 하고..
        layoutKorea.setVisibility(View.GONE);
        layoutJapan.setVisibility(View.GONE);
        layoutChina.setVisibility(View.GONE);

        switch ( v.getId() ){
            case R.id.btn01: // KOREA 버튼을 클릭하였을 때 첫번째 자식뷰(태극기이미지와 KOREA글씨) 보이기
                layoutKorea.setVisibility(View.VISIBLE);
                break;

            case R.id.btn02: // JAPAN 버튼을 클릭하였을 때 두번째 자식뷰(일본국기이미지와 JAPAN글씨) 보이기
                layoutJapan.setVisibility(View.VISIBLE);
                break;

            case R.id.btn03: // CHINA 버튼을 클릭하였을 때 세번째 자식뷰(중국국기이미지와 CHINA글씨) 보이기
                layoutChina.setVisibility(View.VISIBLE);
                break;
        }
    }

}
