package org.algosketch.datebindingtest

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("app:items")
fun setList(recyclerView: RecyclerView, items: List<ExampleItem>?) {
    items?.let {
        (recyclerView.adapter as ExampleAdapter).exampleList = items
    }
}