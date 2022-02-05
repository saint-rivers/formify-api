package com.saintrivers.formify.profile

import org.springframework.data.domain.Page
import org.springframework.stereotype.Service

@Service
class ProfileServiceImpl : ProfileService {
    override val findPagedProfile: Page<Profile>
        get() {
            return Page.empty()
        }
}