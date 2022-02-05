package com.saintrivers.formify.profile

import org.springframework.data.domain.Page

interface ProfileService {
    fun findPagedProfile(): Page<Profile>
}