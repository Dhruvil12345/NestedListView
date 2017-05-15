package com.example.android.nestedlistview2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Urmil on 3/11/2017.
 */

public class ListView1 extends Activity {
    ListView list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1 = (ListView)findViewById(R.id.list1);
        String[] s = new String[] {"GeeksForGeeks","TutorialsPoint","W3School"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,s);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent f = new Intent(ListView1.this,list3.class);
                        startActivity(f);
                        break;
                    case 1:
                        Intent r = new Intent(ListView1.this,list2.class);
                        startActivity(r);
                        break;
                    case 2:
                        Intent u = new Intent(ListView1.this,list4.class);
                        startActivity(u);
                        break;
                }
            }
        });

    }
}
