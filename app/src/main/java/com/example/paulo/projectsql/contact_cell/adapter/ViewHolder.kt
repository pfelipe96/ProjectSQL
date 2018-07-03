package com.example.paulo.projectsql.contact_cell.adapter

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.example.paulo.projectsql.BR


class ViewHolder(val itemDataBinding: ViewDataBinding): RecyclerView.ViewHolder(itemDataBinding.root) {


    fun bind(model: ItemViewModel){
        itemDataBinding?.setVariable(BR.viewModel, model)
    }

    fun getViewDataBinding(): ViewDataBinding = itemDataBinding
}