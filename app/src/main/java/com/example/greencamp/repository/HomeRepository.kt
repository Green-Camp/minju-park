package com.example.greencamp.repository

import com.example.greencamp.HomeData

class HomeRepository(
    private val assetDataSource: HomeAssetDataSource,
) {

    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }
}
