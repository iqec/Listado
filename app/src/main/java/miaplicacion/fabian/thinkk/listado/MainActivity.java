package miaplicacion.fabian.thinkk.listado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] elementos = {"Hmtl","Java","Jquery","MySQL"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,elementos);
        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { //automatica mente me implemente en ontiemclickcadpater
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView vista = (TextView)view.findViewById(R.id.listview);
                Toast.makeText(getApplicationContext()v,getText(), Toast.LENGTH_SHORT).show();


        });
    }
}
