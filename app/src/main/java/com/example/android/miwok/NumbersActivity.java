package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word ("lutti","One",R.drawable.number_one));
        words.add(new Word("ottiko","Two",R.drawable.number_two));
        words.add(new Word("tolookosu","Three",R.drawable.number_three));
        words.add(new Word ("oyyisa","Four",R.drawable.number_four));
        words.add(new Word ("massokka","Five",R.drawable.number_five));
        words.add(new Word("temmokka","Six",R.drawable.number_six));
        words.add(new Word("kenekaku","Seven",R.drawable.number_seven));
        words.add(new Word("kawinta","Eight",R.drawable.number_eight));
        words.add(new Word("wo' e","Nine",R.drawable.number_eight));
        words.add(new Word("na' aacha","Ten",R.drawable.number_ten));

//        LinearLayout rootview = (LinearLayout)findViewById(R.id.rootview);
//        int index=0;
//        while(index <words.size()){
//            TextView wordview = new TextView(this);
//            wordview.setText(words.get(index));
//            rootview.addView(wordview);
//            index++;
//        }
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView)findViewById(R.id.rootview);
        listView.setAdapter(adapter);
     }
}