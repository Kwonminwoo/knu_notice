package com.example.knu_notice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ScrapviewActivity extends AppCompatActivity {


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.none, R.anim.right_out); // 오른쪽으로 사라지는 애니메이션
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.right_in, R.anim.none); // 오른쪽에서 등장하는 애니메이션
        setContentView(R.layout.activity_scrapview);

        RecyclerView recyclerView = findViewById(R.id.scrap_list);

        // 리싸이클러뷰에 레이아웃 매니저 설정하기
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ScrapViewAdapter adapter = new ScrapViewAdapter();

        recyclerView.setAdapter(adapter);

        // 리싸이클러뷰에 어댑터 설정하기
        Scrap scrap = new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17.");
        adapter.addItem(scrap);

        scrap = new Scrap(125, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17.");
        adapter.addItem(scrap);

        adapter.addItem(new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17."));
        adapter.addItem(new Scrap(173, "[천안]", "게시글 제목2 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.18."));
        adapter.addItem(new Scrap(174, "[공통]", "게시글 제목3 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.21."));
        adapter.addItem(new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17."));
        adapter.addItem(new Scrap(173, "[천안]", "게시글 제목2 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.18."));
        adapter.addItem(new Scrap(174, "[공통]", "게시글 제목3 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.21."));
        adapter.addItem(new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17."));
        adapter.addItem(new Scrap(173, "[천안]", "게시글 제목2 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.18."));
        adapter.addItem(new Scrap(174, "[공통]", "게시글 제목3 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.21."));
        adapter.addItem(new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17."));
        adapter.addItem(new Scrap(173, "[천안]", "게시글 제목2 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.18."));
        adapter.addItem(new Scrap(174, "[공통]", "게시글 제목3 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.21."));
        adapter.addItem(new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17."));
        adapter.addItem(new Scrap(173, "[천안]", "게시글 제목2 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.18."));
        adapter.addItem(new Scrap(174, "[공통]", "게시글 제목3 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.21."));
        adapter.addItem(new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17."));
        adapter.addItem(new Scrap(173, "[천안]", "게시글 제목2 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.18."));
        adapter.addItem(new Scrap(174, "[공통]", "게시글 제목3 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.21."));
        adapter.addItem(new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17."));
        adapter.addItem(new Scrap(173, "[천안]", "게시글 제목2 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.18."));
        adapter.addItem(new Scrap(174, "[공통]", "게시글 제목3 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.21."));


        findViewById(R.id.screen_change_btn_sc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 책에 나온 코드
                // 인텐트 객체 생성하고 name의 값을 부가 데이터로 넣기
//                Intent intent = new Intent();
//                intent.putExtra("name", "hello");
                // 응답 보내기
//                setResult(RESULT_OK, intent);
//                finish();

                // https://fireheal.tistory.com/5 참고
                // MainActivity가 전달한 인텐트 받기
                Intent intent = getIntent();
//                intent.putExtra("subData", tv_subdata.getText()); // 텍스트뷰의 문자열을 "subData"라는 이름으로 인텐트에 등록
                intent.putExtra("CallType", 1);
                // 반환할 결과 코드와 인텐트 등록
                setResult(RESULT_OK, intent);
                // 액티비티 끝냄 = 이전(메인) 액티비티로 돌아감
                finish();


            }
        });


    }
}