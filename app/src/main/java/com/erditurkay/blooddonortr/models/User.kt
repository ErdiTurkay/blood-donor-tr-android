package com.erditurkay.blooddonortr.models

import com.google.gson.annotations.SerializedName

data class UserURL(
    @SerializedName("status")
    val status: String,
    @SerializedName("results")
    val results: Int,
    @SerializedName("data")
    val data: ArrayList<User> = arrayListOf()
)

data class User (
    @SerializedName("name")
    var name        : String,
    @SerializedName("surname")
    var surname     : String,
    @SerializedName("mail")
    var mail        : String,
    @SerializedName("password")
    var password    : String,
    @SerializedName("phone")
    var phone       : String,
    @SerializedName("bloodGroup")
    var bloodGroup  : String,
    @SerializedName("dateOfBirth")
    var dateOfBirth : String,
    @SerializedName("tcID")
    var tcID        : String
)

data class GelenUser (
    @SerializedName("createdAt")
    var createdAt        : String,
    @SerializedName("__id")
    var __id        : String,
    @SerializedName("name")
    var name        : String,
    @SerializedName("surname")
    var surname     : String,
    @SerializedName("mail")
    var mail        : String,
    @SerializedName("password")
    var password    : String,
    @SerializedName("phone")
    var phone       : String,
    @SerializedName("bloodGroup")
    var bloodGroup  : String,
    @SerializedName("dateOfBirth")
    var dateOfBirth : String,
    @SerializedName("tcID")
    var tcID        : String,
    @SerializedName("__v")
    var __v         : String
)

data class YeniUser(
    @SerializedName("name")
    var name        : String
)

data class UserResponse(
    @SerializedName("status" )
    var status : String,
    @SerializedName("data"   )
    var data   : Data
)

data class Data(
    @SerializedName("user")
    var user: GelenUser
)