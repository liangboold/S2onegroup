package com.bawei.arouter.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.alibaba.android.arouter.launcher.ARouter

//@Route(path = ConfigConstants)
class KotlinTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        //注入ARouter
        ARouter.getInstance().inject(this)
    }
}