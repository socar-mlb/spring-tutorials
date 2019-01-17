package org.inframincer.psa

import javax.validation.constraints.Email
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty

class Event {
    var id: Int = 0

    @NotEmpty
    var title: String = ""

    @Min(0)
    var limit: Int = 0

    @Email
    var email: String = ""
}
