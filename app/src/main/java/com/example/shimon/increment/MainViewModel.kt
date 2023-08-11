package com.example.shimon.increment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var score: Int = 0

    var _score = MutableLiveData<Int>()
    val myScore : LiveData<Int> = _score

    fun increment(){
        _score.postValue(score++)

        Log.d("TAG","Increment: $score")

    }



}