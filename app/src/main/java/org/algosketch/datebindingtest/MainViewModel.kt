package org.algosketch.datebindingtest

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val dummyList = listOf(
        ExampleItem("아무말1"),
        ExampleItem("아무말2"),
        ExampleItem("아무말3"),
        ExampleItem("아무말4"),
        ExampleItem("아무말5"),
    )

    fun showToastMessage(view: View, text: String) {
        Toast.makeText(view.context, text, Toast.LENGTH_SHORT).show()
    }
}