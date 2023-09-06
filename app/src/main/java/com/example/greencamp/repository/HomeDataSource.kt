package com.example.greencamp.repository

import com.example.greencamp.HomeData

interface HomeDataSource {

    fun getHomeData(): HomeData?
}
