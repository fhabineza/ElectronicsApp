package com.example.electronicsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prod_detail.*
import kotlinx.android.synthetic.main.activity_prod_detail.pcolor
import kotlinx.android.synthetic.main.activity_prod_detail.pimg
import kotlinx.android.synthetic.main.activity_prod_detail.ptitle
import kotlinx.android.synthetic.main.item_list.*


class ProdDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prod_detail)

        // To avoid application crash check intent has data or not
        if (intent.hasExtra("image") && intent.hasExtra("name") && intent.hasExtra("desc") && intent.hasExtra("id")) {
            var ig = intent.getIntExtra("image", 0)
            var t1 = intent.getStringExtra("name")
            var t2 = intent.getStringExtra("color")
            var t3 = intent.getStringExtra("desc")
  var t4 = intent.getStringExtra("id")



            pimg.setImageResource(ig)
            ptitle.text = t1?.toString()
            pcolor.text = "Color : ${t2?.toString()}"
         pid.text = "Walmart # : ${t4?.toString()}"
            pdesc.text = "Item Description : \n\n" +
                    "${t3?.toString()}"




        }

    }
}
