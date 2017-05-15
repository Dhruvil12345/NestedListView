package com.example.android.nestedlistview2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Urmil on 3/11/2017.
 */

public class list3 extends Activity {
    ListView list3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list3);
        list3 = (ListView)findViewById(R.id.list3);
        String [] a = new String[] {"C","C++","JAVA","DATA STRUCTURE"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,a);
        list3.setAdapter(adapter2);
        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0 :
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.geeksforgeeks.org/c/"));
                        startActivity(i);
                        break;
                    case 1:
                        Intent e = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.geeksforgeeks.org/c-plus-plus/"));
                        startActivity(e);
                        break;
                    case 2:
                        Intent q = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.geeksforgeeks.org/java/"));
                        startActivity(q);
                        break;
                    case 3:
                        Intent w = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.geeksforgeeks.org/data-structures/"));
                        startActivity(w);
                        break;
                }
            }
        });
    }
}
