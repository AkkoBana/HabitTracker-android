package com.akkobana.habittracker.data.local.sharedpref.account

import android.content.Context
import com.akkobana.habittracker.data.local.dto.account.TokenDto
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class AccountPrefImpl (
    private val context: Context,
): AccountPref {
    private val sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    private val editor = sharedPreferences.edit()

    override var jwtToken: TokenDto?
        get() {
            val string = sharedPreferences.getString(JWT_TOKEN, "")

            return try {
                if(string != null) Json.decodeFromString<TokenDto>(string)
                else null
            } catch(e: Exception) {
                null
            }
        }
        set(value) {
            val tokenString = try {
                if(value != null) Json.encodeToString(value) else ""
            } catch (e:Exception) {
                ""
            }
            editor.putString(JWT_TOKEN, tokenString)
        }

    private companion object {
        const val SHARED_PREF_NAME = "account"
        const val JWT_TOKEN = "jwtToken"
    }
}