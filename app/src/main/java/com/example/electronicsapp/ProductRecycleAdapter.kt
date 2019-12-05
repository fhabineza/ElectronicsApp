package com.example.electronicsapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class ProductRecycleViewAdapter :
    RecyclerView.Adapter<ProductRecycleViewAdapter.ProductViewHolder>() {
    private var items: List<ProductModel> = ArrayList<ProductModel>()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductRecycleViewAdapter.ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_list,
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(
        holder: ProductRecycleViewAdapter.ProductViewHolder,
        position: Int
    ) {
        when (holder) {
            is ProductViewHolder -> {
                holder.bind(items.get(position))
            }
        }

        holder.parentlayout.setOnClickListener(View.OnClickListener {
            Toast.makeText(it.getContext(), "", Toast.LENGTH_SHORT).show();
            val intent = Intent(it.context, ProdDetailActivity::class.java)


            intent.putExtra("image", items.get(position).image)
            intent.putExtra("name", items.get(position).title)
            intent.putExtra("price", items.get(position).price)
            intent.putExtra("color", items.get(position).color)

            intent.putExtra("desc", items.get(position).desc)

            intent.putExtra("id", items.get(position).id)

            it.context.startActivity(intent)
        })


    }

    //
    override fun getItemCount(): Int {
        return items.size
    }


    fun submitList(productList: List<ProductModel>) {
        items = productList
    }

    class ProductViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val prodImg = itemView.pimg
        val prodTitle = itemView.ptitle
        val prodPrice = itemView.tPrice
        val prodColor = itemView.pcolor

        var parentlayout: RelativeLayout = itemView.findViewById(R.id.rLayout) as RelativeLayout


        fun bind(product: ProductModel) {

            prodImg.setImageResource(product.image)
            prodTitle.setText(product.title)
            prodPrice.setText("Price : ${product.price.toString()}")
            prodColor.setText("Color : ${product.color}")


        }
    }
}