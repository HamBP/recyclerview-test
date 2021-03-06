package org.algosketch.datebindingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.algosketch.datebindingtest.databinding.ItemExampleBinding

class ExampleAdapter(private val viewModel: MainViewModel) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {
    lateinit var exampleList: List<ExampleItem>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        return ExampleViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.bind(viewModel, exampleList[position])
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder private constructor(val binding: ItemExampleBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(viewModel: MainViewModel, item: ExampleItem) {
            binding.item = item
            binding.viewModel = viewModel
            binding.executePendingBindings()
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