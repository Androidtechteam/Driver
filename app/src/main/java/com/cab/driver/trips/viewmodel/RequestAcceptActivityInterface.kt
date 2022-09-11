package com.cab.driver.trips.viewmodel

import androidx.lifecycle.LiveData
import com.cab.driver.common.model.JsonResponse

interface RequestAcceptActivityInterface {

    fun onSuccessResponse(jsonResponse: LiveData<JsonResponse>)
    fun onFailureResponse(jsonResponse: LiveData<JsonResponse>)

}