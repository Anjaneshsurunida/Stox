package uk.ac.tees.mad.stox.time

import com.google.android.gms.tasks.Task
import com.google.android.gms.time.TrustedTimeClient

interface TrustedTimeClientAccessor {
    fun createClient(): Task<TrustedTimeClient>
}