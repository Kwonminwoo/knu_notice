package com.example.knu_notice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// Scrapview 액티비티에서 리사이클러뷰 어댑터

public class ScrapViewAdapter extends RecyclerView.Adapter<ScrapViewAdapter.ViewHolder> {

    ArrayList<Scrap> array_items = new ArrayList<Scrap>();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // 인플레이션을 통해 뷰 객체 만들기
        View itemView = inflater.inflate(R.layout.layout_scrap_list, parent, false);

        // 뷰홀더 객체를 생성하면서 뷰 객체를 전달하고 그 뷰홀더 객체 반환
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Scrap item = array_items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return array_items.size();
    }

    // 이 어댑터를 사용하는 소스 코드에서 어댑터에 Scrap 객체를 넣거나 가져갈 수 있도록 addItem(), setItems(), getItem(), setItem() 메소드 추가
    public void addItem(Scrap item) {
        array_items.add(item);
    }

    public void setItems(ArrayList<Scrap> array_items) {
        this.array_items = array_items;
    }

    public Scrap getItem(int position) {
        return array_items.get(position);
    }

    public void setItem(int position, Scrap item) {
        array_items.set(position, item);
    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_num;
        TextView text_classification;
        TextView text_title;
        TextView text_date;

        // 뷰홀더 생성자로 전달되는 뷰 객체 참조하기
        public ViewHolder(View view) {
            super(view);

            text_num = view.findViewById(R.id.notice_num_sv);
            text_classification = view.findViewById(R.id.notice_classification_sv);
            text_title = view.findViewById(R.id.notice_title_sv);
            text_date = view.findViewById(R.id.notice_date_sv);

        }

        // 뷰 객체에 들어 있는 텍스트뷰 참조하기
        public void setItem(Scrap item) {
            text_num.setText(Integer.toString(item.getNum()));
            text_classification.setText(item.getClassification());
            text_title.setText(item.getTitle());
            text_date.setText(item.getDate());
        }

    }

}
