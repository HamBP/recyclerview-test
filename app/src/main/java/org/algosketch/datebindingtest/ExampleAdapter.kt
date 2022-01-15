package org.algosketch.datebindingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.algosketch.datebindingtest.databinding.ItemExampleBinding

class ExampleAdapter : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {
    lateinit var exampleList: List<ExampleItem>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        return ExampleViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.bind(exampleList[position])
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder private constructor(val binding: ItemExampleBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ExampleItem) {
            binding.item = item
        }

        companion object {
            fun from(parent: ViewGroup) : ExampleViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemExampleBinding.inflate(layoutInflater, parent, false)

                return ExampleViewHolder(binding)
            }
        }
    }
}