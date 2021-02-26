package dev.wirespec.hopeforpaws.da.web

import dev.wirespec.hopeforpaws.models.PetListItemInfo
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Retrofit API declarations.
 * NOTE: If a path starts with a forward slash, it means that it is relative to the root domain. Without a prefixed forward slash, the path is appended to whatever
 * the base url is set to.
 */
interface HopeForPawsWebAPI {

    /**
     * Retrieves a list of pets.
     */
    @GET("getPets")
    fun getPets(@Query("sp") startPos: Int, @Query("ps") pageSize: Int, @Query("sd") sortDirection: String): List<PetListItemInfo>
}