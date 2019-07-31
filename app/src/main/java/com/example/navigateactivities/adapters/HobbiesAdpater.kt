package com.example.navigateactivities.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.navigateactivities.models.Hobby
import com.example.navigateactivities.R
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdpater(var context: Context, private var hobbies: List<Hobby>) :
    RecyclerView.Adapter<HobbiesAdpater.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return hobbies.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var hobby = hobbies[position]
        holder.setData(hobby, position)

    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentHobby: Hobby? = null
        var currentPosition: Int? = null

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, "${currentHobby!!.title} is clicked", Toast.LENGTH_SHORT).show()
            }
            itemView.imageView.setOnClickListener {
                var message = "My hobby is: ${currentHobby!!.title}"
                var intent = Intent()
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.action = Intent.ACTION_SEND
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent, "Share with chooser"))
            }
        }

        fun setData(hobby: Hobby?, position: Int) {
            itemView.titleView.text = hobby!!.title
            currentHobby = hobby
            currentPosition = position
        }
    }
}
