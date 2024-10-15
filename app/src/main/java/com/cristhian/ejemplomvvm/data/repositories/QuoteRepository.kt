package com.cristhian.ejemplomvvm.data.repositories

import com.cristhian.ejemplomvvm.data.model.QuoteModel
import com.cristhian.ejemplomvvm.data.model.QuoteProvider
import com.cristhian.ejemplomvvm.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}