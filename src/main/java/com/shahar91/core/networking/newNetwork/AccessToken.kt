package com.shahar91.core.networking.newNetwork

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by dietervaesen on 24/01/18.
 */
open class AccessToken : RealmObject() {
    @PrimaryKey
    var id: Int = 0
    @Expose
    var token_type: String? = null
    @Expose
    var expires_in: Long = 0
    @Expose
    var access_token: String? = null
    @Expose
    var refresh_token: String? = null

}