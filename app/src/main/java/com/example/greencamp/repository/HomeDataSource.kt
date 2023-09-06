package com.example.greencamp.repository

import com.example.greencamp.model.HomeData

interface HomeDataSource {

    fun getHomeData(): HomeData?
}
