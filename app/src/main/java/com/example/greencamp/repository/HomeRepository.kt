package com.example.greencamp.repository

import com.example.greencamp.model.HomeData

class HomeRepository(
    private val assetDataSource: HomeAssetDataSource,
) {

    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }
}
