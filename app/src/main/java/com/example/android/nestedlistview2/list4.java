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

public class list4 extends Activity {
    ListView list4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list4);
        list4 = (ListView)findViewById(R.id.list4);
        String[] a = new String[] {"HTML","CSS","JAVASCRIPT","GRAPHICS"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,a);
        list4.setAdapter(adapter3);
        list4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        Intent q = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/html/default.asp"));
                        startActivity(q);
                        break;
                    case 1:
                        Intent w = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.w3schools.com/css/default.asp"));
                        startActivity(w);
                        break;
                    case 2 :
                        Intent e = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.w3schools.com/js/default.asp"));
                        startActivity(e);
                        break;
                    case 3:
                        Intent r = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.w3schools.com/graphics/default.asp"));
                        startActivity(r);
                        break;

                }
            }
        });
    }
}
