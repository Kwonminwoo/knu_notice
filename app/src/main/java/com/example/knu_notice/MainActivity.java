package com.example.knu_notice;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.example.knu_notice.main_recyclerview.Common;
import com.example.knu_notice.main_recyclerview.CommonAdapter;

public class MainActivity extends AppCompatActivity {

    CommonAdapter commonAdapter;

    private ActivityResultLauncher<Intent> resultLauncher;

    View view_common;
    View view_kongju;
    View view_cheonan;
    View view_yesan;
    View view_else;

    RecyclerView re_common;
    RecyclerView re_kongju;
    RecyclerView re_cheonan;
    RecyclerView re_yesan;
    RecyclerView re_else;

    int nBefore = 0;

    int[] num = {1,1,1,1,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 액티비티 콜백 함수
        resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == RESULT_OK) {
                            // 인자로 받은 result에 전달받은 데이터가 존재함
                            Intent intent = result.getData();
                            int CallType = intent.getIntExtra("CallType", 0);
                            if (CallType == 0) {
                                // 코드 작성
                            } else if (CallType == 1) {
                                // 테스트용 코드
//                                TextView textView = findViewById(R.id.main_title);
//                                textView.setText("성공");
                            }
                        }
                    }
                });

        // 리사이클러뷰 데이터 삽입
        RecyclerView recyclerView_common = findViewById(R.id.main_common_list);
        RecyclerView recyclerView_kongju = findViewById(R.id.main_kongju_list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView_common.setLayoutManager(linearLayoutManager);
        commonAdapter = new CommonAdapter();
        recyclerView_common.setAdapter(commonAdapter);

        Common common = new Common(1, "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.06.13.", R.drawable.star_unselected);
        commonAdapter.addItem(common);
        common = new Common(2, "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔 게시판 제목 개길지 엄청 길지 짱길지", "2022.06.16.", R.drawable.star_unselected);
        commonAdapter.addItem(common);
        common = new Common(3, "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.06.21.", R.drawable.star_selected);
        commonAdapter.addItem(common);
        common = new Common(1, "1. rptlrmfdfljfljfjflkjfsfjlsfak", "2022.06.13.", R.drawable.star_unselected);
        commonAdapter.addItem(common);
        common = new Common(2, "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔 게시판 제목 개길지 엄청 길지 짱길지", "2022.06.16.", R.drawable.star_unselected);
        commonAdapter.addItem(common);
        common = new Common(3, "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔 게시판 제목 개길지 엄청 길지 짱길지", "2022.06.21.", R.drawable.star_selected);
        commonAdapter.addItem(common);










        // 화면 전환
        findViewById(R.id.screen_change_btn_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScrapviewActivity.class);
                intent.putExtra("CallType", 1);
                resultLauncher.launch(intent);
            }
        });


        // 클릭 시 탭 열기 / 닫기 기능
        view_common = findViewById(R.id.line_common);
        view_kongju = findViewById(R.id.line_kongju);
        view_cheonan = findViewById(R.id.line_cheonan);
        view_yesan = findViewById(R.id.line_yesan);
        view_else = findViewById(R.id.line_else);

        re_common = findViewById(R.id.main_common_list);
        re_kongju = findViewById(R.id.main_kongju_list);
        re_cheonan = findViewById(R.id.main_cheonan_list);
        re_yesan = findViewById(R.id.main_yesan_list);
        re_else = findViewById(R.id.main_else_list);

        // 공통 탭
        findViewById(R.id.common_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[0] == 1) {
                    // num 이 1이면 사라지게 하기
                    view_common.setVisibility(View.GONE);
                    re_common.setVisibility(View.GONE);
                    num[0] = 0;
                } else {
                    view_common.setVisibility(View.VISIBLE);
                    re_common.setVisibility(View.VISIBLE);
                    num[0] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_0));
            }
        });

        // 공주 탭
        findViewById(R.id.kongju_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[1] == 1) {
                    // num 이 1이면 사라지게 하기
                    view_kongju.setVisibility(View.GONE);
                    re_kongju.setVisibility(View.GONE);
                    num[1] = 0;
                } else {
                    view_kongju.setVisibility(View.VISIBLE);
                    re_kongju.setVisibility(View.VISIBLE);
                    num[1] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_1));
            }
        });

        findViewById(R.id.cheonan_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[2] == 1) {
                    // num 이 1이면 사라지게 하기
                    view_cheonan.setVisibility(View.GONE);
                    re_cheonan.setVisibility(View.GONE);
                    num[2] = 0;
                } else {
                    view_cheonan.setVisibility(View.VISIBLE);
                    re_cheonan.setVisibility(View.VISIBLE);
                    num[2] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_2));
            }
        });

        findViewById(R.id.yesan_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[3] == 1) {
                    // num 이 1이면 사라지게 하기
                    view_yesan.setVisibility(View.GONE);
                    re_yesan.setVisibility(View.GONE);
                    num[3] = 0;
                } else {
                    view_yesan.setVisibility(View.VISIBLE);
                    re_yesan.setVisibility(View.VISIBLE);
                    num[3] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_3));
            }
        });

        findViewById(R.id.else_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[4] == 1) {
                    // num 이 1이면 사라지게 하기
                    view_else.setVisibility(View.GONE);
                    re_else.setVisibility(View.GONE);
                    num[4] = 0;
                } else {
                    view_else.setVisibility(View.VISIBLE);
                    re_else.setVisibility(View.VISIBLE);
                    num[4] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_4));
            }
        });


    }

    public void rotateIcon(ImageView imageView) {
        int i = nBefore + 180;
        RotateAnimation ra = new RotateAnimation(
                nBefore,
                i,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        ra.setDuration(250);
        ra.setFillAfter(true);
        imageView.startAnimation(ra);
        nBefore = i;
    }
}