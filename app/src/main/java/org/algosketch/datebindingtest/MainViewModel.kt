package org.algosketch.datebindingtest

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val dummyList = listOf(
        ExampleItem("아무말1"),
        ExampleItem("아무말2"),
        ExampleItem("아무말3"),
        ExampleItem("아무말4"),
        ExampleItem("아무말5"),
    )
}