package latihan.kotlin.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val language: Array<String> = resources.getStringArray(R.array.technology_list)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language)
        listView.adapter = arrayAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{
                adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()

        }
    }
}
