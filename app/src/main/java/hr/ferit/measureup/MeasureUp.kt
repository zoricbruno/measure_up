package hr.ferit.measureup

import android.app.Application
import hr.ferit.measureup.di.sensorsModule
import hr.ferit.measureup.di.viewmodelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MeasureUp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MeasureUp)
            modules(viewmodelModule, sensorsModule)
        }
    }
}
