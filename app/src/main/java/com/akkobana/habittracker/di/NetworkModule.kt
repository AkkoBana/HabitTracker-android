package com.akkobana.habittracker.di

import com.chuckerteam.chucker.api.ChuckerInterceptor
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.URLBuilder
import io.ktor.http.URLProtocol
import io.ktor.http.takeFrom
import org.koin.dsl.module
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

val networkModule = module {
    single<HttpClient> {
        HttpClient(OkHttp) {
            defaultRequest {
                host =
                url {
                    protocol = URLProtocol.HTTPS
                }
            }
            install(ContentNegotiation) {
                json(
                    Json {
                        prettyPrint = true
                        ignoreUnknownKeys = true
                    }
                )
            }
            install(Logging) {

            }
            engine {
                config {
                    addNetworkInterceptor(ChuckerInterceptor(get()))
                    this.
                }


            }
        }
    }

}