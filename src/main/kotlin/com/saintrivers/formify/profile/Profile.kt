package com.saintrivers.formify.profile

import javax.persistence.*

@Entity
@Table(name = "profile")
open class Profile(

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    open var id: String,

    @Column(name = "firstname")
    open var firstname: String,

    @Column(name = "lastname")
    open var lastname: String
)
