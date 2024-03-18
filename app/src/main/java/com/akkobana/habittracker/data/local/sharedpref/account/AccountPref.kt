package com.akkobana.habittracker.data.local.sharedpref.account

import com.akkobana.habittracker.data.local.dto.account.TokenDto

interface AccountPref {

    var jwtToken: TokenDto?

}