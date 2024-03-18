package com.akkobana.habittracker.data

interface Mapper<DOMAIN, DATA> {
    fun toDomain(data: DATA): DOMAIN
    fun toData(domain: DOMAIN): DATA
}