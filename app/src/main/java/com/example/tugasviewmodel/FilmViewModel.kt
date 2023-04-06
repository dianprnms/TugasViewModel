package com.example.tugasviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {

    val list = arrayListOf(
        DataFilm(R.drawable.su, "Start Up", "12 Oktober 2020"),
        DataFilm(R.drawable.hmt, "Hometown Cha-Cha", "28 Agustus 2021"),
        DataFilm(R.drawable.gd, "Ghost Doctor", "3 Januari 2022"),
        DataFilm(R.drawable.ic, "Itaewon Class", "21 Januari 2020"),
        DataFilm(R.drawable.bp, "Business Proposal", "28 Februari 2022"),
        DataFilm(R.drawable.mn, "My Name", "15 Oktober 2021"),
        DataFilm(R.drawable.v, "Vincenzo", "20 Februari 2021"),
        DataFilm(R.drawable.pu, "Police University", "9 Agustus 2021"),
        DataFilm(R.drawable.td, "Taxi Driver", "16 April 2021"),
        DataFilm(R.drawable.cl, "CLOY", "14 Desember 2019")

    )

    val filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getFilmList(){
        var stu = list
        filmList.value = stu
    }
}