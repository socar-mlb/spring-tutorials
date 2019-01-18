package org.inframincer.psa

import java.beans.PropertyEditorSupport

class EventEditor : PropertyEditorSupport() {

    override fun setAsText(text: String?) {
        value = Event(Integer.parseInt(text))
    }

    override fun getAsText(): String {
        val event = value as Event
        return event.id.toString()
    }
}
